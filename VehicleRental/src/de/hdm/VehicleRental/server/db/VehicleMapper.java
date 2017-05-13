package de.hdm.VehicleRental.server.db;


import java.util.Vector;

import de.hdm.VehicleRental.shared.bo.Profile;
import de.hdm.VehicleRental.shared.bo.Vehicle;
import de.hdm.VehicleRental.server.db.DBConnection;
import java.sql.*;


public class VehicleMapper {

	/**
	 * 
	   * Die Klasse CustomerMapper wird nur einmal instantiiert. Man spricht hierbei
	   * von einem sogenannten <b>Singleton</b>.
	   * <p>
	   * Diese Variable ist durch den Bezeichner <code>static</code> nur einmal für
	   * sämtliche eventuellen Instanzen dieser Klasse vorhanden. Sie speichert die
	   * einzige Instanz dieser Klasse.
	   * 
	   * @see accountMapper()
	   
	 */
	private static VehicleMapper vehicleMapper = null;


	/**
	 * Der Null-Konstruktor mit dem Accessmodifier protected. Dadurch können
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

	
	public Vehicle insert(Vehicle v) {
	Connection con = DBConnection.connection();

	try {
		Statement stmt = con.createStatement();

		/*
		 * Zun�chst schauen wir nach, welches der momentan h�chste
		 * Prim�rschl�sselwert ist.
		 */
		ResultSet rs = stmt.executeQuery("SELECT MAX(AutoID) AS maxid " + "FROM auto");

		// Wenn wir etwas zur�ckerhalten, kann dies nur einzeilig sein
		if (rs.next()) {
			/*
			 * a erh�lt den bisher maximalen, nun um 1 inkrementierten
			 * Prim�rschl�ssel.
			 */
			v.setId(rs.getInt("maxid") + 1);

			stmt = con.createStatement();

			// Jetzt erst erfolgt die tats�chliche Einf�geoperation
			stmt.executeUpdate("INSERT INTO profil (Marke, AutoID, FZGTyp, Leistung) " + "VALUES ("
					+ v.getBrand() + ",'" + v.getVehicleID() + "', " + v.getVehicleModel() + ", '" + v.getVehiclePerformance() + "'" + ")");
		}
	} catch (SQLException e2) {
		e2.printStackTrace();
	}
	return v;
}
	
	
	
	
	public void delete(Vehicle vehicleID) {
		// DB-Verbindung holen
		Connection con = DBConnection.connection();

		try {
			// Leeres SQL-Statement (JDBC) anlegen
						Statement stmt = con.createStatement();
			
			stmt.executeUpdate("DELETE FROM profil " + "WHERE autoID= " + vehicleID.getId());

		} catch (SQLException e2) {
			e2.printStackTrace();	
			}	
		}
	
	
	
	
	/**
	 * 
	   * Suchen eines Kunden mit vorgegebener Kundennummer. Da diese eindeutig ist,
	   * wird genau ein Objekt zur�ckgegeben.
	   * 
	   * @param id Primärschlüsselattribut (->DB)
	   * @return Kunden-Objekt, das dem übergebenen Schlüssel entspricht, null bei
	   *         nicht vorhandenem DB-Tupel.
	   
	 * @param vehicleID 
	 * @return 
	 */
	public Vehicle findByID(int vehicleID) {
		// DB-Verbindung holen
		Connection con = DBConnection.connection();

		try {
			// Leeres SQL-Statement (JDBC) anlegen
			Statement stmt = con.createStatement();

			// Statement ausfüllen und als Query an die DB schicken
			ResultSet rs = stmt.executeQuery("SELECT * FROM `auto` WHERE autoID = " + vehicleID);

			/*
			 * Da id Primärschlüssel ist, kann max. nur ein Tupel
			 * zurückgegeben werden. Prüfe, ob ein Ergebnis vorliegt.
			 */
			if (rs.next()) {
				// Ergebnis-Tupel in Objekt umwandeln
				Vehicle a = new Vehicle();
				a.setId(rs.getInt("ID"));
				a.setBrand(rs.getString("Marke"));
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
	   * Wiederholtes Schreiben eines Objekts in die Datenbank.
	   * 
	   * @param c das Objekt, das in die DB geschrieben werden soll
	   * @return das als Parameter übergebene Objekt
	   
	 * @param vehicleID 
	 * @return 
	 */
	public Vehicle update(Vehicle vehicleID) { 
		// TODO Auto-generated method
		return null;
	 }

	/**
	 * 
	   * Auslesen aller Kunden.
	   * 
	   * @return Ein Vektor mit Customer-Objekten, die sämtliche Kunden
	   *         repräsentieren. Bei evtl. Exceptions wird ein partiell gef�llter
	   *         oder ggf. auch leerer Vetor zurückgeliefert.
	   
	 * @return 
	 */
	public Vector findAll() { 
		// TODO Auto-generated method
		return null;
	 }

	/**
	 * 
	   * Diese statische Methode kann aufgrufen werden durch
	   * <code>CustomerMapper.customerMapper()</code>. Sie stellt die
	   * Singleton-Eigenschaft sicher, indem Sie dafür sorgt, dass nur eine einzige
	   * Instanz von <code>CustomerMapper</code> existiert.
	   * <p>
	   * 
	   * <b>Fazit:</b> CustomerMapper sollte nicht mittels <code>new</code>
	   * instantiiert werden, sondern stets durch Aufruf dieser statischen Methode.
	   * 
	   * @return DAS <code>CustomerMapper</code>-Objekt.
	   * @see customerMapper
	   
	 * @return 
	 */
	public static VehicleMapper vehicleMapper() { 
		// TODO Auto-generated method
		return null;
	 }





}
