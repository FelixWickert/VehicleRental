package de.hdm.VehicleRental.shared.report;

import java.io.Serializable;
import java.util.Vector;

public class Row implements Serializable {

	/**
	 * 
	   * Speicherplatz für die Spalten der Zeile.
	   
	 */
	private Vector columns;
	/**
	 * 
	   * 
	   
	 */
	private static final Long serialVersionUID = 1L;
	/**
	 * 
	   * Auslesen sämtlicher Spalten.
	   * 
	   * @return <code>Vector</code>-Objekts mit sämtlichen Spalten
	   
	 * @return 
	 */
	public Vector getColumns() {
	 	 return columns; 
	}
	/**
	 * Setter of columns
	 */
	public void setColumns(Vector columns) { 
		 this.columns = columns; 
	}

	/**
	 * 
	   * Auslesen eines einzelnen Spalten-Objekts.
	   * 
	   * @param i der Index der auszulesenden Spalte (0 <= i < n), mit n = Anzahl
	   *          der Spalten.
	   * @return das gewünschte Spaltenobjekt.
	   
	 * @param i 
	 * @return 
	 */
	public Column getColumnAt(Integer i) { 
		// TODO Auto-generated method
		return null;
	 }
	/**
	 * 
	   * Entfernen einer benannten Spalte
	   * 
	   * @param c das zu entfernende Spaltenobjekt
	   
	 * @param c 
	 */
	public void removeColumn(Column c) { 
		// TODO Auto-generated method
	 }
	/**
	 * 
	   * Auslesen der Anzahl sämtlicher Spalten.
	   * 
	   * @return int Anzahl der Spalten
	   
	 * @return 
	 */
	public Integer getNumColumns() { 
		// TODO Auto-generated method
		return null;
	 }
	/**
	 * 
	   * Hinzufügen einer Spalte.
	   * 
	   * @param c das Spaltenobjekt
	   
	 * @param c 
	 */
	public void addColumn(Column c) { 
		// TODO Auto-generated method
	 } 

}
