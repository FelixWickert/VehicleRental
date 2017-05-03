package de.hdm.thies.bankProjekt.server.db;

import de.hdm.thies.bankProjekt.server.db.Profile;
import java.util.Vector;

public class ProfileMapper {

	/**
	 * 
	   * Die Klasse AccountMapper wird nur einmal instantiiert. Man spricht hierbei
	   * von einem sogenannten <b>Singleton</b>.
	   * <p>
	   * Diese Variable ist durch den Bezeichner <code>static</code> nur einmal für
	   * sämtliche eventuellen Instanzen dieser Klasse vorhanden. Sie speichert die
	   * einzige Instanz dieser Klasse.
	   * 
	   * @see accountMapper()
	   
	 */
	private static ProfileMapper profileMapper;

	/**
	 * Getter of profileMapper
	 */
	public ProfileMapper getProfileMapper() {
	 	 return profileMapper; 
	}

	/**
	 * Setter of profileMapper
	 */
	public void setProfileMapper(ProfileMapper profileMapper) { 
		 this.profileMapper = profileMapper; 
	}

	/**
	 * 
	   * Löschen der Daten eines <code>Account</code>-Objekts aus der Datenbank.
	   * 
	   * @param a das aus der DB zu löschende "Objekt"
	   
	 * @param profileID 
	 */
	public void delete(Profile profileID) { 
		// TODO Auto-generated method
	 }

	/**
	 * 
	   * Einfügen eines <code>Account</code>-Objekts in die Datenbank. Dabei wird
	   * auch der Primärschlüssel des übergebenen Objekts geprüft und ggf.
	   * berichtigt.
	   * 
	   * @param a das zu speichernde Objekt
	   * @return das bereits übergebene Objekt, jedoch mit ggf. korrigierter
	   *         <code>id</code>.
	   
	 * @param profilID 
	 * @return 
	 */
	public Profile insert(Profile profilID) { 
		// TODO Auto-generated method
		return null;
	 }

	/**
	 * 
	   * Wiederholtes Schreiben eines Objekts in die Datenbank.
	   * 
	   * @param a das Objekt, das in die DB geschrieben werden soll
	   * @return das als Parameter übergebene Objekt
	   
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
	   * wird genau ein Objekt zur�ckgegeben.
	   * 
	   * @param id Primärschlüsselattribut (->DB)
	   * @return Konto-Objekt, das dem übergebenen Schlüssel entspricht, null bei
	   *         nicht vorhandenem DB-Tupel.
	   
	 * @param profileID 
	 * @return 
	 */
	public Profile findByID(int profileID) { 
		// TODO Auto-generated method
		return null;
	 }

	/**
	 * 
	   * Auslesen aller Konten eines durch Fremdschlüssel (Kundennr.) gegebenen
	   * Kunden.
	   * 
	   * @see findByOwner(Customer owner)
	   * @param ownerID Schlüssel des zugehörigen Kunden.
	   * @return Ein Vektor mit Account-Objekten, die sämtliche Konten des
	   *         betreffenden Kunden repräsentieren. Bei evtl. Exceptions wird ein
	   *         partiell gefüllter oder ggf. auch leerer Vetor zurückgeliefert.
	   
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
	   * Singleton-Eigenschaft sicher, indem Sie dafür sorgt, dass nur eine einzige
	   * Instanz von <code>AccountMapper</code> existiert.
	   * <p>
	   * 
	   * <b>Fazit:</b> AccountMapper sollte nicht mittels <code>new</code>
	   * instantiiert werden, sondern stets durch Aufruf dieser statischen Methode.
	   * 
	   * @return DAS <code>AccountMapper</code>-Objekt.
	   * @see accountMapper
	   
	 * @return 
	 */
	public static ProfileMapper profileMapper() { 
		// TODO Auto-generated method
		return null;
	 }

	/**
	 * 
	   * Auslesen aller Konten.
	   * 
	   * @return Ein Vektor mit Account-Objekten, die sämtliche Konten
	   *         repräsentieren. Bei evtl. Exceptions wird ein partiell gefüllter
	   *         oder ggf. auch leerer Vetor zurückgeliefert.
	   
	 * @return 
	 */
	public Vector findAll() { 
		// TODO Auto-generated method
		return null;
	 } 

}
