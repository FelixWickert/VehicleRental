package de.hdm.VehicleRental.shared.report;

import java.io.Serializable;

public class Column implements Serializable {

	/**
	 * 
	   * 
	   
	 */
	private static final Long serialVersionUID = 1L;
	/**
	 * 
	   * Der Wert eines Spaltenobjekts entspricht dem Zelleneintrag einer Tabelle.
	   * In dieser Realisierung handelt es sich um einen einfachen textuellen Wert.
	   
	 */
	private String value;

	/**
	 * 
	   * Auslesen des Spaltenwerts.
	   * 
	   * @return der Eintrag als String
	   
	 * @return 
	 */
	public String getValue() {
	 	 return value; 
	}
	/**
	 * 
	   * Überschreiben des aktuellen Spaltenwerts.
	   * 
	   * @param value neuer Spaltenwert
	   
	 * @param value 
	 */
	public void setValue(String value) { 
		 this.value = value; 
	}
	/**
	 * 
	   * Umwandeln des <code>Column</code>-Objekts in einen String.
	   * 
	   * @see java.lang.Object
	   
	 * @return 
	 */
	public String toString() { 
		// TODO Auto-generated method
		return null;
	 } 

}
