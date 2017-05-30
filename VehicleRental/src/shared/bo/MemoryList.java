package shared.bo;

import java.util.Vector;

public class MemoryList extends BusinessObject {

	private static final Long serialVersionUID = 1l;
	
	
	/**
	 * 
	   * Fremdschlüsselbeziehung zum Quellkonto.
	   
	 */
	private int sourceProfileID;
	/**
	 * 
	 */

	/**
	 * 
	   * Fremdschlüsselbeziehung zum Zielkonto.
	   
	 */
	private int targetVehicleID;
	/**
	 * 
	 */
	
	public int memoryListID;
	
	public int vehicleID;
	
	public int profileID;
	
	
	public int getProfileID() {
		return profileID;
	}


	public void setProfileID(int profileID) {
		this.profileID = profileID;
	}


	public int getVehicleID() {
		return vehicleID;
	}


	public void setVehicleID(int vehicleID) {
		this.vehicleID = vehicleID;
	}


	public int getMemoryListID() {
		return memoryListID;
	}
	
	
	public void setMemoryListID(int memoryListID) {
		this.memoryListID = memoryListID;
	}
	
	
	private Vector allVehiclesForProfile;
	/**
	 * Getter of sourceProfileID
	 */
	public int getSourceProfileID() {
	 	 return sourceProfileID; 
	}
	/**
	 * Setter of sourceProfileID
	 */
	public void setSourceProfileID(int sourceProfileID) { 
		 this.sourceProfileID = sourceProfileID; 
	}

	/**
	 * 
	 * @return 
	 */
	public int getTargetVehicleID() {
	 	 return targetVehicleID; 
	}
	/**
	 * Setter of targetVehicleID
	 */
	public void setTargetVehicleID(int targetVehicleID) { 
		 this.targetVehicleID = targetVehicleID; 
	}
	/**
	 * Getter of allVehiclesForProfile
	 */
	public Vector getAllVehiclesForProfile() {
	 	 return allVehiclesForProfile; 
	}
	/**
	 * Setter of allVehiclesForProfile
	 */
	public void setAllVehiclesForProfile(Vector allVehiclesForProfile) { 
		 this.allVehiclesForProfile = allVehiclesForProfile; 
	}
	/**
	 * 
	   * Auslesen des Fremdschlüssels des Quellkontos.
	   
	 * @param profileID 
	 * @return 
	 */
	public Vector getAllVehicles(int profileID) { 
		// TODO Auto-generated method
		return null;
	 }
	/**
	 * 
	   * Erzeugen einer textuellen Darstellung der jeweiligen Buchung.
	   
	 * @return 
	 */
	public String toString() { 
		// TODO Auto-generated method
		return null;
	 }
	/**
	 * 
	   * Auslesen des Fremdschlüssels des Zielkontos.
	   * @return der Fremdschlüssel
	   
	 * @return 
	 */
	public int getTargetProfileID() { 
		// TODO Auto-generated method
		return 0;
	 }
}
