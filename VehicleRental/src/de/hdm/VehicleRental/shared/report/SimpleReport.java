package de.hdm.VehicleRental.shared.report;


import java.util.Vector;

public abstract class SimpleReport extends Report {

	/**
	 * 
	   * 
	   
	 */
	private static final Long serialVersionUID = 1L;
	/**
	 * 
	   * Tabelle mit Positionsdaten. Die Tabelle wird zeilenweise in diesem
	   * <code>Vector</code> abgelegt.
	   
	 */
	private Vector table;

	/**
	 * Getter of table
	 */
	public Vector getTable() {
	 	 return table; 
	}
	/**
	 * Setter of table
	 */
	public void setTable(Vector table) { 
		 this.table = table; 
	}
	/**
	 * 
	   * Hinzufügen einer Zeile.
	   * 
	   * @param r die hinzuzufügende Zeile
	   
	 * @param r 
	 */
	public void addRow(Row r) { 
		// TODO Auto-generated method
	 }
	/**
	 * 
	   * Auslesen sämtlicher Positionsdaten.
	   * 
	   * @return die Tabelle der Positionsdaten
	   
	 * @return 
	 */
	public Vector getRows() { 
		// TODO Auto-generated method
		return null;
	 }
	/**
	 * 
	   * Entfernen einer Zeile.
	   * 
	   * @param r die zu entfernende Zeile.
	   
	 * @param r 
	 */
	public void removeRow(Row r) { 
		// TODO Auto-generated method
	 } 

}
