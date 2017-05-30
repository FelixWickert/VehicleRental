package client;

import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.Grid;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.FlexTable.FlexCellFormatter;



public class ReservationGUI {

	
    
    
    
    
    
    
    
    public ReservationGUI(){}
    
    public void getReservationGUI(){
	

	
	FlexTable hp = new FlexTable();
	
	HorizontalPanel hp1 = new HorizontalPanel();

	hp.setStyleName("table");
	Label lb = new Label("Anfang");
	Label lb2 = new Label("Ende");
	Button button1 = new Button("butt");
	Button button2 = new Button("butt2");
	
	
	hp.add(lb);
	hp.add(lb2);
	hp.add(button1);
	hp.add(button2);
	hp1.add(hp);

	

	
	RootPanel.get("maintable").add(hp1);
	
	

	
    }
}