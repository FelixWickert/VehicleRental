package client;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.History;
import com.google.gwt.user.client.Window;

public class ClickHandlerCollection implements ClickHandler {
    
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

    @Override
    public void onClick(ClickEvent event) {
	// TODO Auto-generated method stub
	
    }
	    
	

}
