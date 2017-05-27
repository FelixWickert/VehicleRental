package de.hdm.VehicleRental.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.dom.client.ParagraphElement;
import com.google.gwt.user.client.ui.Anchor;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.RootPanel;



public class VehicleRentalProjekt implements EntryPoint {

	/**
	 * 
	   * Da diese Klasse die Implementierung des Interface <code>EntryPoint</code>
	   * zusichert, benötigen wir eine Methode
	   * <code>public void onModuleLoad()</code>. Diese ist das GWT-Pendant der
	   * <code>main()</code>-Methode normaler Java-Applikationen.
	   
	 */
	public void onModuleLoad() { 
		createLoginScreen();
	 } 
	
	 private void createLoginScreen() {
	      
	      //CSS Stylename für die entsprechenden Divs setzen und mit Texten füllen
	      FlowPanel splashContaiern = new FlowPanel();
	      splashContaiern.setStyleName("splash-container");
	      
	      FlowPanel splash = new FlowPanel();
	      splash.setStyleName("splash");

	      HTML headingElement = new HTML();
	      headingElement.setHTML("muh");
	      headingElement.setStyleName("splash-head");

	      FlowPanel splashSubhead = new FlowPanel(ParagraphElement.TAG);
	      splashSubhead.setStyleName("splash-subhead");
	      HTML splahParagraph = new HTML("Melde dich an und finde deine bessere Hälfte");
	      splashSubhead.add(splahParagraph);

	      Anchor loginAnchor = new Anchor("Los!");
	      loginAnchor.setStyleName("pure-button-login pure-button-primary-login");


	      //Divs und Anchor zum Div hinzufügen
	      splash.add(headingElement);
	      splash.add(splashSubhead);
	      splash.add(loginAnchor);
	      
	      splashContaiern.add(splash);
	      RootPanel.get("Details").add(splashContaiern);
	      
	     
	    }

}
