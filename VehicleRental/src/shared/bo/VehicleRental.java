package shared.bo;


public class VehicleRental extends BusinessObject {

	/**
	 * 
	   * Ortsbezeichnung der Bank.
	   
	 */
	private String city;
	/**
	 * 
	 */
	private String versionNumber;
	/**
	 * 
	   * Straße und Hausnummer der Bank.
	   
	 */
	private String street;
	/**
	 * 
	   * Name der Bank
	   
	 */
	private String name;
	/**
	 * 
	   * Postleitzahl der Bank.
	   
	 */
	private Integer zip;
	/**
	 * 
	 */
	/**
	 * 
	   * Auslesen des Orts.
	   
	 * @return 
	 */
	public String getCity() {
	 	 return city; 
	}
	/**
	 * 
	   * Setzen des Orts der Bank, z.B. "Stuttgart"
	   
	 * @param string 
	 */
	public void setCity(String city) { 
		 this.city = city; 
	}
	/**
	 * Getter of versionNumber
	 */
	public String getVersionNumber() {
	 	 return versionNumber; 
	}
	/**
	 * 
	 * @param string 
	 */
	public void setVersionNumber(String versionNumber) { 
		 this.versionNumber = versionNumber; 
	}
	/**
	 * 
	   * Auslesen der Straßenadresse der Bank
	   
	 * @return 
	 */
	public String getStreet() {
	 	 return street; 
	}
	/**
	 * 
	   * Setzen der Straßenadresse der Bank, z.B. "Nobelstr. 10".
	   
	 * @param string 
	 */
	public void setStreet(String street) { 
		 this.street = street; 
	}
	/**
	 * 
	   * Auslesen des Namens der Bank, z.B. "Sparkasse Stuttgart"
	   
	 * @return 
	 */
	public String getName() {
	 	 return name; 
	}
	/**
	 *  
	   * Setzen des Namens der Bank.
	   
	 * @param string 
	 */
	public void setName(String name) { 
		 this.name = name; 
	}
	/**
	 * 
	   * Auslesen der Postleitzahl.
	   
	 * @return 
	 */
	public Integer getZip() {
	 	 return zip; 
	}
	/**
	 * Setter of zip
	 */
	public void setZip(Integer zip) { 
		 this.zip = zip; 
	}
	/**
	 * Getter of serialVersionUID
	 */
	

	public void getVersionNumber(String string) { 
		// TODO Auto-generated method
	 }
	/**
	 * 
	   * Setzen der Postleitzahl
	   
	 * @param zipID 
	 */
	public void setZip(int zipID) { 
		// TODO Auto-generated method
	 } 

}
