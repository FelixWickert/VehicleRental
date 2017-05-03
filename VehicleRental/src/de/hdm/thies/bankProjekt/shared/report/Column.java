package de.hdm.thies.bankProjekt.shared.report;

import datatype.Long;

public class Column implements Serializable {

	/**
	 * 
	   * 
	   
	 */
	private static final Long serialVersionUID;
	/**
	 * 
	   * Der Wert eines Spaltenobjekts entspricht dem Zelleneintrag einer Tabelle.
	   * In dieser Realisierung handelt es sich um einen einfachen textuellen Wert.
	   
	 */
	private String value;
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
