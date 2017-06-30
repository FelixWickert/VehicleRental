package server.db;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Vector;

import shared.bo.Vehicle;


public class VehicleMapper {

	/**
	 * 
	   * Die Klasse VehicleMapper wird nur einmal instantiiert. Man spricht hierbei
	   * von einem sogenannten <b>Singleton</b>.
	   * <p>
	   * Diese Variable ist durch den Bezeichner <code>static</code> nur einmal fÃ¼r
	   * sÃ¤mtliche eventuellen Instanzen dieser Klasse vorhanden. Sie speichert die
	   * einzige Instanz dieser Klasse.
	   * 
	   * @see accountMapper()
	   
	 */
	private static VehicleMapper vehicleMapper = null;
	
	/**
	 * Der Null-Konstruktor mit dem Accessmodifier protected. Dadurch kÃ¶nnen
	 * nur die Klassen in dem selben Package auf diese Methode zugreifen.
	 */
	protected VehicleMapper() {
	}
	
	
	/**
	 * Hier wird die Instanz erstellt, sofern keine vorhanden ist.
	 * 
	 * @return freeTextMapper
	 */
	public static VehicleMapper VehicleMapper() {
		if (vehicleMapper == null) {
			vehicleMapper = new VehicleMapper();
		}
		return vehicleMapper;
	}

	/**
	 * 
	 * EinfÃ¼gen eines <code>Vehicle</code>-Objekts in die Datenbank. Dabei wird
	 * auch der PrimÃ¤rschlÃ¼ssel des Ã¼bergebenen Objekts geprÃ¼ft und ggf.
	 * berichtigt.
	 * 
	 * @param a
	 *            das zu speichernde Objekt
	 * @return das bereits Ã¼bergebene Objekt, jedoch mit ggf. korrigierter
	 *         <code>id</code>.
	 * 
	 * @param vehicleID
	 * @return
	 */
	public Vehicle insert(Vehicle v) {
	Connection con = DBConnection.connection();

	try {
		Statement stmt = con.createStatement();
		/*
		 * Zunächst schauen wir nach, welches der momentan höchste
		 * Primärschlüsselwert ist.
		 */
		ResultSet rs = stmt.executeQuery("SELECT MAX(AutoID) AS maxid " + "FROM auto");
		
		// Wenn wir etwas zurückerhalten, kann dies nur einzeilig sein
		if (rs.next()) {
			/*
			 * a erhält den bisher maximalen, nun um 1 inkrementierten
			 * Primärschlüssel.
			 */
			v.setId(rs.getInt("maxid") + 1);
			stmt = con.createStatement();

			// Jetzt erst erfolgt die tatsächliche Einfügeoperation
			stmt.executeUpdate("INSERT INTO auto (Marke, AutoID, FZGTyp, Leistung) " + "VALUES ('"
					+ v.getBrand() + "'," 
					+ v.getId() + ", '" 
					+ v.getVehicleModel() + "', " 
					+ v.getVehiclePerformance() + "" + ")");
		}
	} catch (SQLException e2) {
		e2.printStackTrace();
	}
	/*
	 * Rückgabe, des evtl. korrigierten Accounts.
	 * 
	 * HINWEIS: Da in Java nur Referenzen auf Objekte und keine physischen
	 * Objekte übergeben werden, wäre die Anpassung des Account-Objekts auch
	 * ohne diese explizite Rückgabe au�erhalb dieser Methode sichtbar. Die
	 * explizite Rückgabe von a ist eher ein Stilmittel, um zu
	 * signalisieren, dass sich das Objekt evtl. im Laufe der Methode
	 * verändert hat.
	 */
	return v;
}
	
	
	
	/**
	 * 
	 * LÃ¶schen der Daten eines <code>Vehicle</code>-Objekts aus der Datenbank.
	 * 
	 * @param vehicleID
	 *            das aus der DB zu lÃ¶schende "Objekt"
	 * 
	 */
	public void delete(Vehicle vehicleID) {
		// DB-Verbindung holen
		Connection con = DBConnection.connection();

		try {
			// Leeres SQL-Statement (JDBC) anlegen
						Statement stmt = con.createStatement();
			
			stmt.executeUpdate("DELETE FROM auto " + "WHERE AutoID= " + vehicleID.getId());

		} catch (SQLException e2) {
			e2.printStackTrace();	
			}	
		}

	
	
