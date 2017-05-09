package de.hdm.VehicleRental.shared;

import de.hdm.VehicleRental.server.MemoryListMapper;
import de.hdm.VehicleRental.server.Profile;
import de.hdm.VehicleRental.server.ProfileMapper;
import de.hdm.VehicleRental.server.RemoteServiceServlet;
import de.hdm.VehicleRental.server.Reservation;
import de.hdm.VehicleRental.server.ReservationMapper;
import de.hdm.VehicleRental.server.VehicleMapper;
import de.hdm.VehicleRental.server.VehicleRental;
import de.hdm.VehicleRental.server.db.MemoryList;

import com.google.gwt.user.client.rpc.AsyncCallback;

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
 * <li> {@link RemoteServiceServlet}: Jede Server-seitig instantiierbare und
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
 
 * @author
 */
public interface VehicleRentalAdministrationAsync  {

	/**
	 * 
	   * Referenz auf das zugehörige Bank-Objekt.
	   
	 */
	private VehicleRental vehicleRental;
	/**
	 * 
	   * Referenz auf den DatenbankMapper, der Kundenobjekte mit der Datenbank
	   * abgleicht.
	   
	 */
	private ProfileMapper profileMapper;
	/**
	 * 
	   * Referenz auf den DatenbankMapper, der Kontoobjekte mit der Datenbank
	   * abgleicht.
	   
	 */
	private VehicleMapper vehicleMapper;
	/**
	 * 
	   * Referenz auf den TransactionMapper, der Buchungsobjekte mit der Datenbank
	   * abgleicht.
	   
	 */
	private MemoryListMapper memoryListMapper;
	/**
	 * 
	 */
	private ReservationMapper reservationMapper;
	/**
	 * Getter of vehicleRental
	 */
	public VehicleRental getVehicleRental() {
	 	 return vehicleRental; 
	}
	/**
	 * Setter of vehicleRental
	 */
	public void setVehicleRental(VehicleRental vehicleRental) { 
		 this.vehicleRental = vehicleRental; 
	}
	/**
	 * Getter of profileMapper
	 */
	public ProfileMapper getProfileMapper() {
	 	 return profileMapper; 
	}
	/**
	 * Setter of profileMapper
	 */
	public void setProfileMapper(ProfileMapper profileMapper) { 
		 this.profileMapper = profileMapper; 
	}
	/**
	 * Getter of vehicleMapper
	 */
	public VehicleMapper getVehicleMapper() {
	 	 return vehicleMapper; 
	}
	/**
	 * Setter of vehicleMapper
	 */
	public void setVehicleMapper(VehicleMapper vehicleMapper) { 
		 this.vehicleMapper = vehicleMapper; 
	}
	/**
	 * Getter of memoryListMapper
	 */
	public MemoryListMapper getMemoryListMapper() {
	 	 return memoryListMapper; 
	}
	/**
	 * Setter of memoryListMapper
	 */
	public void setMemoryListMapper(MemoryListMapper memoryListMapper) { 
		 this.memoryListMapper = memoryListMapper; 
	}
	/**
	 * Getter of reservationMapper
	 */
	public ReservationMapper getReservationMapper() {
	 	 return reservationMapper; 
	}
	/**
	 * Setter of reservationMapper
	 */
	public void setReservationMapper(ReservationMapper reservationMapper) { 
		 this.reservationMapper = reservationMapper; 
	}
	/**
	 * 
	   * Auslesen aller Kunden.
	   
	 * @param callback 
	 */
	public void getAllProfiles(AsyncCallback callback) { 
		// TODO Auto-generated method
	 }
	/**
	 * 
	 * @param reservationNumber 
	 * @param vehicleNumber 
	 * @param date 
	 * @param profileID 
	 */
	public void createReservation(int reservationNumber, int vehicleNumber, EDate date, int profileID) { 
		// TODO Auto-generated method
	 }
	/**
	 * 
	 * @param reservationID 
	 * @param callback 
	 */
	public void update(Reservation reservationID, AsyncCallback callback) { 
		// TODO Auto-generated method
	 }
	/**
	 * 
	 * @param profileID 
	 * @param callback 
	 */
	public void getMemoryList(int profileID, AsyncCallback callback) { 
		// TODO Auto-generated method
	 }
	/**
	 * 
	   * Löschen eines Kunden. Natürlich würde ein reales System zur Verwaltung von
	   * Bankkunden ein Löschen allein schon aus Gründen der Dokumentation nicht
	   * bieten, sondern deren Status z.B von "aktiv" in "ehemalig" ändern. Wir
	   * wollen hier aber dennoch zu Demonstrationszwecken eine Löschfunktion
	   * vorstellen.
	   
	 * @param callback 
	 * @param profileID 
	 */
	public void delete(AsyncCallback callback, Profile profileID) { 
		// TODO Auto-generated method
	 }
	/**
	 * 
	   * Speichern eines Kunden.
	   
	 * @param callback 
	 * @param profileID 
	 */
	public void save(AsyncCallback callback, Profile profileID) { 
		// TODO Auto-generated method
	 }
	/**
	 * 
	 * @param memoryListID 
	 * @param callback 
	 */
	public void createMemoryList(MemoryList memoryListID, AsyncCallback callback) { 
		// TODO Auto-generated method
	 }
	/**
	 * 
	 * @param callback 
	 * @param memoryListID 
	 */
	public void save(AsyncCallback callback, MemoryList memoryListID) { 
		// TODO Auto-generated method
	 }
	/**
	 * 
	   * Auslesen eines Kunden anhand seiner Kundennummer.
	   
	 * @param profileID 
	 * @param callback 
	 */
	public void getProfileByID(int profileID, AsyncCallback callback) { 
		// TODO Auto-generated method
	 }
	/**
	 * 
	   * Speichern eines Kontos.
	   
	 * @param reservationID 
	 * @param callback 
	 */
	public void save(Reservation reservationID, AsyncCallback callback) { 
		// TODO Auto-generated method
	 }
	/**
	 * 
	   * Auslesen sämtlicher Konten dieses Systems.
	   
	 * @param callback 
	 */
	public void getAllVehicles(AsyncCallback callback) { 
		// TODO Auto-generated method
	 }
	/**
	 * 
	   * Löschen des übergebenen Kontos. Beachten Sie bitte auch die Anmerkungen zu
	   * {@link #delete(Customer)}. Beim Löschen des Kontos werden sämtliche damit
	   * in Verbindung stehenden Buchungen gelöscht.
	   * 
	   * @see #delete(Customer)
	   
	 * @param profileID 
	 * @param callback 
	 */
	public void update(Profile profileID, AsyncCallback callback) { 
		// TODO Auto-generated method
	 }
	/**
	 * 
	   * Auslesen der Bank für die diese Bankverwaltung gewissermaßen tätig ist.
	   
	 * @param vehicleID 
	 * @param callback 
	 */
	public void getVehicleByID(int vehicleID, AsyncCallback callback) { 
		// TODO Auto-generated method
	 }
	/**
	 * 
	 * @param callback 
	 * @param profileID 
	 * @param vehicleID 
	 */
	public void insertToMemoryList(AsyncCallback callback, int profileID, int vehicleID) { 
		// TODO Auto-generated method
	 }
	/**
	 * 
	 * @param callback 
	 * @param memoryListID 
	 */
	public void update(AsyncCallback callback, MemoryList memoryListID) { 
		// TODO Auto-generated method
	 }
	/**
	 * 
	   * Initialsierungsmethode. Siehe dazu Anmerkungen zum No-Argument-Konstruktor
	   * {@link #ReportGeneratorImpl()}. Diese Methode muss für jede Instanz von
	   * <code>BankVerwaltungImpl</code> aufgerufen werden.
	   * 
	   * @see #ReportGeneratorImpl()
	   
	 * @param callback 
	 */
	public void init(AsyncCallback callback) { 
		// TODO Auto-generated method
	 }
	/**
	 * 
	   * Auslesen aller Konten des übergeben Kunden.
	   
	 * @param profileID 
	 * @param callback 
	 */
	public void getAllMemoryList(int profileID, AsyncCallback callback) { 
		// TODO Auto-generated method
	 }
	/**
	 * 
	 * @param vehicleID 
	 * @param callback 
	 */
	public void deleteFromMemoryList(int vehicleID, AsyncCallback callback) { 
		// TODO Auto-generated method
	 }
	/**
	 * 
	   * Auslesen des Kontos mit einer bestimmten Id
	   
	 * @param profileID 
	 * @param callback 
	 */
	public void getProfileById(int profileID, AsyncCallback callback) { 
		// TODO Auto-generated method
	 }
	/**
	 * 
	   * <p>
	   * Anlegen eines neuen Kunden. Dies führt implizit zu einem Speichern des
	   * neuen Kunden in der Datenbank.
	   * </p>
	   * 
	   * <p>
	   * <b>HINWEIS:</b> Änderungen an Customer-Objekten müssen stets durch Aufruf
	   * von {@link #save(Customer c)} in die Datenbank transferiert werden.
	   * </p>
	   * 
	   * @see save(Customer c)
	   
	 * @param firstName 
	 * @param lastName 
	 * @param email 
	 * @param callback 
	 */
	public void createProfile(String firstName, String lastName, String email, AsyncCallback callback) { 
		// TODO Auto-generated method
	 }
	/**
	 * 
	 * @param List 
	 * @param callback 
	 */
	public void getAllProfiles(Profile List, AsyncCallback callback) { 
		// TODO Auto-generated method
	 }
	/**
	 * 
	   * Löschen der übergebenen Buchung. Beachten Sie bitte auch die Anmerkungen zu
	   * {@link #delete(Customer)} und {@link #delete(Account)}.
	   * 
	   * @see #delete(Customer)
	   * @see #delete(Account)
	   
	 * @param callback 
	 * @param reservationID 
	 */
	public void delete(AsyncCallback callback, Reservation reservationID) { 
		// TODO Auto-generated method
	 }
	/**
	 * 
	 * @param memoryListID 
	 * @param callback 
	 */
	public void delete(MemoryList memoryListID, AsyncCallback callback) { 
		// TODO Auto-generated method
	 }
	/**
	 * 
	   * Setzen der Bank für die diese Bankverwaltung tätig ist.
	   
	 * @param vehicleRentalID 
	 * @param callback 
	 */
	public void setVehicleRental(VehicleRental vehicleRentalID, AsyncCallback callback) { 
		// TODO Auto-generated method
	 } 

}
