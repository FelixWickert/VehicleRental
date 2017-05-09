package de.hdm.VehicleRental.server;

import java.util.logging.Logger;

/**
 * 
 * <p>
 * Klasse mit Eigenschaften und Diensten, die für alle Server-seitigen Klassen
 * relevant sind.
 * </p>
 * <p>
 * In ihrem aktuellen Entwicklungsstand bietet die Klasse eine rudimentäre
 * Unterstützung der Logging-Funkionalität unter Java. Es wird ein
 * applikationszentraler Logger realisiert, der mittels
 * <code>ServerSideSettings.getLogger()</code> genutzt werden kann.
 * </p>
 * 
 * @author thies
 * @version 1.0
 * @since 28.02.2012
 * 
 
 * @author
 */
public class ServersideSettings extends CommonSettings {

	/**
	 * 
	 */
	private static final String LOGGER_NAME;
	/**
	 * 
	 */
	private static final Logger log;
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
	   * Auslesen des applikationsweiten (Server-seitig!) zentralen Loggers.
	   * </p>
	   * 
	   * <h2>Anwendungsbeispiel:</h2> Zugriff auf den Logger herstellen durch:
	   * 
	   * <pre>
	   * Logger logger = ServerSideSettings.getLogger();
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
	   * Bitte auf <em>angemessene Log Levels</em> achten! <em>severe</em> und
	   * <em>info</em> sind nur Beispiele.
	   * </p>
	   * 
	   * <h2>HINWEIS:</h2>
	   * <p>
	   * Beachten Sie, dass Sie den auszugebenden Log nun nicht mehr durch
	   * bedarfsweise Einfügen und Auskommentieren etwa von
	   * <code>System.out.println(...);</code> steuern. Sie belassen künftig
	   * sämtliches Logging im Code und können ohne abermaliges Kompilieren den Log
	   * Level "von außen" durch die Datei <code>logging.properties</code> steuern.
	   * Sie finden diese Datei in dem <code>war/WEB-INF</code>-Ordner Ihres
	   * Projekts. Der dort standardmäßig vorgegebene Log Level ist
	   * <code>WARN</code>. Dies würde bedeuten, dass Sie keine <code>INFO</code>
	   * -Meldungen wohl aber <code>WARN</code>- und <code>SEVERE</code>-Meldungen
	   * erhielten. Wenn Sie also auch Log des Levels <code>INFO</code> wollten,
	   * müssten Sie in dieser Datei <code>.level = INFO</code> setzen.
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
