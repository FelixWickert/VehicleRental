package de.hdm.VehicleRental.client;

import java.util.logging.Logger;

import de.hdm.VehicleRental.shared.ReportGeneratorAsync;
import de.hdm.VehicleRental.shared.VehicleRentalAdministrationAsync;

public class ClientsideSettings extends CommonSettings {

	/**
	 * 
	   * Name des Client-seitigen Loggers.
	   
	 */
	private static String LOGGER_NAME = "VehicleRental";
	/**
	 * 
	   * Remote Service Proxy zur Verbindungsaufnahme mit dem Server-seitgen Dienst
	   * namens <code>BankAdministration</code>.
	   
	 */
	private static VehicleRentalAdministrationAsync vehicleRentalVerwaltung = null;
	/**
	 * 
	   * Instanz des Client-seitigen Loggers.
	   
	 */
	private static Logger log = Logger.getLogger(LOGGER_NAME);
	/**
	 * 
	   * Remote Service Proxy zur Verbindungsaufnahme mit dem Server-seitgen Dienst
	   * namens <code>ReportGenerator</code>.
	   
	 */
	private static ReportGeneratorAsync reportGenerator = null;
	/**
	 * Getter of LOGGER_NAME
	 */
	public String getLOGGER_NAME() {
	 	 return LOGGER_NAME; 
	}
	/**
	 * Setter of LOGGER_NAME
	 */
	public void setLOGGER_NAME(String LOGGER_NAME) { 
		 this.LOGGER_NAME = LOGGER_NAME; 
	}
	/**
	 * 
	   * <p>
	   * Anlegen und Auslesen der applikationsweit eindeutigen BankAdministration. Diese
	   * Methode erstellt die BankAdministration, sofern sie noch nicht existiert. Bei
	   * wiederholtem Aufruf dieser Methode wird stets das bereits zuvor angelegte
	   * Objekt zurückgegeben.
	   * </p>
	   * 
	   * <p>
	   * Der Aufruf dieser Methode erfolgt im Client z.B. durch
	   * <code>BankAdministrationAsync bankVerwaltung = ClientSideSettings.getBankVerwaltung()</code>
	   * .
	   * </p>
	   * 
	   * @return eindeutige Instanz des Typs <code>BankAdministrationAsync</code>
	   * @author Peter Thies
	   * @since 28.02.2012
	   
	 * @return 
	 */
	public VehicleRentalAdministrationAsync getVehicleRentalVerwaltung() {
	 	 return vehicleRentalVerwaltung; 
	}
	/**
	 * Setter of vehicleRentalVerwaltung
	 */
	public void setVehicleRentalVerwaltung(VehicleRentalAdministrationAsync vehicleRentalVerwaltung) { 
		 this.vehicleRentalVerwaltung = vehicleRentalVerwaltung; 
	}
	/**
	 * Getter of log
	 */
	public Logger getLog() {
	 	 return log; 
	}
	/**
	 * Setter of log
	 */
	public void setLog(Logger log) { 
		 this.log = log; 
	}
	/**
	 * 
	   * <p>
	   * Anlegen und Auslesen des applikationsweit eindeutigen ReportGenerators.
	   * Diese Methode erstellt den ReportGenerator, sofern dieser noch nicht
	   * existiert. Bei wiederholtem Aufruf dieser Methode wird stets das bereits
	   * zuvor angelegte Objekt zurückgegeben.
	   * </p>
	   * 
	   * <p>
	   * Der Aufruf dieser Methode erfolgt im Client z.B. durch
	   * <code>ReportGeneratorAsync reportGenerator = ClientSideSettings.getReportGenerator()</code>
	   * .
	   * </p>
	   * 
	   * @return eindeutige Instanz des Typs <code>BankAdministrationAsync</code>
	   * @author Peter Thies
	   * @since 28.02.2012
	   
	 * @return 
	 */
	public ReportGeneratorAsync getReportGenerator() {
	 	 return reportGenerator; 
	}
	/**
	 * Setter of reportGenerator
	 */
	public void setReportGenerator(ReportGeneratorAsync reportGenerator) { 
		 this.reportGenerator = reportGenerator; 
	}
	/**
	 * 
	   * <p>
	   * Auslesen des applikationsweiten (Client-seitig!) zentralen Loggers.
	   * </p>
	   * 
	   * <h2>Anwendungsbeispiel:</h2> Zugriff auf den Logger herstellen durch:
	   * 
	   * <pre>
	   * Logger logger = ClientSideSettings.getLogger();
	   * </pre>
	   * 
	   * und dann Nachrichten schreiben etwa mittels
	   * 
	   * <pre>
	   * logger.severe(&quot;Sie sind nicht berechtigt, ...&quot;);
	   * </pre>
	   * 
	   * oder
	   * 
	   * <pre>
	   * logger.info(&quot;Lege neuen Kunden an.&quot;);
	   * </pre>
	   * 
	   * <p>
	   * Bitte auf <em>angemessene Log Levels</em> achten! Severe und info sind nur
	   * Beispiele.
	   * </p>
	   * 
	   * <h2>HINWEIS:</h2>
	   * <p>
	   * Beachten Sie, dass Sie den auszugebenden Log nun nicht mehr durch
	   * bedarfsweise Einfügen und Auskommentieren etwa von
	   * <code>System.out.println(...);</code> steuern. Sie belassen künftig
	   * sämtliches Logging im Code und können ohne abermaliges Kompilieren den Log
	   * Level "von außen" durch die Datei <code>logging.properties</code> steuern.
	   * Sie finden diese Datei in Ihrem <code>war/WEB-INF</code>-Ordner. Der dort
	   * standardmäßig vorgegebene Log Level ist <code>WARN</code>. Dies würde
	   * bedeuten, dass Sie keine <code>INFO</code>-Meldungen wohl aber
	   * <code>WARN</code>- und <code>SEVERE</code>-Meldungen erhielten. Wenn Sie
	   * also auch Log des Levels <code>INFO</code> wollten, müssten Sie in dieser
	   * Datei <code>.level = INFO</code> setzen.
	   * </p>
	   * 
	   * Weitere Infos siehe Dokumentation zu Java Logging.
	   * 
	   * @return die Logger-Instanz für die Server-Seite
	   
	 * @return 
	 */
	public static Logger getLogger() { 
		// TODO Auto-generated method
		return null;
	 } 

}
