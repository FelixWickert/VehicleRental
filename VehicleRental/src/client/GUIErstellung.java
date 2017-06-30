package client;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.google.gwt.cell.client.TextCell;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.cellview.client.CellList;
import com.google.gwt.user.cellview.client.CellTable;
import com.google.gwt.user.cellview.client.TextColumn;
import com.google.gwt.user.client.History;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.view.client.SelectionChangeEvent;
import com.google.gwt.view.client.SingleSelectionModel;
import shared.VehicleRentalAdministration;
import shared.VehicleRentalAdministrationAsync;


/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
import shared.bo.Vehicle;
public class GUIErstellung implements EntryPoint {
    
    String astring = new String();
    
    final VehicleRentalAdministrationAsync va = GWT.create(VehicleRentalAdministration.class);
    private List< String> vehicles = Arrays.asList("asdf","asdf");
    Button buttonMessage = new Button();
    TextBox a = new TextBox();
    
    
    int aj ;
    
    
    @Override
    public void onModuleLoad() {
		
	 va.getTextForLabel(astring, new  StringCallback ());
	 Button ab = new Button("c2");
	  
va.getVehicleList(new Callback2 ());	 
	 
	 
	RootPanel.get("header").add(buttonMessage);

	 TextCell textCell = new TextCell();
	    // Create a CellList that uses the cell.
	    CellList<String> cellList = new CellList<String>(textCell);

	
	    cellList.setRowCount(vehicles.size(), true);
	    // Push the data into the widget.
	    cellList.setRowData(0, vehicles);
	    
	    RootPanel.get("header").add(cellList);
	
	
    }
    
    
    
    
	
    class Callback2 implements AsyncCallback <ArrayList<Vehicle>>{

	@Override
	public void onFailure(Throwable caught) {
	    // TODO Auto-generated method stub
	    
	}

	


	@Override
	public void onSuccess(ArrayList<Vehicle> result) {
	  final ArrayList <Vehicle>ergebnis = result;
	    
	    final CellTable<Vehicle> table = new CellTable<Vehicle>();
table.setRowCount(ergebnis.size(), true);	
table.setRowData(0, ergebnis);
	    
	    TextColumn<Vehicle> Category = new TextColumn<Vehicle>(){
		public String getValue(Vehicle object){
		     
				
			    return object.getVehicleCategory();

			    }

		    
		
	    };
	    TextColumn<Vehicle> Colour = new TextColumn<Vehicle>() {
		
		
		      public String getValue(Vehicle object) {
			
			return object.getVehicleColour();
			      
		      }
			  

		    };
		    
		    
		TextColumn<Vehicle> model = new TextColumn<Vehicle>(){
		    
		    public String getValue(Vehicle object){
			
			
			return object.getVehicleModel();
		    }
		    
		};
		    
		    
		    
		    
		    
		    table.addColumn(Category,"Kategorie");
		    table.addColumn(model,"Modell");
		    table.addColumn(Colour, "Farbe");
		    

		    table.setColumnWidth(0, "300px");
		    table.setColumnWidth(1, "300px");
		    table.setColumnWidth(2, "300px");

		    final SingleSelectionModel<Vehicle> selectionModel = new SingleSelectionModel<Vehicle>();
		    table.setSelectionModel(selectionModel);
		    
		    selectionModel.addSelectionChangeHandler(new SelectionChangeEvent.Handler() {
			
			
			
		      public void onSelectionChange(SelectionChangeEvent event) {
		        Vehicle selected = selectionModel.getSelectedObject();
		        if (selected.getVehicleCategory()=="SUV") {
		        RootPanel.get("main").clear();    
		       ShowSingleCar a = new ShowSUV();
		        RootPanel.get("main").add(a);
}
		       else if (selected.getVehicleCategory()=="Kombi"){
			        RootPanel.get("main").clear();   
			        
			        
			      
			        
	

			ShowSingleCar b = new ShowKombi();
			
		        RootPanel.get("main").add(b);
}   

		 

		        
		      }
		    });


RootPanel.get("header").add(table);

	}
	
	
    }
    
    
    public void setUpHistoryManagement(){
History.newItem("ABC");



    }
  
    
    
    class StringCallback implements AsyncCallback <String>{
	
	String as = new String();
	
	

	   @Override
	   public void onFailure(Throwable caught) {
	      Window.alert("Unable to obtain server response: "
	      + caught.getMessage());	
	   }

	   @Override
	   public void onSuccess(String result) {
	       
TextBox a = new TextBox();
a.setText(result);
a.setVisible(false);
RootPanel.get("main").add(a);

	       
	   
	   
	   }

	   
	
}
    
    
}

    
    