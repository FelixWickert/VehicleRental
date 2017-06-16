package client;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.i18n.client.Constants;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.CheckBox;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;

public class CustomButtoon extends  Composite implements ClickHandler, Constants{
    private TextBox textBox = new TextBox();
    private CheckBox checkBox = new CheckBox();
    
    private Button a1 = new Button();
    private Button a2 = new Button();
    private FlowPanel fp = new FlowPanel();

    private HTML htmlWidget;

    public CustomButtoon(String text){}
    
    public  void getCB(){
    
	initWidget(fp);
	fp.add(a1);
	fp.add(a2);
	a1.addClickHandler(this);
htmlWidget.getElement().getStyle().setBackgroundColor("blue");


a2.addClickHandler(this);
	
    }
    
    public void onClick(ClickEvent event){
	
	
	
	
	
	Widget sender = (Widget) event.getSource();
	
	
	if(sender==a1){
	    
	    
	    //handle b1
	}
	if(sender ==a2){
	    
	    
	   //handle b2
	}
	
	
	
	
	
	
	
	
	
    
    }





}