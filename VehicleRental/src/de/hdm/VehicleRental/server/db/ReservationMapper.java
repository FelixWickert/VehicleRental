package de.hdm.VehicleRental.server.db;

import datatype.Integer;
import java.util.Vector;

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

	/**
	 * 
	   * Wiederholtes Schreiben eines Objekts in die Datenbank.
	   * 
	   * @param t das Objekt, das in die DB geschrieben werden soll
	   * @return das als Parameter übergebene Objekt
	   
	 * @param reservationID 
	 * @return 
	 */
	public Reservation update(Integer reservationID) { 
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
	public static ReservationMapper reservationMapper() { 
		// TODO Auto-generated method
		return null;
	 }

	/**
	 * 
	   * Suchen einer Buchung mit vorgegebener Buchungsnummer. Da diese eindeutig
	   * ist, wird genau ein Objekt zur�ckgegeben.
	   * 
	   * @param id Primärschlüsselattribut (->DB)
	   * @return Transaction-Objekt, das dem übergebenen Schlüssel entspricht, null
	   *         bei nicht vorhandenem DB-Tupel.
	   
	 * @param reservationID 
	 * @return 
	 */
	public Reservation findByID(int reservationID) { 
		// TODO Auto-generated method
		return null;
	 }

	/**
	 * 
	   * Löschen der Daten eines <code>Transaction</code>-Objekts aus der Datenbank.
	   * 
	   * @param t das aus der DB zu löschende "Objekt"
	   
	 * @param reservationID 
	 */
	public void delete(Reservation reservationID) { 
		// TODO Auto-generated method
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
	   
	 * @param reservationID 
	 * @return 
	 */
	public Reservation insert(Reservation reservationID) { 
		// TODO Auto-generated method
		return null;
	 } 

}
