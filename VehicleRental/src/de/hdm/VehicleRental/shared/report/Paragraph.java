package de.hdm.thies.bankProjekt.shared.report;

import datatype.Long;

public abstract class Paragraph implements Serializable {

	/**
	 * 
	   * 
	   
	 */
	private static final Long serialVersionUID;

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

}
