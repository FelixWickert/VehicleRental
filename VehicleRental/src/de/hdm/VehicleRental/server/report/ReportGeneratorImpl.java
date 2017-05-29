package de.hdm.VehicleRental.server.report;

import de.hdm.VehicleRental.shared.VehicleRentalAdministration;

public class ReportGeneratorImpl extends RemoteServiceServlet implements ReportGenerator {

	/**
	 * 
	   * Ein ReportGenerator benötigt Zugriff auf die BankAdministration, da diese die
	   * essentiellen Methoden für die Koexistenz von Datenobjekten (vgl.
	   * bo-Package) bietet.
	   
	 */
	private VehicleRentalAdministration administration;
	/**
	 * 
	 */
	private long serialVersionUID;
	/**
	 * Getter of administration
	 */
	public VehicleRentalAdministration getAdministration() {
	 	 return administration; 
	}
	/**
	 * Setter of administration
	 */
	public void setAdministration(VehicleRentalAdministration administration) { 
		 this.administration = administration; 
	}
	/**
	 * Getter of serialVersionUID
	 */
	public long getSerialVersionUID() {
	 	 return serialVersionUID; 
	}
	/**
	 * Setter of serialVersionUID
	 */
	public void setSerialVersionUID(long serialVersionUID) { 
		 this.serialVersionUID = serialVersionUID; 
	}}
	/**
	 * 
	 * @param profileID 
	 * @return 
	 */
//	public MemoryListOfProfileReport createMemoryListOfProfileReport(int profileID) { 
//		// TODO Auto-generated method
//		return null;
//	 }
//	/**
//	 * 
//	 * @param profileID 
//	 * @return 
//	 */
//	public ReservationOfProfileReport createReservationOfProfileReport(int profileID) { 
//		// TODO Auto-generated method
//		return null;
//	 }
//	/**
//	 * 
//	   * Auslesen der zugehörigen BankAdministration (interner Gebrauch).
//	   * 
//	   * @return das BankVerwaltungsobjekt
//	   
//	 * @return 
//	 */
//	public VehicleRentalAdministration getVehicleRentalVerwaltung() { 
//		// TODO Auto-generated method
//		return null;
//	 }
//	/**
//	 * 
//	   * Setzen des zugehörigen Bank-Objekts.
//	   
//	 * @param vehicleRentalID 
//	 */
//	public void setVehicleRental(VehicleRental vehicleRentalID) { 
//		// TODO Auto-generated method
//	 }
//	/**
//	 * 
//	   * Initialsierungsmethode. Siehe dazu Anmerkungen zum No-Argument-Konstruktor.
//	   * 
//	   * @see #ReportGeneratorImpl()
//	   
//	 */
//	public void init() { 
//		// TODO Auto-generated method
//	 }
//	/**
//	 * 
//	   * Erstellen von <code>AllAccountsOfCustomerReport</code>-Objekten.
//	   * 
//	   * @param c das Kundenobjekt bzgl. dessen der Report erstellt werden soll.
//	   * @return der fertige Report
//	   
//	 * @param profileID 
//	 * @return 
//	 */
//	public AllProfilesReport createAllProfilesReport(Profile profileID) { 
//		// TODO Auto-generated method
//		return null;
//	 }
//	/**
//	 * 
//	 * @return 
//	 */
//	public AllVehiclesReport createAllVehiclesReport() { 
//		// TODO Auto-generated method
//		return null;
//	 } 
//
//}
