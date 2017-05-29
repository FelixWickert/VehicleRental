package de.hdm.VehicleRental.shared.bo;

public class Vehicle extends BusinessObject {
	
	/**
	 * 
	 */
	private String vehicleModel;
	
	public String getBrand() {
		return Brand;
	}
	public void setBrand(String brand) {
		Brand = brand;
	}
	private String Brand;
	
	
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
	private int vehiclePerformance;
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
	public int getVehiclePerformance() {
	 	 return vehiclePerformance; 
	}
	/**
	 * Setter of vehiclePerformance
	 */
	public void setVehiclePerformance(int VehiclePerformance) { 
		 this.vehiclePerformance = VehiclePerformance; 
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


}
