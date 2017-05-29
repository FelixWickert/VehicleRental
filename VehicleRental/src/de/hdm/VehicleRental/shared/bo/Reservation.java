package de.hdm.VehicleRental.shared.bo;


import java.util.Date;

import java.sql.Date;
import java.util.Vector;


public class Reservation extends BusinessObject {

	/**
	 * 
	 */
	private static  Long serialVersionUID;
	/**
	 * 
	   * Der Betrag der Buchung. Dieser Betrag kann als Geldwert interpretiert
	   * werden. Da ein Buchungssystem stets mit einer einzigen Währung arbeitet, 
	   * ist deren Repräsentation in der Buchung nicht erforderlich.
	   
	 */
	private int reservationNumber;
	/**
	 * 
	 */
	private Date reservationDate;
	/**
	 * 
	 */

	private static final Long serialVersionUID = 1L;

	private int reservationID;
	
	private Vehicle vehicle = null;
	
	private Date date;
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Vehicle getVehicle() {
		return vehicle;
	}
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	public Profile getProfil() {
		return profil;
	}
	public void setProfil(Profile profil) {
		this.profil = profil;
	}
	private Profile profil = null;


	private Vector allReservationsForVehicle;

	private Vector allReservationsForProfile;
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
	   * Setzen des Fremdschlüssels des Quellkontos.
	   * @param sourceID der Fremdschlüssel
	   
	 * @return 
	 */
	public int getReservationNumber() {
	 	 return reservationNumber; 
	}
	/**
	 * 
	   * Auslesen des Fremdschlüssels des Quellkontos.
	   
	 * @param reservationNumber 
	 */
	public void setReservationNumber(int reservationNumber) { 
		 this.reservationNumber = reservationNumber; 
	}
	/**
	 * 
	   * Auslesen des Buchungswerts.
	   
	 * @return 
	 */
	public Date getReservationDate() {
	 	 return reservationDate; 
	}
	/**
	 * 
	   * Setzen des Buchungswerts.
	   * @param money der zu buchenden Betrag
	   
	 * @param reservationDate 
	 */
	public void setReservationDate(Date reservationDate) { 
		 this.reservationDate = reservationDate; 
	}

	/**
	 * Getter of allReservationsForVehicle
	 */
	public Vector getAllReservationsForVehicle() {
	 	 return allReservationsForVehicle; 
	}
	/**
	 * Setter of allReservationsForVehicle
	 */
	public void setAllReservationsForVehicle(Vector allReservationsForVehicle) { 
		 this.allReservationsForVehicle = allReservationsForVehicle; 
	}
	/**
	 * Getter of allReservationsForProfile
	 */
	public Vector getAllReservationsForProfile() {
	 	 return allReservationsForProfile; 
	}
	/**
	 * Setter of allReservationsForProfile
	 */
	public void setAllReservationsForProfile(Vector allReservationsForProfile) { 
		 this.allReservationsForProfile = allReservationsForProfile; 
	}
	/**
	 * 
	 * @param vehicleID 
	 * @return 
	 */
	public Vector getAllReservationsForVehicle(int vehicleID) { 
		// TODO Auto-generated method
		return null;
	 }
	/**
	 * 
	 * @param profileID 
	 * @return 
	 */
	public Vector getAllReservationsForProfile(int profileID) { 
		// TODO Auto-generated method
		return null;
	 } 
	
	public int getReservationID() {
		return reservationID;
	}
	public void setReservationID(int reservationID) {
		this.reservationID = reservationID;
	}

}
