package de.hdm.VehicleRental.server.db;

import java.util.Vector;
import de.hdm.VehicleRental.shared.bo.Vehicle;
import de.hdm.VehicleRental.shared.bo.Profile;
import de.hdm.VehicleRental.shared.bo.Reservation;
import de.hdm.VehicleRental.server.db.DBConnection;
import java.sql.*;

public class ReservationMapper {

	/**
	 * 
	   * Die Klasse ReservationMapper wird nur einmal instantiiert. Man spricht
	   * hierbei von einem sogenannten <b>Singleton</b>.
	   * <p>
	   * Diese Variable ist durch den Bezeichner <code>static</code> nur einmal für
	   * sämtliche eventuellen Instanzen dieser Klasse vorhanden. Sie speichert die
	   * einzige Instanz dieser Klasse.
	   * 
	   * @see ReservationMapper()
	   
	 */
	private static ReservationMapper reservationMapper = null;

	/**
	 * Der Null-Konstruktor mit dem Accessmodifier protected. Dadurch können
	 * nur die Klassen in dem selben Package auf diese Methode zugreifen.
	 */
	protected ReservationMapper() {
	}
	
	
	/**
	 * Hier wird die Instanz erstellt, sofern keine vorhanden ist.
	 * 
	 * @return freeTextMapper
	 */
	public static ReservationMapper reservationMapper() {
		if (reservationMapper == null) {
			reservationMapper = new ReservationMapper();
		}
		return reservationMapper;
	}
	
	/**
	 * 
	 * Einfügen eines <code>Vehicle</code>-Objekts und eines <code>Profile</code>-Objekts 
	 * in die Datenbank. Dabei wird
	 * auch der Primärschlüssel des übergebenen Objekts geprüft und ggf.
	 * berichtigt.
	 * 
	 * @param a
	 *            das zu speichernde Objekt
	 * @return das bereits übergebene Objekt, jedoch mit ggf. korrigierter
	 *         <code>id</code>.
	 * 
	 * @param vehicleID
	 * @return
	 */
	public void insert(Vehicle v, Profile p, Date d) {
	Connection con = DBConnection.connection();

	try {
		Statement stmt = con.createStatement();
		/*
		 * Zun�chst schauen wir nach, welches der momentan h�chste
		 * Prim�rschl�sselwert ist.
		 */
		ResultSet rs = stmt.executeQuery("SELECT MAX(ReservationID) AS maxid " + "FROM reservation");
		
		// Wenn wir etwas zur�ckerhalten, kann dies nur einzeilig sein
		if (rs.next()) {
			/*
			 * a erh�lt den bisher maximalen, nun um 1 inkrementierten
			 * Prim�rschl�ssel.
			 */
			v.setID(rs.getInt("maxid") + 1);
			stmt = con.createStatement();

			// Jetzt erst erfolgt die tats�chliche Einf�geoperation
			stmt.executeUpdate("INSERT INTO reservation (VehicleID, ProfilID, reservationDate ) " + "VALUES ("
					+ v.getID() + ", " 
					+ p.getID() + " , " 
					+ d.getDate() + "'" + ")"); //date ignorieren?
		}
	} catch (SQLException e2) {
		e2.printStackTrace();
		}
	}
	
	
	/**
	 * 
	 * Löschen der Daten eines <code>Reservation</code>-Objekts aus der Datenbank.
	 * 
	 * @param vehicleID
	 *            das aus der DB zu löschende "Objekt"
	 * 
	 */
	
//	public void delete(Vehicle vehicleID) {
//	public void delete(Profile PorifleID) {
//	Auto kommt rein, 
	
	public void delete(Vehicle vehicle) {
		// DB-Verbindung holen
		Connection con = DBConnection.connection();

		try {
			// Leeres SQL-Statement (JDBC) anlegen
						Statement stmt = con.createStatement();
						
						
						/*
						 * Wegen der Referenziellen Datenintegrität muss der Eintrag erst in
						 * T_USERPROFILE, dann in T_PROFILE gelöscht werden
						 */
		
		stmt.executeUpdate("DELETE FROM reservation " + "WHERE VehicleID="  + vehicle.getID());

		} catch (SQLException e2) {
			e2.printStackTrace();	
			}	
		}
	
	
	
	
	/**
	 * 
	   * Wiederholtes Schreiben eines Objekts in die Datenbank.
	   * 
	   * @param c das Objekt, das in die DB geschrieben werden soll
	   * @return das als Parameter übergebene Objekt
	   
	 * @param vehicleID 
	 * @return 
	 */
	public Reservation update(Reservation reservationID) { 
		Connection con = DBConnection.connection();
		try {
			Statement stmt = con.createStatement();
			
			/*
			 * Informationen werden in die Datenbank geschrieben Als erstes
			 * werden die Profilattribute gesetzt 
			 */
			stmt.executeUpdate("UPDATE profil SET " + 
			 "ReservationID= " + 		 	reservationID.getID() + ", " + 
			 "VehicleID= " + 			 	reservationID.getVehicle() + ", " + 
			 "ProfilID= " + 				reservationID.getProfil() + ", " + 
			 "reservationDate= " + 		    reservationID.getDate());
	 
			/* Sollte ein Fehler auftreten, wird der Fehler zurückgegeben */
		} catch (SQLException e) {
			e.printStackTrace();
		}
		/* Rückgabe des Ergebnis */
		return reservationID;
	}
	
	
	
