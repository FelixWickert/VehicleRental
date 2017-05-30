package de.hdm.VehicleRental.server.db;

//TODO

// delete einzeln in vektor und gesate reservation Zeile 357

import java.util.Vector;
import de.hdm.VehicleRental.shared.bo.Vehicle;
import de.hdm.VehicleRental.shared.bo.BusinessObject;
import de.hdm.VehicleRental.shared.bo.Profile;
//import de.hdm.VehicleRental.shared.bo.Reservation;
import de.hdm.VehicleRental.server.db.DBConnection;
import java.sql.*;

public class ReservationMapper {

	/**
	 * 
	 * Die Klasse ReservationMapper wird nur einmal instantiiert. Man spricht
	 * hierbei von einem sogenannten <b>Singleton</b>.
	 * <p>
	 * Diese Variable ist durch den Bezeichner <code>static</code> nur einmal
	 * für sämtliche eventuellen Instanzen dieser Klasse vorhanden. Sie
	 * speichert die einzige Instanz dieser Klasse.
	 * 
	 * @see ReservationMapper()
	 * 
	 */
	private static ReservationMapper reservationMapper = null;

	/**
	 * Der Null-Konstruktor mit dem Accessmodifier protected. Dadurch können nur
	 * die Klassen in dem selben Package auf diese Methode zugreifen.
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
	
	private int reservationID = 0;

	/**
	 * 
	 * Einfügen eines <code>Vehicle</code>-Objekts und eines
	 * <code>Profile</code>-Objekts in die Datenbank. Dabei wird auch der
	 * Primärschlüssel des übergebenen Objekts geprüft und ggf. berichtigt.
	 * 
	 * @param a
	 *            das zu speichernde Objekt
	 * @return das bereits übergebene Objekt, jedoch mit ggf. korrigierter
	 *         <code>id</code>.
	 * 
	 * @param vehicleID
	 * @return
	 */

