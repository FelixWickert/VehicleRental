package de.hdm.VehicleRental.server.db;

import java.util.Vector;

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
	private static VehicleMapper vehicleMapper;

	/**
	 * Getter of vehicleMapper
	 */
	public VehicleMapper getVehicleMapper() {
	 	 return vehicleMapper; 
	}

	/**
	 * Setter of vehicleMapper
	 */
	public void setVehicleMapper(VehicleMapper vehicleMapper) { 
		 this.vehicleMapper = vehicleMapper; 
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
		// TODO Auto-generated method
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

	/**
	 * 
	   * Löschen der Daten eines <code>Customer</code>-Objekts aus der Datenbank.
	   * 
	   * @param c das aus der DB zu löschende "Objekt"
	   
	 * @param vehicleID 
	 */
	public void delete(Vehicle vehicleID) { 
		// TODO Auto-generated method
	 }

	/**
	 * 
	   * Einfügen eines <code>Customer</code>-Objekts in die Datenbank. Dabei wird
	   * auch der Primärschlüssel des übergebenen Objekts geprüft und ggf.
	   * berichtigt.
	   * 
	   * @param c das zu speichernde Objekt
	   * @return das bereits übergebene Objekt, jedoch mit ggf. korrigierter
	   *         <code>id</code>.
	   
	 * @param vehicleID 
	 * @return 
	 */
	public Vehicle insert(Vehicle vehicleID) { 
		// TODO Auto-generated method
		return null;
	 } 

}
