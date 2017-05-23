package de.hdm.VehicleRental.shared.bo;

import java.util.Vector;

public class Profile extends BusinessObject {
private Vector<Vehicle> favoritenListe = new Vector<>(); 



	/**
	 * 
	 */
	private int driversLicence;
	/**
	 * 
	 * Der Nachname des Kunden.
	 * 
	 */
	private String LastName;
	
	/**
	 * 
	 * Der Vorname des Kunden.
	 * 
	 */
	private String FirstName;
	
	
	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	/**
	 * 
	 */
private double balance;
	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	/**
	 * 
	 */
	private String gender;
	/**
	 * 
	 */
	private String email;
	/**
	 * 
	 */
	private String adress;
	
	

	/**
	 * 
	 * @return
	 */
	public int getDriversLicence() {
		return driversLicence;
	}

	/**
	 * 
	 * @param driversLicenceID
	 */
	public void setDriversLicence(int driversLicence) {
		this.driversLicence = driversLicence;
	}

	/**
	 * 
	 * @return
	 */

	public String getGender() {
		return gender;
	}

	/**
	 * 
	 * @param Gender
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * 
	 * @return
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * 
	 * @param email
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * 
	 * @return
	 */
	public String getAdress() {
		return adress;
	}

	/**
	 * 
	 * @param adress
	 */
	public void setAdress(String adress) {
		this.adress = adress;
	}


}
