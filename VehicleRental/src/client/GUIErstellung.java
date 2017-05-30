package client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.KeyCodes;
import com.google.gwt.event.dom.client.KeyUpEvent;
import com.google.gwt.event.dom.client.KeyUpHandler;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.rpc.ServiceDefTarget;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.DockLayoutPanel;
import com.google.gwt.user.client.ui.DockPanel;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootLayoutPanel;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.ScrollPanel;
import com.google.gwt.user.client.ui.SplitLayoutPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;

import client.Header;
import client.Navigation;
import client.ReservationGUI;
import shared.VehicleRentalAdministration;
import shared.VehicleRentalAdministrationAsync;
/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class GUIErstellung implements EntryPoint {


 

    /**
     * This is the entry point method.
     */
public void onModuleLoad() {
	
	
	Header headregion = new Header();
	headregion.getHeader();
	
	Navigation navigation = new Navigation();
	navigation.getNavigation();
	
	ReservationGUI reservationgui= new ReservationGUI();
	reservationgui.getReservationGUI();
	
	
	


		
		
	}}