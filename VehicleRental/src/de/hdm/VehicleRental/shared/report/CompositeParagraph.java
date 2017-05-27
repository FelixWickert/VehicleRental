package de.hdm.VehicleRental.shared.report;

import java.io.Serializable;
import java.util.Vector;


public class CompositeParagraph extends Paragraph implements Serializable {

	/**
	 * 
	   * Speicherort der Unterabschnitte.
	   
	 */
	private Vector subParagraphs;
	/**
	 * 
	   * 
	   
	 */
	private static final Long serialVersionUID = 1L;
	/**
	 * 
	   * Auslesen sämtlicher Unterabschnitte.
	   * 
	   * @return <code>Vector</code>, der sämtliche Unterabschnitte enthält.
	   
	 * @return 
	 */
	public Vector getSubParagraphs() {
	 	 return subParagraphs; 
	}
	/**
	 * Setter of subParagraphs
	 */
	public void setSubParagraphs(Vector subParagraphs) { 
		 this.subParagraphs = subParagraphs; 
	}

	/**
	 * 
	   * Einen Unterabschnitt entfernen.
	   * 
	   * @param p der zu entfernende Unterabschnitt.
	   
	 * @param p 
	 */
	public void removeSubParagraph(SimpleParagraph p) { 
		// TODO Auto-generated method
	 }
	/**
	 * 
	   * Umwandeln eines <code>CompositeParagraph</code> in einen
	   * <code>String</code>.
	   
	 * @return 
	 */
	public String toString() { 
		// TODO Auto-generated method
		return null;
	 }
	/**
	 * 
	   * Auslesen eines einzelnen Unterabschnitts.
	   * 
	   * @param i der Index des gewünschten Unterabschnitts (0 <= i <n), mit n =
	   *          Anzahl der Unterabschnitte.
	   * 
	   * @return der gewünschte Unterabschnitt.
	   
	 * @param i 
	 * @return 
	 */
	public SimpleParagraph getParagraphAt(Integer i) { 
		// TODO Auto-generated method
		return null;
	 }
	/**
	 * 
	   * Auslesen der Anzahl der Unterabschnitte.
	   * 
	   * @return Anzahl der Unterabschnitte
	   
	 * @return 
	 */
	public Integer getNumParagraphs() { 
		// TODO Auto-generated method
		return null;
	 }
	/**
	 * 
	   * Einen Unterabschnitt hinzufügen.
	   * 
	   * @param p der hinzuzufügende Unterabschnitt.
	   
	 * @param p 
	 */
	public void addSubParagraph(SimpleParagraph p) { 
		// TODO Auto-generated method
	 } 

}
