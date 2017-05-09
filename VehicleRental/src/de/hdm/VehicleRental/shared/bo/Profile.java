package de.hdm.thies.bankProjekt.shared.bo;

import datatype.Long;
import java.lang.Object;

public class Profile extends BusinessObject {

	/**
	 * 
	 */
	private String driversLicence;
	/**
	 * 
	   * Der Nachname des Kunden.
	   
	 */
	private String lastName;
	/**
	 * 
	 */
	private EDate birthday;
	/**
	 * 
	 */
	private static final Long serialVersionUID;
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
	   * Der Vorname des Kunden.
	   
	 */
	private String firstName;
	/**
	 * 
	 * @return 
	 */
	public String getDriversLicence() {
	 	 return driversLicence; 
	}
	/**
	 * 
	 * @param driversLicenceID 
	 */
	public void setDriversLicence(String driversLicence) { 
		 this.driversLicence = driversLicence; 
	}
	/**
	 * 
	   * Auslesen des Nachnamens.
	   
	 * @return 
	 */
	public String getLastName() {
	 	 return lastName; 
	}
	/**
	 * 
	   * Setzen des Nachnamens.
	   
	 * @param name 
	 */
	public void setLastName(String lastName) { 
		 this.lastName = lastName; 
	}
	/**
	 * 
	 * @return 
	 */
	public EDate getBirthday() {
	 	 return birthday; 
	}
	/**
	 * 
	 * @param birthday 
	 */
	public void setBirthday(EDate birthday) { 
		 this.birthday = birthday; 
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
	/**
	 * 
	   * Auslesen des Vornamens.
	   
	 * @return 
	 */
	public String getFirstName() {
	 	 return firstName; 
	}
	/**
	 * 
	   * Setzen des Vornamens.
	   
	 * @param name 
	 */
	public void setFirstName(String firstName) { 
		 this.firstName = firstName; 
	}
	/**
	 * 
	   * Erzeugen einer einfachen textuellen Darstellung der jeweiligen Instanz.
	   * Diese besteht aus dem Text, der durch die <code>toString()</code>-Methode
	   * der Superklasse erzeugt wird, ergänzt durch den Vor- und Nachnamen des 
	   * jeweiligen Kunden.
	   
	 * @return 
	 */
	public String toString() { 
		// TODO Auto-generated method
		return null;
	 }
	/**
	 * 
	 * @param o 
	 * @return 
	 */
	public boolean equals(Object o) { 
		// TODO Auto-generated method
		return false;
	 } 

}
