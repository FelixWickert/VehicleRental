package de.hdm.VehicleRental.client;

import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.History;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.DockLayoutPanel;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Panel;
import com.google.gwt.user.client.ui.PopupPanel;
import com.google.gwt.user.client.ui.RootLayoutPanel;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TabLayoutPanel;
import com.google.gwt.user.client.ui.TabPanel;
import com.google.gwt.user.client.ui.UIObject;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;

public class Navigation {
    
    public HorizontalPanel hpp;
    
    
    public Navigation(){}
	
    
	public void getNavigation(){
	    
	    
	  VerticalPanel vp = new VerticalPanel();
	  HorizontalPanel hp = new HorizontalPanel();
	  vp.setStyleName("verticalpanel");
	  
	  
	  Button button1 = new Button("button1");
	  Button button2 = new Button("button2");
	  button1.setStyleName("button");
	  button2.setStyleName("button");
	  button1.addClickHandler(new ButtonClickHandler());
	  button2.addClickHandler(new HistoryHandler());
	  
	  


	  vp.add(button1);
	  vp.add(button2);
	  hp.add(vp);
	  TabPanel a = getReservationView();
	  
	  hp.add(a);
	  hp.setCellWidth(vp, "300px");

	  
	   RootPanel.get("main").add(hp);

	    
	   
	
    }
	    
	

public TabPanel getReservationView(){
	
	Label abc = new Label("abc");
	  TabPanel p = new TabPanel();
	  p.add(abc, "abc");
	  abc.setSize("50px", "40px");

	    p.add(new HTML("Foo"), "foo");
	    
	    p.add(new HTML("Bar"), "bar");
	    p.add(new HTML("Baz"), "baz");
	    p.setStyleName("tabpanel");
	    
	    return p;

	    // Attach the LayoutPanel to the RootLayoutPanel. The latter will listen for
	    // resize events on the window to ensure that its children are informed of
	    // possible size changes.
	    }

class HistoryHandler implements ClickHandler{
	    
	    public void onClick (ClickEvent Event){
		
		History.back();
	    }
	}
		
class ButtonClickHandler implements ClickHandler {
		    
		    public void onClick(ClickEvent event){
			
			Window.alert("Dies ist nur ein Test");
		    }
		
		}
	    
	

}


