package de.hdm.VehicleRental.server.db;

import java.util.Vector;

import de.hdm.VehicleRental.server.db.MemoryList;
import de.hdm.VehicleRental.server.db.Profile;
import de.hdm.VehicleRental.shared.bo.Vehicle;

public class MemoryListMapper {

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
	private static MemoryListMapper memoryListMapper;

	/**
	 * Getter of memoryListMapper
	 */
	public MemoryListMapper getMemoryListMapper() {
	 	 return memoryListMapper; 
	}

	/**
	 * Setter of memoryListMapper
	 */
	public void setMemoryListMapper(MemoryListMapper memoryListMapper) { 
		 this.memoryListMapper = memoryListMapper; 
	}

	/**
	 * 
	   * Einfügen eines <code>Transaction</code>-Objekts in die Datenbank. Dabei
	   * wird auch der Primärschlüssel des übergebenen Objekts geprüft und ggf.
	   * berichtigt.
	   * 
	   * @param t das zu speichernde Objekt
	   * @return das bereits übergebene Objekt, jedoch mit ggf. korrigierter
	   *         <code>id</code>.
	   
	 * @param memoryListID 
	 * @return 
	 */
	public MemoryListMapper insert(MemoryListMapper memoryListID) { 
		// TODO Auto-generated method
		return null;
	 }

	/**
	 * 
	   * Löschen sÄmtlicher Buchungen (<code>Transaction</code>-Objekte) eines
	   * Kontos. Diese Methode sollte aufgerufen werden, bevor ein
	   * <code>Account</code> -Objekt gelöscht wird.
	   * 
	   * @param a das <code>Account</code>-Objekt, zu dem die Buchungen gehören
	   
	 * @param profileID 
	 */
	public void deleteAllVehiclesOfMemoryList(Profile profileID) { 
		// TODO Auto-generated method
	 }

	/**
	 * 
	   * Diese statische Methode kann aufgrufen werden durch
	   * <code>TransactionMapper.transactionMapper()</code>. Sie stellt die
	   * Singleton-Eigenschaft sicher, indem Sie dafür sorgt, dass nur eine einzige
	   * Instanz von <code>TransactionMapper</code> existiert.
	   * <p>
	   * 
	   * <b>Fazit:</b> TransactionMapper sollte nicht mittels <code>new</code>
	   * instantiiert werden, sondern stets durch Aufruf dieser statischen Methode.
	   * 
	   * @return DAS <code>TransactionMapper</code>-Objekt.
	   * @see transactionMapper
	   
	 * @return 
	 */
	public static MemoryListMapper memoryListMapper() { 
		// TODO Auto-generated method
		return null;
	 }

	/**
	 * 
	   * Wiederholtes Schreiben eines Objekts in die Datenbank.
	   * 
	   * @param t das Objekt, das in die DB geschrieben werden soll
	   * @return das als Parameter übergebene Objekt
	   
	 * @param memoryListID 
	 * @return 
	 */
	public MemoryListMapper update(MemoryListMapper memoryListID) { 
		// TODO Auto-generated method
		return null;
	 }

	/**
	 * 
	   * Auslesen aller Buchungen.
	   * 
	   * @return Ein Vektor mit Transaction-Objekten, die sämtliche Buchungen
	   *         repräsentieren. Bei evtl. Exceptions wird ein partiell gefüllter
	   *         oder ggf. auch leerer Vetor zurückgeliefert.
	   
	 * @return 
	 */
	public Vector findAll() { 
		// TODO Auto-generated method
		return null;
	 }

	/**
	 * 
	   * Löschen der Daten eines <code>Transaction</code>-Objekts aus der Datenbank.
	   * 
	   * @param t das aus der DB zu löschende "Objekt"
	   
	 * @param memoryListID 
	 * @param vehicleID 
	 */
	public void deleteVehicleFromList(MemoryListMapper memoryListID, Vehicle vehicleID) { 
		// TODO Auto-generated method
	 }

	/**
	 * 
	   * Suchen einer Buchung mit vorgegebener Buchungsnummer. Da diese eindeutig
	   * ist, wird genau ein Objekt zur�ckgegeben.
	   * 
	   * @param id Primärschlüsselattribut (->DB)
	   * @return Transaction-Objekt, das dem übergebenen Schlüssel entspricht, null
	   *         bei nicht vorhandenem DB-Tupel.
	   
	 * @param memoryListID 
	 * @return 
	 */
	public MemoryListMapper findByID(int memoryListID) { 
		// TODO Auto-generated method
		return null;
	 } 

}
