package de.hdm.VehicleRental.shared.bo;

import datatype.Integer;
import datatype.Long;
import java.util.Vector;

public class MemoryList extends BusinessObject {

	/**
	 * 
	   * Fremdschlüsselbeziehung zum Quellkonto.
	   
	 */
	private Integer sourceProfileID;
	/**
	 * 
	 */
	private static final Long serialVersionUID;
	/**
	 * 
	   * Fremdschlüsselbeziehung zum Zielkonto.
	   
	 */
	private Integer targetVehicleID;
	/**
	 * 
	 */
	private Vector allVehiclesForProfile;
	/**
	 * Getter of sourceProfileID
	 */
	public Integer getSourceProfileID() {
	 	 return sourceProfileID; 
	}
	/**
	 * Setter of sourceProfileID
	 */
	public void setSourceProfileID(Integer sourceProfileID) { 
		 this.sourceProfileID = sourceProfileID; 
	}
	/**
	 * Getter of serialVersionUID
	 */
	public Long getSerialVersionUID() {
	 	 return serialVersionUID; 
	}
	/**
	 * Setter of serialVersionUID
	 */
	public void setSerialVersionUID(Long serialVersionUID) { 
		 this.serialVersionUID = serialVersionUID; 
	}
	/**
	 * 
	 * @return 
	 */
	public Integer getTargetVehicleID() {
	 	 return targetVehicleID; 
	}
	/**
	 * Setter of targetVehicleID
	 */
	public void setTargetVehicleID(Integer targetVehicleID) { 
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
	/**
	 * 
	   * Setzen des Fremdschlüssels des Quellkontos.
	   * @param sourceID der Fremdschlüssel
	   
	 * @param profileID 
	 */
	public void setSourceProfileID(int profileID) { 
		// TODO Auto-generated method
	 }
	/**
	 * 
	   * Setzen des Fremdschlüssels des Zielkontos.
	   * @param targetID der Fremdschlüssel
	   
	 * @param vehicleID 
	 */
	public void setTargetVehicleID(int vehicleID) { 
		// TODO Auto-generated method
	 }
	public int getTargetVehicleID() { 
		// TODO Auto-generated method
		return 0;
	 } 

}
