package de.hdm.VehicleRental.client;

import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.CheckBox;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;

public class CustomButtoon extends  Composite{
    private TextBox textBox = new TextBox();
    private CheckBox checkBox = new CheckBox();

    
    public CustomButtoon(String text){
	  // Place the check above the text box using a vertical panel.
	Button a = new Button();
	
	

	      // All composites must call initWidget() in their constructors.
	      initWidget(a);

	      // Give the overall composite a style name.
	      setStyleName("button");
}
    







}