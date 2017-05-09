package de.hdm.thies.bankProjekt.shared.bo;

import java.io.Serializable;
import datatype.Long;
import datatype.Integer;
import datatype.Boolean;
import java.lang.Object;

/**
 * 
 * <p>
 * Die Klasse <code>BusinessObject</code> stellt die Basisklasse aller in diesem
 * Projekt für die Umsetzung des Fachkonzepts relevanten Klassen dar.
 * </p>
 * <p>
 * Zentrales Merkmal ist, dass jedes <code>BusinessObject</code> eine Nummer
 * besitzt, die man in einer relationalen Datenbank auch als Primärschlüssel
 * bezeichnen würde. Fernen ist jedes <code>BusinessObject</code> als
 * {@link Serializable} gekennzeichnet. Durch diese Eigenschaft kann jedes
 * <code>BusinessObject</code> automatisch in eine textuelle Form überführt und
 * z.B. zwischen Client und Server transportiert werden. Bei GWT RPC ist diese
 * textuelle Notation in JSON (siehe http://www.json.org/) kodiert.
 * </p>
 * 
 * @author thies
 * @version 1.0
 
 * @author
 */
public abstract class BusinessObject implements Serializable {

	/**
	 * 
	 */
	private static final Long serialVersionUID;
	/**
	 * 
	   * Die eindeutige Identifikationsnummer einer Instanz dieser Klasse.
	   
	 */
	private Integer id;
	/**
	 * Getter of serialVersionUID
	 */
	public Long getSerialVersionUID() {
	 	 return serialVersionUID; 
	}
	/**
	 * Setter of serialVersionUID
	 */
	public void setSerialVersionUID(Long serialVersionUID) { 
		 this.serialVersionUID = serialVersionUID; 
	}
	/**
	 * 
	   * Auslesen der ID.
	   
	 * @return 
	 */
	public Integer getId() {
	 	 return id; 
	}
	/**
	 * 
	   * Setzen der ID
	   
	 * @param id 
	 */
	public void setId(Integer id) { 
		 this.id = id; 
	}
	/**
	 * 
	   * <p>
	   * Feststellen der <em>inhaltlichen</em> Gleichheit zweier
	   * <code>BusinessObject</code>-Objekte. Die Gleichheit wird in diesem Beispiel auf eine
	   * identische ID beschränkt.
	   * </p>
	   * <p>
	   * <b>ACHTUNG:</b> Die inhaltliche Gleichheit nicht mit dem Vergleich der
	   * <em>Identität</em> eines Objekts mit einem anderen verwechseln!!! Dies
	   * würde durch den Operator <code>==</code> bestimmt. Bei Unklarheit hierzu
	   * können Sie nocheinmal in die Definition des Sprachkerns von Java schauen.
	   * Die Methode <code>equals(...)</code> ist für jeden Referenzdatentyp
	   * definiert, da sie bereits in der Klasse <code>Object</code> in einfachster
	   * Form realisiert ist. Dort ist sie allerdings auf die simple Bestimmung der
	   * Gleicheit der Java-internen Objekt-ID der verglichenen Objekte beschränkt.
	   * In unseren eigenen Klassen können wir diese Methode überschreiben und ihr
	   * mehr Intelligenz verleihen.
	   * </p>
	   
	 * @param o 
	 * @return 
	 */
	public Boolean equals(Object o) { 
		// TODO Auto-generated method
		return null;
	 }
	/**
	 * 
	   * <p>
	   * Erzeugen einer ganzen Zahl, die für das <code>BusinessObject</code> charakteristisch ist.
	   * </p>
	   * <p>
	   * Zusammen mit <code>equals</code> sollte diese Methode immer definiert werden. Manche Java-Klassen
	   * verwendenden <code>hashCode</code>, um initial ein Objekt (z.B. in einer Hashtable) zu identifizieren. Erst danach
	   * würde mit <code>equals</code> festgestellt, ob es sich tatsächlich um das gesuchte Objekt handelt.
	   
	 * @return 
	 */
	public Integer hashCode() { 
		// TODO Auto-generated method
		return null;
	 }
	/**
	 * 
	   * Erzeugen einer einfachen textuellen Darstellung der jeweiligen Instanz.
	   * Dies kann selbstverständlich in Subklassen überschrieben werden.
	   
	 * @return 
	 */
	public String toString() { 
		// TODO Auto-generated method
		return null;
	 } 

}
