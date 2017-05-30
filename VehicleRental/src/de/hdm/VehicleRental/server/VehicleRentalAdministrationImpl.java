package de.hdm.VehicleRental.server;

import java.sql.Date;
import java.util.Vector;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;

import de.hdm.VehicleRental.shared.bo.MemoryList;
import de.hdm.VehicleRental.shared.bo.Profile;
import de.hdm.VehicleRental.shared.bo.Vehicle;
import de.hdm.VehicleRental.server.db.VehicleMapper;
import de.hdm.VehicleRental.server.db.MemoryListMapper;
import de.hdm.VehicleRental.server.db.ProfileMapper;
import de.hdm.VehicleRental.server.db.ReservationMapper;

/**
 * 
 * <p>
 * Implementierungsklasse des Interface <code>BankAdministration</code>. Diese
 * Klasse ist <em>die</em> Klasse, die neben {@link ReportGeneratorImpl}
 * sämtliche Applikationslogik (oder engl. Business Logic) aggregiert. Sie ist
 * wie eine Spinne, die sämtliche Zusammenhänge in ihrem Netz (in unserem Fall
 * die Daten der Applikation) überblickt und für einen geordneten Ablauf und
 * dauerhafte Konsistenz der Daten und Abläufe sorgt.
 * </p>
 * <p>
 * Die Applikationslogik findet sich in den Methoden dieser Klasse. Jede dieser
 * Methoden kann als <em>Transaction Script</em> bezeichnet werden. Dieser Name
 * lässt schon vermuten, dass hier analog zu Datenbanktransaktion pro
 * Transaktion gleiche mehrere Teilaktionen durchgeführt werden, die das System
 * von einem konsistenten Zustand in einen anderen, auch wieder konsistenten
 * Zustand überführen. Wenn dies zwischenzeitig scheitern sollte, dann ist das
 * jeweilige Transaction Script dafür verwantwortlich, eine Fehlerbehandlung
 * durchzuführen.
 * </p>
 * <p>
 * Diese Klasse steht mit einer Reihe weiterer Datentypen in Verbindung. Dies
 * sind:
 * <ol>
 * <li>{@link BankAdministration}: Dies ist das <em>lokale</em> - also
 * Server-seitige - Interface, das die im System zur Verfügung gestellten
 * Funktionen deklariert.</li>
 * <li>{@link BankAdministrationAsync}: <code>BankVerwaltungImpl</code> und
 * <code>BankAdministration</code> bilden nur die Server-seitige Sicht der
 * Applikationslogik ab. Diese basiert vollständig auf synchronen
 * Funktionsaufrufen. Wir müssen jedoch in der Lage sein, Client-seitige
 * asynchrone Aufrufe zu bedienen. Dies bedingt ein weiteres Interface, das in
 * der Regel genauso benannt wird, wie das synchrone Interface, jedoch mit dem
 * zusätzlichen Suffix "Async". Es steht nur mittelbar mit dieser Klasse in
 * Verbindung. Die Erstellung und Pflege der Async Interfaces wird durch das
 * Google Plugin semiautomatisch unterstützt. Weitere Informationen unter
 * {@link BankAdministrationAsync}.</li>
 * <li>{@link RemoteServiceServlet}: Jede Server-seitig instantiierbare und
 * Client-seitig über GWT RPC nutzbare Klasse muss die Klasse
 * <code>RemoteServiceServlet</code> implementieren. Sie legt die funktionale
 * Basis für die Anbindung von <code>BankVerwaltungImpl</code> an die Runtime
 * des GWT RPC-Mechanismus.</li>
 * </ol>
 * </p>
 * <p>
 * <b>Wichtiger Hinweis:</b> Diese Klasse bedient sich sogenannter
 * Mapper-Klassen. Sie gehören der Datenbank-Schicht an und bilden die
 * objektorientierte Sicht der Applikationslogik auf die relationale
 * organisierte Datenbank ab. Zuweilen kommen "kreative" Zeitgenossen auf die
 * Idee, in diesen Mappern auch Applikationslogik zu realisieren. Siehe dazu
 * auch die Hinweise in {@link #delete(Customer)} Einzig nachvollziehbares
 * Argument für einen solchen Ansatz ist die Steigerung der Performance
 * umfangreicher Datenbankoperationen. Doch auch dieses Argument zieht nur dann,
 * wenn wirklich große Datenmengen zu handhaben sind. In einem solchen Fall
 * würde man jedoch eine entsprechend erweiterte Architektur realisieren, die
 * wiederum sämtliche Applikationslogik in der Applikationsschicht isolieren
 * würde. Also, keine Applikationslogik in die Mapper-Klassen "stecken" sondern
 * dies auf die Applikationsschicht konzentrieren!
 * </p>
 * <p>
 * Beachten Sie, dass sämtliche Methoden, die mittels GWT RPC aufgerufen werden
 * können ein <code>throws IllegalArgumentException</code> in der
 * Methodendeklaration aufweisen. Diese Methoden dürfen also Instanzen von
 * {@link IllegalArgumentException} auswerfen. Mit diesen Exceptions können z.B.
 * Probleme auf der Server-Seite in einfacher Weise auf die Client-Seite
 * transportiert und dort systematisch in einem Catch-Block abgearbeitet werden.
 * </p>
 * <p>
 * Es gibt sicherlich noch viel mehr über diese Klasse zu schreiben. Weitere
 * Infos erhalten Sie in der Lehrveranstaltung.
 * </p>
 * 
 * @see BankAdministration
 * @see BankAdministrationAsync
 * @see RemoteServiceServlet
 * @author Thies
 * 
 * @author
 */