	/**
	 * MIT DATE
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
				reservationID = (rs.getInt("maxid") + 1);
				stmt = con.createStatement();

				// Jetzt erst erfolgt die tats�chliche Einf�geoperation
				stmt.executeUpdate("INSERT INTO reservation (ReservationID, VehicleID, ProfilID, reservationDate ) " + "VALUES ("
						+ reservationID + ", "+ v.getID() + ", " + p.getID() + " , " + d.getDate() + "'" + ")"); // date
																							// ignorieren?
				/**
				 * TODO
				 */


			}
		} catch (SQLException e2) {
			e2.printStackTrace();
		}
	}

	/**
	 * OHNE DATE
	 */
	public void insert(Vehicle v, Profile p) {
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
				reservationID = (rs.getInt("maxid") + 1);
				stmt = con.createStatement();

				// Jetzt erst erfolgt die tats�chliche Einf�geoperation
				stmt.executeUpdate("INSERT INTO reservation (ReservationID, VehicleID, ProfilID) " + "VALUES (" + reservationID + ", " + v.getID() + ", "
						+ p.getID() + ")"); // date
													// ignorieren?

			}
		} catch (SQLException e2) {
			e2.printStackTrace();
		}
	}
	
	/**
	 * TODO Neue METHIDE F�R delete
	 */

	public void deleteOneReserverationOfProfile(Profile profile, Vehicle vehicle) {
		// DB-Verbindung holen
		Connection con = DBConnection.connection();

		try {
			// Leeres SQL-Statement (JDBC) anlegen
			Statement stmt = con.createStatement();

			/*
			 * Wegen der Referenziellen Datenintegrität muss der Eintrag erst in
			 * T_USERPROFILE, dann in T_PROFILE gelöscht werden
			 */
			stmt.executeUpdate("DELETE FROM reservation " + "WHERE ProfilID=" + profile.getID() + " AND VehicleID= " + vehicle.getID());
			
			
		} catch (SQLException e2) {
			e2.printStackTrace();
		}
	}

	
	

	/**
	 * 
	 * Löschen der Daten eines <code>Reservation</code>-Objekts aus der
	 * Datenbank.
	 * 
	 * @param vehicleID
	 *            das aus der DB zu löschende "Objekt"
	 * 
	 */

	public void deleteAllReserverationsOfVehicle(Vehicle vehicle) {
		// DB-Verbindung holen
		Connection con = DBConnection.connection();

		try {
			// Leeres SQL-Statement (JDBC) anlegen
			Statement stmt = con.createStatement();
			/*
			 * Wegen der Referenziellen Datenintegrität muss der Eintrag erst in
			 * T_USERPROFILE, dann in T_PROFILE gelöscht werden
			 */

			stmt.executeUpdate("DELETE FROM reservation " + "WHERE VehicleID=" + vehicle.getID());

		} catch (SQLException e2) {
			e2.printStackTrace();
		}
	}

	public void deleteAllReserverationsOfProfile(Profile profile) {
		// DB-Verbindung holen
		Connection con = DBConnection.connection();

		try {
			// Leeres SQL-Statement (JDBC) anlegen
			Statement stmt = con.createStatement();

			/*
			 * Wegen der Referenziellen Datenintegrität muss der Eintrag erst in
			 * T_USERPROFILE, dann in T_PROFILE gelöscht werden
			 */

			stmt.executeUpdate("DELETE FROM reservation " + "WHERE ProfilID=" + profile.getID());

		} catch (SQLException e2) {
			e2.printStackTrace();
		}

	}

	/**
	 * 
	 * Suchen eines Fahrzeugs mit vorgegebener ID. Da diese eindeutig ist, wird
	 * genau ein Objekt zur�ckgegeben.
	 * 
	 * @param id
	 *            Primärschlüsselattribut (->DB)
	 * @return Konto-Objekt, das dem übergebenen Schlüssel entspricht, null bei
	 *         nicht vorhandenem DB-Tupel.
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
			ResultSet rs = stmt.executeQuery("SELECT * FROM `reservation` WHERE ProfilID = " + p.getID());

			/*
			 * Da id Primärschlüssel ist, kann max. nur ein Tupel zurückgegeben
			 * werden. Prüfe, ob ein Ergebnis vorliegt.
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
			ResultSet rs = stmt.executeQuery("SELECT * FROM `reservation` WHERE VehicleID = " + vehicleID.getID());

			/*
			 * Da id Primärschlüssel ist, kann max. nur ein Tupel zurückgegeben
			 * werden. Prüfe, ob ein Ergebnis vorliegt.
			 */
			while (rs.next()) {
				// Ergebnis-Tupel in Objekt umwandeln
				Profile p = new Profile();
				p.setID(rs.getInt("ProfilID"));
				result.add(p);
			}
			return result;
		} catch (SQLException e2) {
			e2.printStackTrace();
			return null;
		}
	}
}

	/**
	 * TODO ALTE METHIDE F�R getReservationsByProfile
	 */
	// public Vector<Reservation> getReservationsByProfile(Profile profilID) {
	//
	// // DB-Verbindung holen
	// Connection con = DBConnection.connection();
	// Vector<Reservation> result = new Vector<Reservation>();
	// try {
	// // Leeres SQL-Statement (JDBC) anlegen
	// Statement stmt = con.createStatement();
	//
	// // Statement ausfüllen und als Query an die DB schicken
	// ResultSet rs = stmt.executeQuery("SELECT * FROM `resevation` WHERE
	// ProfilID = " + profilID.getID());
	//
	// /*
	// * Da id Primärschlüssel ist, kann max. nur ein Tupel
	// * zurückgegeben werden. Prüfe, ob ein Ergebnis vorliegt.
	// */
	// while (rs.next()) {
	// // Ergebnis-Tupel in Objekt umwandeln
	// Reservation r = new Reservation();
	// r.setID(rs.getInt("ReservationID"));
	// result.add(r);
	// }
	// return result;
	// } catch (SQLException e2) {
	// e2.printStackTrace();
	// return null;
	// }
	// }
	// /**
	// * TODO NEUE METHIDE F�R getReservationsByProfile, LOL alle Reservation
	// mit
	// * Profile ersetzt
	// */
	// public Vector<Profile> getReservationsByProfile(Profile profilID) {
	//
	// // DB-Verbindung holen
	// Connection con = DBConnection.connection();
	// Vector<Profile> result = new Vector<Profile>();
	// try {
	// // Leeres SQL-Statement (JDBC) anlegen
	// Statement stmt = con.createStatement();
	//
	// // Statement ausfüllen und als Query an die DB schicken
	// ResultSet rs = stmt.executeQuery("SELECT * FROM `resevation` WHERE
	// ProfilID = " + profilID.getID());
	//
	// /*
	// * Da id Primärschlüssel ist, kann max. nur ein Tupel zurückgegeben
	// * werden. Prüfe, ob ein Ergebnis vorliegt.
	// */
	// while (rs.next()) {
	// // Ergebnis-Tupel in Objekt umwandeln
	// Profile p = new Profile();
	// p.setID(rs.getInt("ReservationID"));
	// result.add(p);
	// }
	// return result;
	// } catch (SQLException e2) {
	// e2.printStackTrace();
	// return null;
	// }
	// }

	/**
	 * TODO ALTE METHIDE F�R delete
	 */
	// public void delete(Reservation reservationID) {
	// // DB-Verbindung holen
	// Connection con = DBConnection.connection();
	//
	// try {
	// // Leeres SQL-Statement (JDBC) anlegen
	// Statement stmt = con.createStatement();
	//
	// /*
	// * Wegen der Referenziellen Datenintegrität muss der Eintrag erst
	// * in T_USERPROFILE, dann in T_PROFILE gelöscht werden
	// */
	// stmt.executeUpdate("DELETE FROM reservation " + "WHERE ReservationID=" +
	// reservationID.getID());
	// } catch (SQLException e2) {
	// e2.printStackTrace();
	// }
	//
	// Profile p = new Profile();
	// p = reservationID.getProfile();
	// reservationMapper.delete(p);
	//
	// Vehicle v = new Vehicle();
	// v = reservationID.getVehicle();
	// reservationMapper.delete(v);
	// }
	// }



