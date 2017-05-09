package de.hdm.thies.bankProjekt.server.db;

import java.sql.Connection;

public class DBConnection {

	/**
	 * 
	 * Die Klasse DBConnection wird nur einmal instantiiert. Man spricht hierbei
	 * von einem sogenannten <b>Singleton</b>.
	 * <p>
	 * Diese Variable ist durch den Bezeichner <code>static</code> nur einmal
	 * für sämtliche eventuellen Instanzen dieser Klasse vorhanden. Sie
	 * speichert die einzige Instanz dieser Klasse.
	 * 
	 * @see AccountMapper.accountMapper()
	 * @see CustomerMapper.customerMapper()
	 
	 */
	private static Connection con;
	/**
	 * 
	 */
	private static String localUrl;
	/**
	 * 
	 * Die URL, mit deren Hilfe die Datenbank angesprochen wird. In einer
	 * professionellen Applikation würde diese Zeichenkette aus einer
	 * Konfigurationsdatei eingelesen oder über einen Parameter von außen
	 * mitgegeben, um bei einer Veränderung dieser URL nicht die gesamte
	 * Software neu komilieren zu müssen.
	 
	 */
	private static String googleUrl;
	/**
	 * Getter of con
	 */
	public Connection getCon() {
	 	 return con; 
	}
	/**
	 * Setter of con
	 */
	public void setCon(Connection con) { 
		 this.con = con; 
	}
	/**
	 * Getter of localUrl
	 */
	public String getLocalUrl() {
	 	 return localUrl; 
	}
	/**
	 * Setter of localUrl
	 */
	public void setLocalUrl(String localUrl) { 
		 this.localUrl = localUrl; 
	}
	/**
	 * Getter of googleUrl
	 */
	public String getGoogleUrl() {
	 	 return googleUrl; 
	}
	/**
	 * Setter of googleUrl
	 */
	public void setGoogleUrl(String googleUrl) { 
		 this.googleUrl = googleUrl; 
	}
	/**
	 * 
	 * Diese statische Methode kann aufgrufen werden durch
	 * <code>DBConnection.connection()</code>. Sie stellt die
	 * Singleton-Eigenschaft sicher, indem Sie dafür sorgt, dass nur eine
	 * einzige Instanz von <code>DBConnection</code> existiert.
	 * <p>
	 * 
	 * <b>Fazit:</b> DBConnection sollte nicht mittels <code>new</code>
	 * instantiiert werden, sondern stets durch Aufruf dieser statischen
	 * Methode.
	 * <p>
	 * 
	 * <b>Nachteil:</b> Bei Zusammenbruch der Verbindung zur Datenbank - dies
	 * kann z.B. durch ein unbeabsichtigtes Herunterfahren der Datenbank
	 * ausgelöst werden - wird keine neue Verbindung aufgebaut, so dass die in
	 * einem solchen Fall die gesamte Software neu zu starten ist. In einer
	 * robusten Lösung würde man hier die Klasse dahingehend modifizieren, dass
	 * bei einer nicht mehr funktionsfähigen Verbindung stets versucht würde,
	 * eine neue Verbindung aufzubauen. Dies würde allerdings ebenfalls den
	 * Rahmen dieses Projekts sprengen.
	 * 
	 * @return DAS <code>DBConncetion</code>-Objekt.
	 * @see con
	 
	 * @return 
	 */
	public static Connection connection() { 
		// TODO Auto-generated method
		return null;
	 } 

}
