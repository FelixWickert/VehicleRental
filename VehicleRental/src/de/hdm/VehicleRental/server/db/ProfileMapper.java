package de.hdm.VehicleRental.server.db;

import java.util.Vector;

import de.hdm.VehicleRental.shared.bo.Profile;
import de.hdm.VehicleRental.server.db.DBConnection;

import java.sql.*;
//import de.hdm.VehicleRental.server.db.Profile;

//import java.sql.*;

//import de.hdm.VehicleRental.shared.bo.*;

public class ProfileMapper {

	/**
	 * 
	 * Die Klasse AccountMapper wird nur einmal instantiiert. Man spricht
	 * hierbei von einem sogenannten <b>Singleton</b>.
	 * <p>
	 * Diese Variable ist durch den Bezeichner <code>static</code> nur einmal
	 * fÃ¼r sÃ¤mtliche eventuellen Instanzen dieser Klasse vorhanden. Sie
	 * speichert die einzige Instanz dieser Klasse.
	 * 
	 * @see accountMapper()
	 * 
	 * 
	 *      /** Die MapperKlassen werden nur einmal instantiiert. Es wird die
	 *      einzige Instanz der Klasse gespeichert
	 */
	private static ProfileMapper profileMapper = null;

	/**
	 * Der Null-Konstruktor mit dem Accessmodifier protected. Dadurch kÃ¶nnen
	 * nur die Klassen in dem selben Package auf diese Methode zugreifen.
	 */
	protected ProfileMapper() {
	}

	/**
	 * Hier wird die Instanz erstellt, sofern keine vorhanden ist.
	 * 
	 * @return freeTextMapper
	 */
	public static ProfileMapper profileMapper() {
		if (profileMapper == null) {
			profileMapper = new ProfileMapper();
		}
		return profileMapper;
	}

