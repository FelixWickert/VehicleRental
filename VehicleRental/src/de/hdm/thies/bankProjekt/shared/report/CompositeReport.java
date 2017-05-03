package de.hdm.thies.bankProjekt.shared.report;

import de.hdm.thies.bankProjekt.shared.report.Vector;
import datatype.Long;
import datatype.Integer;

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
	private static final Long serialVersionUID;
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