// /**
// *
// * Auslesen aller Fahrzeuge.
// *
// * @return Ein Vektor mit Vehicle-Objekten, die sämtliche Fahrzeuge
// * repräsentieren. Bei evtl. Exceptions wird ein partiell gef�llter
// * oder ggf. auch leerer Vetor zurückgeliefert.
//
// * @return
// */
// public static Vector<Reservation> getAllReservations() {
// Vector<Reservation> result = new Vector<Reservation>();
//
// /* Datenbankverbindung wird geholt */
// Connection con = DBConnection.connection();
//
// try {
// /* Leeres Statement wird angelegt */
// Statement stmt = con.createStatement();
//
//
// ResultSet rs = stmt.executeQuery("SELECT * FROM reservation");
//
// /*
// * Für jeden Eintrag im Suchergebnis wird nun ein UserProfile-Objekt
// * erstellt.
// */
// while (rs.next()) {
// // Ergebnis-Tupel in Objekt umwandeln
// Reservation p = new Reservation();
// p.setID(rs.getInt("ReservationID"));
// p.setVehicle(rs.getObject("VehicleID"));
// p.setProfil(rs.getObject("ProfilID"));
// p.setDate(rs.getDate("reservationDate"));
//
// /* Hinzufügen des neuen Objekts zum Ergebnisvektor */
// result.addElement(p);
// }
// /* Sollte ein Fehler auftreten, wird der Fehler zurückgegeben */
// } catch (SQLException e2) {
// e2.printStackTrace();
// }
// /* Ergebnisvektor zurückgeben */
// return result;
// }
// }