	/**
	 * 
	 * EinfÃ¼gen eines <code>Account</code>-Objekts in die Datenbank. Dabei wird
	 * auch der PrimÃ¤rschlÃ¼ssel des Ã¼bergebenen Objekts geprÃ¼ft und ggf.
	 * berichtigt.
	 * 
	 * @param a
	 *            das zu speichernde Objekt
	 * @return das bereits Ã¼bergebene Objekt, jedoch mit ggf. korrigierter
	 *         <code>id</code>.
	 * 
	 * @param profilID
	 * @return
	 */
	public Profile insert(Profile p) {
		Connection con = DBConnection.connection();

		try {
			Statement stmt = con.createStatement();

			/*
			 * Zunächst schauen wir nach, welches der momentan höchste
			 * Primärschlüsselwert ist.
			 */
			ResultSet rs = stmt.executeQuery("SELECT MAX(ProfilID) AS maxid " + "FROM profil");

			// Wenn wir etwas zurückerhalten, kann dies nur einzeilig sein
			if (rs.next()) {
				/*
				 * a erhält den bisher maximalen, nun um 1 inkrementierten
				 * Primärschlüssel.
				 */
				p.setId(rs.getInt("maxid") + 1);

				stmt = con.createStatement();

				// Jetzt erst erfolgt die tatsächliche Einfügeoperation
				stmt.executeUpdate("INSERT INTO profil (ProfilID, Name, FührerscheinID, Email, Guthaben) " + "VALUES ("
						+ p.getId() + ",'" + p.getName() + "', " + p.getDriversLicence() + ", '" + p.getEmail() + "', "
						+ p.getBalance() + ")");
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
		return p;
	}

	/**
	 * 
	 * LÃ¶schen der Daten eines <code>Account</code>-Objekts aus der Datenbank.
	 * 
	 * @param profileID
	 *            das aus der DB zu lÃ¶schende "Objekt"
	 * 
	 */
	public void delete(Profile profileID) {
		// DB-Verbindung holen
		Connection con = DBConnection.connection();

		try {
			// Leeres SQL-Statement (JDBC) anlegen
						Statement stmt = con.createStatement();
			
			stmt.executeUpdate("DELETE FROM profil " + "WHERE ProfilID= " + profileID.getId());

		} catch (SQLException e2) {
			e2.printStackTrace();	
			}	
		}
	

	

	
	/**
	 * 
	 * Wiederholtes Schreiben eines Objekts in die Datenbank.
	 * 
	 * @param a
	 *            das Objekt, das in die DB geschrieben werden soll
	 * @return das als Parameter Ã¼bergebene Objekt
	 * 
	 * @param profileID
	 * @return
	 */
	public Profile update(Profile profileID) {
		// TODO Auto-generated method
		return null;
	}

	/**
	 * 
	 * Suchen eines Kontos mit vorgegebener Kontonummer. Da diese eindeutig ist,
	 * wird genau ein Objekt zurï¿½ckgegeben.
	 * 
	 * @param id
	 *            PrimÃ¤rschlÃ¼sselattribut (->DB)
	 * @return Konto-Objekt, das dem Ã¼bergebenen SchlÃ¼ssel entspricht, null
	 *         bei nicht vorhandenem DB-Tupel.
	 * 
	 * @param profileID
	 * @return
	 */
	public Profile findByID(int profileID) {
		// DB-Verbindung holen
		Connection con = DBConnection.connection();

		try {
			// Leeres SQL-Statement (JDBC) anlegen
			Statement stmt = con.createStatement();

			// Statement ausfÃ¼llen und als Query an die DB schicken
			ResultSet rs = stmt.executeQuery("SELECT * FROM `profil` WHERE ProfilID = " + profileID);

			/*
			 * Da id PrimÃ¤rschlÃ¼ssel ist, kann max. nur ein Tupel
			 * zurÃ¼ckgegeben werden. PrÃ¼fe, ob ein Ergebnis vorliegt.
			 */
			if (rs.next()) {
				// Ergebnis-Tupel in Objekt umwandeln
				Profile a = new Profile();
				a.setId(rs.getInt("ProfilID"));
				a.setAdress(rs.getString("Name"));
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
	 * Auslesen aller Konten eines durch FremdschlÃ¼ssel (Kundennr.) gegebenen
	 * Kunden.
	 * 
	 * @see findByOwner(Customer owner)
	 * @param ownerID
	 *            SchlÃ¼ssel des zugehÃ¶rigen Kunden.
	 * @return Ein Vektor mit Account-Objekten, die sÃ¤mtliche Konten des
	 *         betreffenden Kunden reprÃ¤sentieren. Bei evtl. Exceptions wird
	 *         ein partiell gefÃ¼llter oder ggf. auch leerer Vetor
	 *         zurÃ¼ckgeliefert.
	 * 
	 * @param lastName
	 * @return
	 */
	public Profile findByLastName(String lastName) {
		// TODO Auto-generated method
		return null;
	}

	/**
	 * 
	 * Diese statische Methode kann aufgrufen werden durch
	 * <code>AccountMapper.accountMapper()</code>. Sie stellt die
	 * Singleton-Eigenschaft sicher, indem Sie dafÃ¼r sorgt, dass nur eine
	 * einzige Instanz von <code>AccountMapper</code> existiert.
	 * <p>
	 * 
	 * <b>Fazit:</b> AccountMapper sollte nicht mittels <code>new</code>
	 * instantiiert werden, sondern stets durch Aufruf dieser statischen
	 * Methode.
	 * 
	 * @return DAS <code>AccountMapper</code>-Objekt.
	 * @see accountMapper
	 * 
	 * @return
	 */

	/**
	 * 
	 * Auslesen aller Konten.
	 * 
	 * @return Ein Vektor mit Account-Objekten, die sÃ¤mtliche Konten
	 *         reprÃ¤sentieren. Bei evtl. Exceptions wird ein partiell
	 *         gefÃ¼llter oder ggf. auch leerer Vetor zurÃ¼ckgeliefert.
	 * 
	 * @return
	 */
	public Vector findAll() {
		// TODO Auto-generated method
		return null;
	}

}
