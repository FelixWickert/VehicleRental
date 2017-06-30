package server.db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

import shared.bo.Reservation;

public class ReservationMapper {

	/**
	 * 
	   * Die Klasse TransactionMapper wird nur einmal instantiiert. Man spricht
	   * hierbei von einem sogenannten <b>Singleton</b>.
	   * <p>
	   * Diese Variable ist durch den Bezeichner <code>static</code> nur einmal für
	   * sämtliche eventuellen Instanzen dieser Klasse vorhanden. Sie speichert die
	   * einzige Instanz dieser Klasse.
	   * 
	   * @see transactionMapper()
	   
	 */
	private static ReservationMapper reservationMapper;

	/**
	 * Getter of reservationMapper
	 */
	public ReservationMapper getReservationMapper() {
	 	 return reservationMapper; 
	}

	/**
	 * Setter of reservationMapper
	 */
	public void setReservationMapper(ReservationMapper reservationMapper) { 
		 this.reservationMapper = reservationMapper; 
	}

	public Reservation insert(Reservation r) { 
	    Connection con = DBConnection.connection();

	    try {
	      Statement stmt = con.createStatement();

	      /*
	       * Zunächst schauen wir nach, welches der momentan höchste
	       * Primärschlüsselwert ist.
	       */
	      ResultSet rs = stmt.executeQuery("SELECT MAX(VehicleID) AS maxid "
	          + "FROM reservation ");

	      // Wenn wir etwas zurückerhalten, kann dies nur einzeilig sein
	      if (rs.next()) {
	        /*
	         * a erhält den bisher maximalen, nun um 1 inkrementierten
	         * Primärschlüssel.
	         */
	        r.setId(rs.getInt("maxid") + 1);

	        stmt = con.createStatement();

	        // Jetzt erst erfolgt die tatsächliche Einfügeoperation
	        stmt.executeUpdate("INSERT INTO reservation (ReservationID, VehicleID) "
	            + "VALUES ("
	            + r.getReservationID()
	            + ","
	            + r.getVehicleID());
	           
	      }}
	    
	    catch (SQLException e2) {
	      e2.printStackTrace();
	    }
return r;
}}
