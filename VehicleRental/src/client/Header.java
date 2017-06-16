package client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.KeyDownEvent;
import com.google.gwt.event.dom.client.KeyDownHandler;
import com.google.gwt.event.dom.client.KeyPressEvent;
import com.google.gwt.event.dom.client.KeyPressHandler;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootLayoutPanel;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextBox;

import javafx.scene.input.KeyCode;
import shared.VehicleRentalAdministration;
import shared.VehicleRentalAdministrationAsync;

public class Header {
    
    
    
    
    public Header(){}
	
	public void getHeader(){
	    
	    
	  final HorizontalPanel hp = new HorizontalPanel();
	  
	  	Image image = new Image("/img/logo.png");
	  	image.setStyleName("image");
	  	hp.setStyleName("header");
	  	
	  	Button aButton = new Button("Text");
	  	
	  	
TextBox txt = new TextBox();

	  	Label l1 = new Label("Angebote");
	  	Label l2 = new Label("Stationen");
	  	Label l3 = new Label("Fahrzeugflotte");
hp.add(txt);	  	
                l1.setStyleName("l1");	  
                l2.setStyleName("l2");
                l3.setStyleName("l3");
	  	
	  	
	  	
	  	
	  	
	  	
	  hp.add(image);
	  hp.add(l1);
	  hp.add(l2);
	  hp.add(l3);
	  hp.add(aButton);
	  hp.setSize("1900px","300px");
	  
	  
	  

	  	
	  
	   RootPanel.get("header").add(hp);
	   final AsyncCallback <String> getTextForLabel = new AsyncCallback<String> (){
 		    
		    public void  onFailure(Throwable e){
			  Window.alert("Error" + e.getMessage());
			  
		      }
		    
		    public void onSuccess(String text){
			hp.add(new Label(text));
		    
		    
		    }
	  };


	  aButton.addClickHandler(new ClickHandler(){
	  	    
	  	    public void onClick(ClickEvent event){
	  		VehicleRentalAdministrationAsync service = GWT.create(VehicleRentalAdministration.class);
	  		service.getTextForLabel( "adfsadf", getTextForLabel);}}
	);};}
		