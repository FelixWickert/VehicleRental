package de.hdm.VehicleRental.shared.bo;


import java.lang.Object;


public class Vehicle extends BusinessObject {
	
	/**
	 * 
	 */
	private String Model;
	
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
	private String Category;
	/**
	 * 
	 */
	private String Colour;


	/**
	 * 
	 */
	private String Performance;
	/**
	 * 
	 * @return 
	 */
	public String getModel() {
	 	 return Model; 
	}
	/**
	 * Setter of Model
	 */
	public void setModel(String Model) { 
		 this.Model = Model; 
	}
	/**
	 * 
	 * @return 
	 */
	public String getCategory() {
	 	 return Category; 
	}
	/**
	 * Setter of vehicleCategory
	 */
	public void setCategory(String Category) { 
		 this.Category = Category; 
	}
	/**
	 * 
	 * @return 
	 */
	public String getColour() {
	 	 return Colour; 
	}
	/**
	 * Setter of Colour
	 */
	public void setColour(String Colour) { 
		 this.Colour = Colour; 
	}


	/**
	 * 
	 * @return 
	 */
	public String getPerformance() {
	 	 return Performance; 
	}
	/**
	 * Setter of vehiclePerformance
	 */
	public void setPerformance(String Performance) { 
		 this.Performance = Performance; 
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
	public void setModel(int vehicleID, String vehicleColour) { 
		// TODO Auto-generated method
	 }
	/**
	 * 
	 * @param vehicleID 
	 * @param vehicleCategory 
	 */
	public void setCategory(int vehicleID, String vehicleCategory) { 
		// TODO Auto-generated method
	 }
	/**
	 * 
	 * @param vehicleColour 
	 * @param VehicleID 
	 */
	public void setColour(String vehicleColour, int VehicleID) { 
		// TODO Auto-generated method
	 }
	/**
	 * 
	 * @param vehiclePerformance 
	 * @param vehicleID 
	 */
	public void setPerformance(String vehiclePerformance, int vehicleID) { 
		// TODO Auto-generated method
	 }


}
