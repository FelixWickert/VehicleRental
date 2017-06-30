package shared.bo;


import java.util.Date;
import java.util.Vector;

/**
 * 
 * <p>
 * Realisierung einer exemplarischen Buchung. Eine Buchung zeichnet sich dadurch
 * aus, dass sie ein Quellkonto und ein Zielkonto besitzt, zwischen denen ein
 * Betrag, der als Geld interopretiert wird umgebucht wird.
 * </p>
 * 
 * @author thies
 * @version 1.0
 * 
 
 * @author
 */
public class Reservation extends BusinessObject  {

	/**
	 * 
	 */
	private static final Long serialVersionUID=12342342L;
	/**
	 * 
	   * Der Betrag der Buchung. Dieser Betrag kann als Geldwert interpretiert
	   * werden. Da ein Buchungssystem stets mit einer einzigen Währung arbeitet, 
	   * ist deren Repräsentation in der Buchung nicht erforderlich.
	   
	 */
	private int reservationID;
	/**
	 * 
	 */
	private Date reservationDate;
	/**
	 * 
	 */
	
	private int vehicleID;
	
	
	private Vector allReservationsForVehicle;
	/**
	 * 
	 */
	private Vector allReservationsForProfile;
	/**
	 * Getter of serialVersionUID
	 */
	public Long getSerialVersionUID() {
	 	 return serialVersionUID; 
	}
	/**
	 * Setter of serialVersionUID
	 */


	public int getReservationID() {
	 	 return reservationID; 
	}
	
	public int getVehicleID(){
	    
	    return this.vehicleID; 
	}
	
	public void setVehicleID(int vehicleID ){
	    
	    this.vehicleID=vehicleID;
	}
	/**
	 * 
	   * Auslesen des Fremdschlüssels des Quellkontos.
	   
	 * @param reservationNumber 
	 */
	public void setReservationNumber(int reservationID) { 
		 this.reservationID = reservationID; 
	}
	/**
	 * 
	   * Auslesen des Buchungswerts.
	   
	 * @return 
	 */
	public Date getReservationDate() {
	 	 return reservationDate; 
	}
	/**
	 * 
	   * Setzen des Buchungswerts.
	   * @param money der zu buchenden Betrag
	   
	 * @param reservationDate 
	 */
	public void setReservationDate(Date reservationDate) { 
		 this.reservationDate = reservationDate; 
	}
	/**
	 * Getter of allReservationsForVehicle
	 */
	public Vector getAllReservationsForVehicle() {
	 	 return allReservationsForVehicle; 
	}
	/**
	 * Setter of allReservationsForVehicle
	 */
	public void setAllReservationsForVehicle(Vector allReservationsForVehicle) { 
		 this.allReservationsForVehicle = allReservationsForVehicle; 
	}
	/**
	 * Getter of allReservationsForProfile
	 */
	public Vector getAllReservationsForProfile() {
	 	 return allReservationsForProfile; 
	}
	/**
	 * Setter of allReservationsForProfile
	 */
	public void setAllReservationsForProfile(Vector allReservationsForProfile) { 
		 this.allReservationsForProfile = allReservationsForProfile; 
	}
	/**
	 * 
	 * @param vehicleID 
	 * @return 
	 */
	public Vector getAllReservationsForVehicle(int vehicleID) { 
		// TODO Auto-generated method
		return null;
	 }
	/**
	 * 
	 * @param profileID 
	 * @return 
	 */
	public Vector getAllReservationsForProfile(int profileID) { 
		// TODO Auto-generated method
		return null;
	 } 

}
