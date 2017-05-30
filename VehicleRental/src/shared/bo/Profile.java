package shared.bo;

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
	private String name;
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
	 * Auslesen des Nachnamens.
	 * 
	 * @return
	 */
	public String getName() {
		return name;
	}

	/**
	 * 
	 * Setzen des Nachnamens.
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
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
