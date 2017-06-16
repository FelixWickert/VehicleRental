package client;

import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.cellview.client.CellTable;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.History;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
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
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.UIObject;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;



public class Navigation {
    
    public HorizontalPanel hpp;
    
    
    public Navigation(){}
    
    public TabPanel getReservationView(){
	    CellTable b = TableForProfiles.onLoad();
		
		Label abc = new Label("abc");
		  TabPanel p = new TabPanel();
		  abc.setSize("50px", "40px");

		    p.add(b ,"Autos anzeigen   " +"  ");
		    
		    p.setStyleName("tabpanel");
		    
		    return p;

		    // Attach the LayoutPanel to the RootLayoutPanel. The latter will listen for
		    // resize events on the window to ensure that its children are informed of
		    // possible size changes.
		    }
		  
	
    
	public void getNavigation(){
	    
	    
	  VerticalPanel vp = new VerticalPanel();
	  HorizontalPanel hp = new HorizontalPanel();
	  vp.setStyleName("verticalpanel");
	  
	  
	  Button button1 = new Button("button1");
	  final TextBox txtScreenName = new TextBox();
	  Button button2 = new Button("button2");
	  button1.setStyleName("button");
	  button2.setStyleName("button");
	  button1.addClickHandler(new ButtonClickHandler());
	  
	 
	  
	  
	  vp.add(button1);
	  vp.add(button2);
	  vp.add(txtScreenName);
	  hp.add(vp);
	  TabPanel a = getReservationView();
	  
	  hp.add(a);
	  hp.setCellWidth(vp, "300px");
	  
	
			

	  
	   RootPanel.get("main").add(hp);

	    
	   
	
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

	
	  
	  

	  

