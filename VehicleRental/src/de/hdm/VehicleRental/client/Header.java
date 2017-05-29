package de.hdm.VehicleRental.client;

import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootLayoutPanel;
import com.google.gwt.user.client.ui.RootPanel;

public class Header {
    
    
    
    
    public Header(){}
	
	public void getHeader(){
	    
	    
	  HorizontalPanel hp = new HorizontalPanel();
	  
	  	Image image = new Image("/img/logo.png");
	  	image.setStyleName("image");
	  	hp.setStyleName("header");
	  	
	  	
	  	Label l1 = new Label("Angebote");
	  	Label l2 = new Label("Stationen");
	  	Label l3 = new Label("Fahrzeugflotte");
	  	
                l1.setStyleName("l1");	  
                l2.setStyleName("l2");
                l3.setStyleName("l3");
	  	
	  	
	  	
	  	
	  	
	  	
	  hp.add(image);
	  hp.add(l1);
	  hp.add(l2);
	  hp.add(l3);
	  hp.setSize("1900px","300px");

	  	
	  
	   RootPanel.get("header").add(hp);
	    
	    
	    
	    
	    
	    
	    
	
	
	
    }
    
    

}
