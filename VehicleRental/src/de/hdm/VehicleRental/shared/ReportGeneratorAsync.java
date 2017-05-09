package de.hdm.thies.bankProjekt.shared;

import com.google.gwt.user.client.rpc.AsyncCallback;
import de.hdm.thies.bankProjekt.server.Profile;
import de.hdm.thies.bankProjekt.server.VehicleRental;

/**
 * 
 * Das asynchrone Gegenstück des Interface {@link ReportGenerator}. Es wird
 * semiautomatisch durch das Google Plugin erstellt und gepflegt. Daher erfolgt
 * hier keine weitere Dokumentation. Für weitere Informationen siehe das
 * synchrone Interface {@link ReportGenerator}.
 * 
 * @author thies
 
 * @author
 */
public interface ReportGeneratorAsync {

	/**
	 * 
	 * @param callback 
	 */
	public void init(AsyncCallback callback);

	/**
	 * 
	 * @param callback 
	 * @param profileID 
	 */
	public void createReservationOfProfileReport(AsyncCallback callback, Profile profileID);

	/**
	 * 
	 * @param vehicleRentalID 
	 * @param callback 
	 */
	public void setVehicleRental(VehicleRental vehicleRentalID, AsyncCallback callback);

	/**
	 * 
	 * @param callback 
	 */
	public void createAllProfilesReport(AsyncCallback callback);

	/**
	 * 
	 * @param profileID 
	 * @param callback 
	 */
	public void createMemoryListOfProfileReport(Profile profileID, AsyncCallback callback);

	/**
	 * 
	 * @param callback 
	 */
	public void createAllVehiclesReport(AsyncCallback callback); 

}
