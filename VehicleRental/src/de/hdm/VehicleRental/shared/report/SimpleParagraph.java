package de.hdm.VehicleRental.shared.report;

import datatype.Long;

public class SimpleParagraph extends Paragraph implements Serializable {

	/**
	 * 
	   * Inhalt des Absatzes.
	   
	 */
	private String text;
	/**
	 * 
	   * TODO
	   
	 */
	private static final Long serialVersionUID;
	/**
	 * 
	   * Auslesen des Inhalts.
	   * 
	   * @return Inhalt als String
	   
	 * @return 
	 */
	public String getText() {
	 	 return text; 
	}
	/**
	 * 
	   * Überschreiben des Inhalts.
	   * 
	   * @param text der neue Inhalt des Absatzes.
	   
	 * @param text 
	 */
	public void setText(String text) { 
		 this.text = text; 
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
	   * Umwandeln des <code>SimpleParagraph</code>-Objekts in einen String.
	   
	 * @return 
	 */
	public String toString() { 
		// TODO Auto-generated method
		return null;
	 } 

}
