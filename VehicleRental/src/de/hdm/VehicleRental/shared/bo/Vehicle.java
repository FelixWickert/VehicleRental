package de.hdm.VehicleRental.shared.bo;

import java.util.Vector;

public class Vehicle extends BusinessObject {

	private Vector<Profile> memoryList = new Vector<>();
	private Vector<Profile> reservation = new Vector<>();

	private String Model;
	private String Brand;
	private String Category;
	private String Colour;
	private String Performance;

	public void addProfileToReservation(Profile profile) {
		this.reservation.add(profile);
	}

	public Vector<Profile> getReservations() {
		return this.reservation;
	}

	public void setReservation(Profile profile) {
		if (profile == null && this != null) {
			this.reservation.remove(this);
		}
	}

	public void deleteProfileFromReserveration(Profile profile) {
		reservation.remove(profile);
	}
	


	// public String getBrand() {
	// return Brand;
	// }
	// public void setBrand(String brand) {
	// Brand = brand;
	// }

	public String getModel() {
		return Model;
	}

	public void setModel(String Model) {
		this.Model = Model;
	}

	public String getCategory() {
		return Category;
	}

	public void setCategory(String Category) {
		this.Category = Category;
	}

	public String getColour() {
		return Colour;
	}

	public void setColour(String Colour) {
		this.Colour = Colour;
	}

	public String getPerformance() {
		return Performance;
	}

	public void setPerformance(String Performance) {
		this.Performance = Performance;
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