	/**
	 * 
	 * Suchen eines Fahrzeugs mit vorgegebener ID. Da diese eindeutig ist,
	 * wird genau ein Objekt zur�ckgegeben.
	 * 
	 * @param id
	 *            Primärschlüsselattribut (->DB)
	 * @return Konto-Objekt, das dem übergebenen Schlüssel entspricht, null
	 *         bei nicht vorhandenem DB-Tupel.
	 * 
	 * @param vehicleID
	 * @return
	 */
	

	
	public Vector<Vehicle> findAllVehiclesByProfile(Profile p) {
		// DB-Verbindung holen
		Connection con = DBConnection.connection();
		Vector<Vehicle> result = new Vector<Vehicle>();
		try {
			// Leeres SQL-Statement (JDBC) anlegen
			Statement stmt = con.createStatement();

			// Statement ausfüllen und als Query an die DB schicken
			ResultSet rs = stmt.executeQuery("SELECT * FROM `resevation` WHERE ProfilID = " + p.getID());

			/*
			 * Da id Primärschlüssel ist, kann max. nur ein Tupel
			 * zurückgegeben werden. Prüfe, ob ein Ergebnis vorliegt.
			 */
			while (rs.next()) {
				// Ergebnis-Tupel in Objekt umwandeln
				Vehicle v = new Vehicle();
				v.setID(rs.getInt("VehicleID"));
				result.add(v);
			}
			return result;
		} catch (SQLException e2) {
			e2.printStackTrace();
			return null;
		}
	}
	

	public Vector<Profile> findAllProfilesByVehicle(Vehicle vehicleID) {
		// DB-Verbindung holen
		Connection con = DBConnection.connection();
		Vector<Profile> result = new Vector<Profile>();
		try {
			// Leeres SQL-Statement (JDBC) anlegen
			Statement stmt = con.createStatement();

			// Statement ausfüllen und als Query an die DB schicken
			ResultSet rs = stmt.executeQuery("SELECT * FROM `resevation` WHERE VehicleID = " + vehicleID.getID());

			/*
			 * Da id Primärschlüssel ist, kann max. nur ein Tupel
			 * zurückgegeben werden. Prüfe, ob ein Ergebnis vorliegt.
			 */
			while (rs.next()) {
				// Ergebnis-Tupel in Objekt umwandeln
				Profile p = new Profile();
				p.setID(rs.getInt("ProfileID"));
				result.add(p);
			}
			return result;
		} catch (SQLException e2) {
			e2.printStackTrace();
			return null;
		}
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/**
	 * 
	   * Auslesen aller Fahrzeuge.
	   * 
	   * @return Ein Vektor mit Vehicle-Objekten, die sämtliche Fahrzeuge
	   *         repräsentieren. Bei evtl. Exceptions wird ein partiell gef�llter
	   *         oder ggf. auch leerer Vetor zurückgeliefert.
	   
	 * @return 
	 */
//	public Vector<Reservation> getAllReservations() {
//		Vector<Reservation> result = new Vector<Reservation>();
//
//		/* Datenbankverbindung wird geholt */
//		Connection con = DBConnection.connection();
//
//		try {
//			/* Leeres Statement wird angelegt */
//			Statement stmt = con.createStatement();
//
//			
//			ResultSet rs = stmt.executeQuery("SELECT * FROM reservation");
//
//			/*
//			 * Für jeden Eintrag im Suchergebnis wird nun ein UserProfile-Objekt
//			 * erstellt.
//			 */
//			while (rs.next()) {
//				// Ergebnis-Tupel in Objekt umwandeln
//				Reservation p = new Reservation();
//				p.setID(rs.getInt("ReservationID"));
//				p.setVehicle(rs.getObject("VehicleID"));
//				p.setProfil(rs.getObject("ProfilID"));
//				p.setDate(rs.getDate("reservationDate"));
//			
//				/* Hinzufügen des neuen Objekts zum Ergebnisvektor */
//				result.addElement(p);
//			}
//			/* Sollte ein Fehler auftreten, wird der Fehler zurückgegeben */
//		} catch (SQLException e2) {
//			e2.printStackTrace();
//		}
//		/* Ergebnisvektor zurückgeben */
//		return result;
//	}
}
