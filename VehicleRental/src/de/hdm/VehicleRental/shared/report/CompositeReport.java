package de.hdm.VehicleRental.shared.report;

import java.io.Serializable;
import java.util.Vector;

public abstract class CompositeReport extends Report implements Serializable {

	/**
	 * 
		 * Die Menge der Teil-Reports.
		 
	 */
	private Vector subReports;
	/**
	 * 
	   * 
	   
	 */
	private static final Long serialVersionUID = 1L;
	/**
	 * Getter of subReports
	 */
	public Vector getSubReports() {
	 	 return subReports; 
	}
	/**
	 * Setter of subReports
	 */
	public void setSubReports(Vector subReports) { 
		 this.subReports = subReports; 
	}

	/**
	 * 
		 * Auslesen der Anzahl von Teil-Reports.
		 * @return int Anzahl der Teil-Reports.
		 
	 * @return 
	 */
	public Integer getNumSubReports() { 
		// TODO Auto-generated method
		return null;
	 }
	/**
	 * 
		 * Hinzufügen eines Teil-Reports.
		 * @param r der hinzuzufügende Teil-Report.
		 
	 * @param r 
	 */
	public void addSubReport(Report r) { 
		// TODO Auto-generated method
	 }
	/**
	 * 
		 * Entfernen eines Teil-Reports.
		 * @param r der zu entfernende Teil-Report.
		 
	 * @param r 
	 */
	public void removeSubReport(Report r) { 
		// TODO Auto-generated method
	 }
	/**
	 * 
		 * Auslesen eines einzelnen Teil-Reports.
		 * @param i Position des Teilreports. Bei n Elementen läuft der Index i von 0
		 * bis n-1.
		 * 
		 * @return Position des Teil-Reports.
		 
	 * @param i 
	 * @return 
	 */
	public Report getSubReportAt(Integer i) { 
		// TODO Auto-generated method
		return null;
	 } 

}
