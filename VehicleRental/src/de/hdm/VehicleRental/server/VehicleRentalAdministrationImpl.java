package de.hdm.VehicleRental.server;

import java.util.Date;
import java.util.Vector;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;

import de.hdm.VehicleRental.server.db.MemoryListMapper;
import de.hdm.VehicleRental.server.db.ProfileMapper;
import de.hdm.VehicleRental.server.db.ReservationMapper;
import de.hdm.VehicleRental.server.db.VehicleMapper;
import de.hdm.VehicleRental.shared.bo.MemoryList;
import de.hdm.VehicleRental.shared.bo.Profile;
import de.hdm.VehicleRental.shared.bo.Reservation;
import de.hdm.VehicleRental.shared.bo.Vehicle;
import de.hdm.VehicleRental.shared.bo.VehicleRental;



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
	 * Getter of vehicleRental
	 */
	public VehicleRental getVehicleRental() {
	 	 return vehicleRental; 
	}
	/**
	 * 
	   * Setzen der Bank für die diese Bankverwaltung tätig ist.
	   
	 * @param vehicleRentalID 
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
	   * Initialsierungsmethode. Siehe dazu Anmerkungen zum No-Argument-Konstruktor
	   * {@link #ReportGeneratorImpl()}. Diese Methode muss für jede Instanz von
	   * <code>BankVerwaltungImpl</code> aufgerufen werden.
	   * 
	   * @see #ReportGeneratorImpl()
	   
	 */
	public void init() { 
		// TODO Auto-generated method
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