	/**
	 * 
	   * Wiederholtes Schreiben eines Objekts in die Datenbank.
	   * 
	   * @param c das Objekt, das in die DB geschrieben werden soll
	   * @return das als Parameter Ã¼bergebene Objekt
	   
	 * @param vehicleID 
	 * @return 
	 */
	public Vehicle update(Vehicle vehicleID) { 
		Connection con = DBConnection.connection();
		try {
			Statement stmt = con.createStatement();
			
			/*
			 * Informationen werden in die Datenbank geschrieben Als erstes
			 * werden die Profilattribute gesetzt 
			 */
			stmt.executeUpdate("UPDATE profil SET " + 
			 "AutoID= " + 		 		vehicleID.getId() + ", " + 
			 "Marke= '" + 			 	vehicleID.getBrand() + "', " + 
			 "FZGTyp= '" + 				vehicleID.getVehicleCategory() + "', " + 
			 "Leistung= '" + 		 	vehicleID.getVehiclePerformance() + "', " + 
			 " WHERE AutoID = " +  		vehicleID.getId());
	 
			/* Sollte ein Fehler auftreten, wird der Fehler zurÃ¼ckgegeben */
		} catch (SQLException e) {
			e.printStackTrace();
		}
		/* RÃ¼ckgabe des Ergebnis */
		return vehicleID;
	}
	
	/**
	 * 
	 * Suchen eines Fahrzeugs mit vorgegebener ID. Da diese eindeutig ist,
	 * wird genau ein Objekt zurï¿½ckgegeben.
	 * 
	 * @param id
	 *            PrimÃ¤rschlÃ¼sselattribut (->DB)
	 * @return Konto-Objekt, das dem Ã¼bergebenen SchlÃ¼ssel entspricht, null
	 *         bei nicht vorhandenem DB-Tupel.
	 * 
	 * @param vehicleID
	 * @return
	 */
	public Vehicle findByID(int vehicleID) {
		// DB-Verbindung holen
		Connection con = DBConnection.connection();

		try {
			// Leeres SQL-Statement (JDBC) anlegen
			Statement stmt = con.createStatement();

			// Statement ausfÃ¼llen und als Query an die DB schicken
			ResultSet rs = stmt.executeQuery("SELECT * FROM `auto` WHERE autoID = " + vehicleID);

			/*
			 * Da id PrimÃ¤rschlÃ¼ssel ist, kann max. nur ein Tupel
			 * zurÃ¼ckgegeben werden. PrÃ¼fe, ob ein Ergebnis vorliegt.
			 */
			if (rs.next()) {
				// Ergebnis-Tupel in Objekt umwandeln
				Vehicle a = new Vehicle();
				a.setId(rs.getInt("ID"));
				a.setBrand(rs.getString("Marke"));
				a.setVehicleCategory(rs.getString("FZGTyp"));
				a.setVehiclePerformance(rs.getInt("Leistung"));
				return a;
			}
		} catch (SQLException e2) {
			e2.printStackTrace();
			return null;
		}
		return null;
	}
	

	/**
	 * 
	   * Auslesen aller Fahrzeuge.
	   * 
	   * @return Ein Vektor mit Vehicle-Objekten, die sÃ¤mtliche Fahrzeuge
	   *         reprÃ¤sentieren. Bei evtl. Exceptions wird ein partiell gefï¿½llter
	   *         oder ggf. auch leerer Vetor zurÃ¼ckgeliefert.
	   
	 * @return 
	 */
	public ArrayList<Vehicle> getAllVehicles() {
		ArrayList<Vehicle> result = new ArrayList<Vehicle>();

		/* Datenbankverbindung wird geholt */
		Connection con = DBConnection.connection();

		try {
			/* Leeres Statement wird angelegt */
			Statement stmt = con.createStatement();

			
			ResultSet rs = stmt.executeQuery("SELECT * FROM Vehicle");

			/*
			 * FÃ¼r jeden Eintrag im Suchergebnis wird nun ein UserProfile-Objekt
			 * erstellt.
			 */
			while (rs.next()) {
				// Ergebnis-Tupel in Objekt umwandeln
				Vehicle p = new Vehicle();
				p.setId(rs.getInt("VehicleID"));
				p.setBrand(rs.getString("Model"));
				p.setVehicleCategory(rs.getString("Category"));
			
				/* HinzufÃ¼gen des neuen Objekts zum Ergebnisvektor */
				result.add(p);
			}
			/* Sollte ein Fehler auftreten, wird der Fehler zurÃ¼ckgegeben */
		} catch (SQLException e2) {
			e2.printStackTrace();
		}
		/* Ergebnisvektor zurÃ¼ckgeben */
		return result;
	}

}