public class VehicleRentalAdministrationImpl extends RemoteServiceServlet implements VehicleRentalAdministration {

	public VehicleRentalAdministrationImpl() throws IllegalArgumentException {
		/*
		 * Eine weitergehende Funktion muss der No-Argument-Constructor nicht
		 * haben. Er muss einfach vorhanden sein.
		 */
	}

	/**
	 * 
	 * Referenz auf die Mapper, die Daten mit der Datenbank abgleichen.
	 * 
	 */
	private ProfileMapper profileMapper = null;
	private ReservationMapper reservationMapper = null;
	private VehicleMapper vehicleMapper = null;
	// private MemoryListMapper memoryListMapper = null;

	/**
	 * Diese Methode initialisiert die Applikationslogik und startet dabei die
	 * Mapper
	 */
	public void init() throws IllegalArgumentException {

		this.vehicleMapper = VehicleMapper.vehicleMapper();
		this.profileMapper = ProfileMapper.profileMapper();
		this.reservationMapper = ReservationMapper.reservationMapper();
		// this.memoryListMapper = MemoryListMapper.memoryListMapper();
	}

	/*
	 * *************************************************************************
	 * ** ABSCHNITT, Beginn: Methoden f�r Profile-Objekte
	 * *************************************************************************
	 * **
	 */

	public Profile createProfile(String firstName, String lastName, String email) {
		Profile p = new Profile();
		p.setFirstName(firstName);
		p.setLastName(lastName);
		p.setEmail(email);
		return p;
	}

	/**
	 * 
	 * Auslesen des Kontos mit einer bestimmten Id
	 * 
	 * @param profileID
	 * @return
	 */
	public Profile getProfileById(int profileID) throws IllegalArgumentException {
		Profile p = new Profile();
		p = profileMapper.findByID(profileID);

		Vector<Vehicle> vehicles = new Vector<>();
		vehicles = reservationMapper.findAllVehiclesByProfile(p);
		for (Vehicle vehicle : vehicles) {
			vehicle = vehicleMapper.findByID(vehicle.getID());
			p.addVehicleToReservation(vehicle);
		}
		return p;
	}

	/**
	 * 
	 * Speichern eines Kontos.
	 * 
	 * @param reservationID
	 */
	public Profile save(Profile profile) throws IllegalArgumentException {

		// Existiert das Profil schon?
		if (profileMapper.findByID(profile.getID()) != null) {
			// Profil existiert schon und muss nur geändert werden
			profileMapper.update(profile);
			
			/**
			 * TODO: erst prüfen ob ein Eintrag bereits existiert, wenn nein,
			 * dann eintrag schreiben sollte er berteits existieren, dann tue
			 * nichts
			 */
			Vector<Vehicle> vehicleVector = new Vector<>();
			vehicleVector = profile.getReservations();
			
			for (Vehicle vehicle : vehicleVector) {
			
			if (vehicle.equals(vehicleMapper.findByID(vehicle.getID()))){
				break;
			} else
					profile.addVehicleToReservation(vehicle);
					vehicle.addProfileToReservation(profile);
					reservationMapper.insert(vehicle, profile);
			}
			
			// Profil existiert noch nicht und muss angelegt werden
			profileMapper.insert(profile);
		}
		return profile;
	}

	/**
	 * 
	 * Löschen eines Kunden. Natürlich würde ein reales System zur Verwaltung
	 * von Bankkunden ein Löschen allein schon aus Gründen der Dokumentation
	 * nicht bieten, sondern deren Status z.B von "aktiv" in "ehemalig" ändern.
	 * Wir wollen hier aber dennoch zu Demonstrationszwecken eine Löschfunktion
	 * vorstellen.
	 * 
	 * @param profileID
	 */
	public void delete(Profile profile) throws IllegalArgumentException {
		
		reservationMapper.deleteAllReserverationsOfProfile(profile);
		profileMapper.delete(profile);
	}

	/**
	 * 
	 * Auslesen aller Kunden.
	 * 
	 * @return
	 */
	public Vector<Profile> getAllProfiles() throws IllegalArgumentException {
		return profileMapper.getAllProfiles();
	}

