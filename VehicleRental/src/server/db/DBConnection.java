package server.db;

import java.sql.Connection;
import java.sql.DriverManager;

//import com.google.appengine.api.utils.SystemProperty;

public class DBConnection {
		

	private static Connection con = null;

	private static String urlLocal = "jdbc:mysql://127.0.0.1:3306/vehiclerental?user=root&password=";
	

	public static Connection connection() {
		 // Wenn es bisher keine Conncetion zur DB gab, ...
        if (con == null) {
            String url = null;
            try {
               
                    Class.forName("com.mysql.jdbc.Driver");
                    url = urlLocal;
                
                /*
                 * Dann erst kann uns der DriverManager eine Verbindung mit den
                 * oben in der Variable url angegebenen Verbindungsinformationen
                 * aufbauen.
                 * 
                 * Diese Verbindung wird dann in der statischen Variable con
                 * abgespeichert und fortan verwendet.
                 */
                con = DriverManager.getConnection(url);
            } catch (Exception e) {
                con = null;
                e.printStackTrace();
            }
        }

        // Zur�ckgegeben der Verbindung
        return con;
	}

	
	
	
}
