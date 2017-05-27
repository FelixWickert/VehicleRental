package de.hdm.VehicleRental.shared.report;


import java.io.Serializable;
import java.util.Date;

public abstract class Report implements Serializable {

	/**
	 * 
	   * Jeder Bericht kann einen individuellen Titel besitzen.
	   
	 */
	private String title;
	/**
	 * 
	   * Kopfdaten des Berichts.
	   
	 */
	private Paragraph headerData;
	/**
	 * 
	   * 
	   
	 */
	private static final Long serialVersionUID = 1L;
	/**
	 * 
	   * Datum der Erstellung des Berichts.
	   
	 */
	private Date created;
	/**
	 * 
	   * Ein kleines Impressum, das eine Art Briefkopf darstellt. Jedes Unternehmen
	   * einige Daten wie Firmenname, Adresse, Logo, etc. auf Geschäftsdokumenten
	   * ab. Dies gilt auch für die hier realisierten Reports.
	   
	 */
	private Paragraph imprint;
	/**
	 * 
	   * Auslesen des Berichtstitels.
	   * 
	   * @return Titeltext
	   
	 * @return 
	 */
	public String getTitle() {
	 	 return title; 
	}
	/**
	 * 
	   * Setzen des Berichtstitels.
	   * 
	   * @param title Titeltext
	   
	 * @param title 
	 */
	public void setTitle(String title) { 
		 this.title = title; 
	}
	/**
	 * 
	   * Auslesen der Kopfdaten.
	   * 
	   * @return Text der Kopfdaten.
	   
	 * @return 
	 */
	public Paragraph getHeaderData() {
	 	 return headerData; 
	}
	/**
	 * 
	   * Setzen der Kopfdaten.
	   * 
	   * @param headerData Text der Kopfdaten.
	   
	 * @param headerData 
	 */
	public void setHeaderData(Paragraph headerData) { 
		 this.headerData = headerData; 
	}

	/**
	 * 
	   * Auslesen des Erstellungsdatums.
	   * 
	   * @return Datum der Erstellung des Berichts
	   
	 * @return 
	 */
	public Date getCreated() {
	 	 return created; 
	}
	/**
	 * 
	   * Setzen des Erstellungsdatums. <b>Hinweis:</b> Der Aufruf dieser Methoden
	   * ist nicht unbedingt erforderlich, da jeder Report bei seiner Erstellung
	   * automatisch den aktuellen Zeitpunkt festhält.
	   * 
	   * @param created Zeitpunkt der Erstellung
	   
	 * @param created 
	 */
	public void setCreated(Date created) { 
		 this.created = created; 
	}
	/**
	 * 
	   * Auslesen des Impressums.
	   * 
	   * @return Text des Impressums
	   
	 * @return 
	 */
	public Paragraph getImprint() {
	 	 return imprint; 
	}
	/**
	 * 
	   * Setzen des Impressums.
	   * 
	   * @param imprint Text des Impressums
	   
	 * @param imprint 
	 */
	public void setImprint(Paragraph imprint) { 
		 this.imprint = imprint; 
	} 

}
