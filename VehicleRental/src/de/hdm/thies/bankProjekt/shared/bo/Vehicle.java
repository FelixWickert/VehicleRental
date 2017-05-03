package de.hdm.thies.bankProjekt.shared.bo;

import datatype.Long;
import datatype.Boolean;
import java.lang.Object;

public class Vehicle extends BusinessObject {

	/**
	 * 
	 */
	private String vehicleModel;
	/**
	 * 
	 */
	private String vehicleCategory;
	/**
	 * 
	 */
	private String vehicleColour;
	/**
	 * 
	 */
	private int vehicleID;
	/**
	 * 
	 */
	private static final Long serialVersionUID;
	/**
	 * 
	 */
	private String vehiclePerformance;
	/**
	 * 
	 * @return 
	 */
	public String getVehicleModel() {
	 	 return vehicleModel; 
	}
	/**
	 * Setter of vehicleModel
	 */
	public void setVehicleModel(String vehicleModel) { 
		 this.vehicleModel = vehicleModel; 
	}
	/**
	 * 
	 * @return 
	 */
	public String getVehicleCategory() {
	 	 return vehicleCategory; 
	}
	/**
	 * Setter of vehicleCategory
	 */
	public void setVehicleCategory(String vehicleCategory) { 
		 this.vehicleCategory = vehicleCategory; 
	}
	/**
	 * 
	 * @return 
	 */
	public String getVehicleColour() {
	 	 return vehicleColour; 
	}
	/**
	 * Setter of vehicleColour
	 */
	public void setVehicleColour(String vehicleColour) { 
		 this.vehicleColour = vehicleColour; 
	}
	/**
	 * 
	 * @return 
	 */
	public int getVehicleID() {
	 	 return vehicleID; 
	}
	/**
	 * 
	 * @param vehicleID 
	 */
	public void setVehicleID(int vehicleID) { 
		 this.vehicleID = vehicleID; 
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
	public String getVehiclePerformance() {
	 	 return vehiclePerformance; 
	}
	/**
	 * Setter of vehiclePerformance
	 */
	public void setVehiclePerformance(String vehiclePerformance) { 
		 this.vehiclePerformance = vehiclePerformance; 
	}
	/**
	 * 
	   * Erzeugen einer einfachen textuellen Repräsentation der jeweiligen
	   * Kontoinstanz.
	   
	 * @return 
	 */
	public String toString() { 
		// TODO Auto-generated method
		return null;
	 }
	/**
	 * 
	 * @param vehicleID 
	 * @param vehicleColour 
	 */
	public void setVehicleModel(int vehicleID, String vehicleColour) { 
		// TODO Auto-generated method
	 }
	/**
	 * 
	 * @param vehicleID 
	 * @param vehicleCategory 
	 */
	public void setVehicleCategory(int vehicleID, String vehicleCategory) { 
		// TODO Auto-generated method
	 }
	/**
	 * 
	 * @param vehicleColour 
	 * @param VehicleID 
	 */
	public void setVehicleColour(String vehicleColour, int VehicleID) { 
		// TODO Auto-generated method
	 }
	/**
	 * 
	 * @param vehiclePerformance 
	 * @param vehicleID 
	 */
	public void setVehiclePerformance(String vehiclePerformance, int vehicleID) { 
		// TODO Auto-generated method
	 }
	/**
	 * 
	   * <p>
	   * Feststellen der <em>inhaltlichen</em> Gleichheit zweier Account-Objekte.
	   * Die Gleichheit wird in diesem Beispiel auf eine identische Kontonummer
	   * beschränkt.
	   * </p>
	   * <p>
	   * <b>ACHTUNG:</b> Die inhaltliche Gleichheit nicht mit dem Vergleich der
	   * <em>Identität</em> eines Objekts mit einem anderen verwechseln!!! Dies
	   * würde durch den Operator <code>==</code> bestimmt. Bei Unklarheit hierzu
	   * können Sie nocheinmal in die Definition des Sprachkerns von Java schauen.
	   * Die Methode <code>equals(...)</code> ist für jeden Referenzdatentyp
	   * definiert, da sie bereits in der Klasse <code>Object</code> in einfachster
	   * Form realisiert ist. Dort ist sie allerdings auf die simple Bestimmung der 
	   * Gleicheit der Java-internen Objekt-ID der verglichenen Objekte beschränkt.
	   * In unseren eigenen Klassen können wir diese Methode überschreiben und ihr
	   * mehr Intelligenz verleihen.
	   * </p>
	   
	 * @param o 
	 * @return 
	 */
	public Boolean equals(Object o) { 
		// TODO Auto-generated method
		return null;
	 } 

}
