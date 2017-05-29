package de.hdm.VehicleRental.server;

import java.util.Date;
import java.util.Vector;

import de.hdm.VehicleRental.shared.bo.Vehicle;
import de.hdm.VehicleRental.server.db.MemoryListMapper;
import de.hdm.VehicleRental.shared.bo.Profile;
import de.hdm.VehicleRental.server.db.ProfileMapper;
import de.hdm.VehicleRental.shared.bo.Reservation;
import de.hdm.VehicleRental.server.db.ReservationMapper;
import de.hdm.VehicleRental.server.db.VehicleMapper;
import de.hdm.VehicleRental.shared.bo.VehicleRental;
import de.hdm.VehicleRental.shared.bo.MemoryList;



import de.hdm.VehicleRental.server.db.VehicleMapper;
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
public class VehicleRentalAdministrationImpl extends RemoteServiceServlet {

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
	 */
	private ReservationMapper reservationMapper;
	
	/**
	 * 
	   * Initialsierungsmethode. Siehe dazu Anmerkungen zum No-Argument-Konstruktor
	   * {@link #ReportGeneratorImpl()}. Diese Methode muss für jede Instanz von
	   * <code>BankVerwaltungImpl</code> aufgerufen werden.
	   * 
	   * @see #ReportGeneratorImpl()
	   
	 */
	/**
	 * Diese Methode initialisiert die Applikationslogik und startet dabei die
	 * Mapper
	 */
	public void init() throws IllegalArgumentException {
		
		this.vehicleMapper = VehicleMapper.vehicleMapper();
		this.profileMapper = ProfileMapper.profileMapper();
		this.reservationMapper = ReservationMapper.reservationMapper();
	}
	
	
	
	
	/**
	 * Getter of vehicleMapper
	 */
	
	/**
	 * 
	 * @param profileID 
	 * @param vehicleID 
	 * @return 
	 */
	public MemoryList insertToMemoryList(int profileID, int vehicleID) { 
		// TODO Auto-generated method
		return null;
	 }
	/**
	 * 
	 * @param profileID 
	 * @return 
	 */
	public MemoryList getMemoryList(int profileID) { 
		// TODO Auto-generated method
		return null;
	 }

	/**
	 * 
	   * Löschen der übergebenen Buchung. Beachten Sie bitte auch die Anmerkungen zu
	   * {@link #delete(Customer)} und {@link #delete(Account)}.
	   * 
	   * @see #delete(Customer)
	   * @see #delete(Account)
	   
	 * @param reservationID 
	 */
	public void delete(Reservation reservationID) { 
		// TODO Auto-generated method
	 }
	/**
	 * 
	 * @param memoryListID 
	 */
	public void delete(MemoryList memoryListID) { 
		// TODO Auto-generated method
	 }
	/**
	 * 
	   * Speichern eines Kontos.
	   
	 * @param reservationID 
	 */
	public void save(Reservation reservationID) { 
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
	 */
	public void update(Profile profileID) { 
		// TODO Auto-generated method
	 }
	/**
	 * 
	   * Auslesen aller Konten des übergeben Kunden.
	   
	 * @param profileID 
	 * @return 
	 */
	public Vector getAllMemoryList(int profileID) { 
		// TODO Auto-generated method
		return null;
	 }
	/**
	 * 
	   * Auslesen eines Kunden anhand seiner Kundennummer.
	   
	 * @param profileID 
	 * @return 
	 */
	public Profile getProfileByID(int profileID) { 
		// TODO Auto-generated method
		return null;
	 }
	/**
	 * 
	   * Löschen eines Kunden. Natürlich würde ein reales System zur Verwaltung von
	   * Bankkunden ein Löschen allein schon aus Gründen der Dokumentation nicht
	   * bieten, sondern deren Status z.B von "aktiv" in "ehemalig" ändern. Wir
	   * wollen hier aber dennoch zu Demonstrationszwecken eine Löschfunktion
	   * vorstellen.
	   
	 * @param profileID 
	 */
	public void delete(Profile profileID) { 
		// TODO Auto-generated method
	 }
	/**
	 * 
	 * @param reservationID 
	 */
	public void update(Reservation reservationID) { 
		// TODO Auto-generated method
	 }
	/**
	 * 
	 * @param vehicleID 
	 * @return 
	 */
	public MemoryList deleteFromMemoryList(int vehicleID) { 
		// TODO Auto-generated method
		return null;
	 }
	/**
	 * 
	   * Auslesen sämtlicher Konten dieses Systems.
	   
	 * @return 
	 */
	public Vector getAllVehicles() { 
		// TODO Auto-generated method
		return null;
	 }
	/**
	 * 
	 * @param memoryListID 
	 */
	public void save(MemoryList memoryListID) { 
		// TODO Auto-generated method
	 }
	/**
	 * 
	 * @param reservationNumber 
	 * @param vehicleNumber 
	 * @param date 
	 * @param profileID 
	 * @return 
	 */
	public Reservation createReservation(int reservationNumber, int vehicleNumber, Date date, int profileID) { 
		// TODO Auto-generated method
		return null;
	 }
	/**
	 * 
	   * Auslesen der Bank für die diese Bankverwaltung gewissermaßen tätig ist.
	   
	 * @param vehicleID 
	 * @return 
	 */
	public Vehicle getVehicleByID(int vehicleID) { 
		// TODO Auto-generated method
		return null;
	 }
	/**
	 * 
	 * @param memoryListID 
	 */
	public void update(MemoryList memoryListID) { 
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
	 * @return 
	 */
	public Profile createProfile(String firstName, String lastName, String email) { 
		// TODO Auto-generated method
		return null;
	 }
	/**
	 * 
	 * @param memoryListID 
	 * @return 
	 */
	public MemoryList createMemoryList(MemoryList memoryListID) { 
		// TODO Auto-generated method
		return null;
	 }
	/**
	 * 
	   * Auslesen des Kontos mit einer bestimmten Id
	   
	 * @param profileID 
	 * @return 
	 */
	public Profile getProfileById(int profileID) { 
		// TODO Auto-generated method
		return null;
	 }
	/**
	 * 
	   * Speichern eines Kunden.
	   
	 * @param profileID 
	 */
	public void save(Profile profileID) { 
		// TODO Auto-generated method
	 }
	/**
	 * 
	 * @param List 
	 * @return 
	 */
	public Vector getAllProfiles(Profile List) { 
		// TODO Auto-generated method
		return null;
	 }
	/**
	 * 
	   * Auslesen aller Kunden.
	   
	 * @return 
	 */
	public Vector getAllProfiles() { 
		// TODO Auto-generated method
		return null;
	 } 

}