	/*
	 * *************************************************************************
	 * ** ABSCHNITT, Beginn: Methoden f�r Vehicle-Objekte
	 * *************************************************************************
	 * **
	 */

	/**
	 * 
	 * Auslesen des Kontos mit einer bestimmten Id
	 * 
	 * @param profileID
	 * @return
	 */
	public Vehicle getVehicleById(int vehicleID) throws IllegalArgumentException {
		Vehicle v = new Vehicle();
		v = vehicleMapper.findByID(vehicleID);

		Vector<Profile> profiles = new Vector<>();
		profiles = reservationMapper.findAllProfilesByVehicle(v);
		for (Profile profile : profiles) {
			profile = profileMapper.findByID(profile.getID());
			v.addProfileToReservation(profile);
		}
		return v;
	}

	/**
	 * 
	 * Auslesen sämtlicher Konten dieses Systems.
	 * 
	 * @return
	 */
	public Vector<Vehicle> getAllVehicles() throws IllegalArgumentException {
		return vehicleMapper.getAllVehicles();
	}

	/*
	 * *************************************************************************
	 * ** ABSCHNITT, Beginn: Methoden f�r Reservation-Objekte
	 * *************************************************************************
	 * **
	 */

	/**
	 * 
	 * Speichern eines Kontos.
	 * 
	 * @param reservationID
	 */

	/**
	 * MIT DATE
	 */
	public void save2(Reservation reservationID) throws IllegalArgumentException {

		// Pr�fen, ob Reservation schon existiert
		if (reservationMapper.getID(reservationID.getID()) != null) {
			// Der Merkzettel existiert bereits
			reservationMapper.update(reservationID);
			// Der Merkzettel existiert noch nicht
		} else {
			reservationMapper.insert(reservationID.getVehicle(), reservationID.getProfil(), reservationID.getDate());
		}
	}

	

	/**
	 * 
	 * @param reservationNumber
	 * @param vehicleNumber
	 * @param date
	 * @param profileID
	 * @return
	 */
	public void createReservation(Vehicle vehicle, Profile profile) {
		//TODO existiert schon verbindung wenn nein insert wenn ja update
		
		// Existiert das Profil schon?
		if (profileMapper.findByID(profile.getID()) != null) {
			// Profil existiert schon und muss nur geändert werden
			profileMapper.update(profile);
		
		
		if (reservationMapper.findByID(profile.getReservations().contains(vehicle)) != null) {
				// Profil existiert schon und muss nur geändert werden
				profileMapper.update(profile);
		
		
		reservationMapper.insert(vehicle, profile);
	}

	/**
	 * 
	 * Löschen der übergebenen Buchung. Beachten Sie bitte auch die Anmerkungen
	 * zu {@link #delete(Customer)} und {@link #delete(Account)}.
	 * 
	 * @see #delete(Customer)
	 * @see #delete(Account)
	 * 
	 * @param reservationID
	 */
	public void delete(Reservation reservationID) throws IllegalArgumentException {
		reservationMapper.delete(reservationID);
	}

	/*
	 * *************************************************************************
	 * ** ABSCHNITT, Beginn: Methoden f�r MemoryList-Objekte
	 * *************************************************************************
	 * **
	 */

	// /**
	// *
	// * @param memoryListID
	// * @return
	// */
	// public MemoryList createMemoryList(MemoryList memoryListID) {
	// // TODO Auto-generated method
	// return null;
	// }

	// /**
	// *
	// * @param profileID
	// * @param vehicleID
	// * @return
	// */
	// public MemoryList insertToMemoryList(int profileID, int vehicleID) {
	// // TODO Auto-generated method
	// return null;
	// }

	// /**
	// *
	// * @param memoryListID
	// */
	// public void delete(MemoryList memoryListID) throws
	// IllegalArgumentException {
	// memoryListMapper.delete(memoryListID);
	// }

	// /**
	// *
	// * @param vehicleID
	// * @return
	// */
	// public MemoryList deleteFromMemoryList(int vehicleID) throws
	// IllegalArgumentException {
	// MemoryListMapper.memoryListMapper().deleteVehicleFromList(memoryListMapper.findByVehicleID(vehicleID),
	// vehicleID);
	// return null;
	// }

	// /**
	// *
	// * @param memoryListID
	// */
	// public void save(MemoryList memoryListID) throws IllegalArgumentException
	// {
	//
	// // Existiert das Profil schon?
	// if (MemoryListMapper.getID(memoryListID.getID()) != null) {
	// // Profil existiert schon und muss nur geändert werden
	// MemoryListMapper.update(memoryListID);
	// } else {
	// // Profil existiert noch nicht und muss angelegt werden
	// MemoryListMapper.insert(memoryListID);
	// }
	// }

}
