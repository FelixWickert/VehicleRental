package server;

import java.util.Date;
import java.util.Vector;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;

import client.*;
import server.db.MemoryListMapper;
import server.db.ProfileMapper;
import server.db.ReservationMapper;
import server.db.VehicleMapper;
import shared.VehicleRentalAdministration;
import shared.bo.MemoryList;
import shared.bo.Profile;
import shared.bo.Reservation;
import shared.bo.Vehicle;
import shared.bo.VehicleRental;

import java.util.ArrayList;
import java.util.List;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;

public class VehicleRentalAdministrationImpl extends RemoteServiceServlet implements
        VehicleRentalAdministration {
    
    
    VehicleMapper vehicleMapper = null;

    private static final long serialVersionUID = 1L;
    public VehicleMapper vmapper =null;

    private static ReservationMapper reservationMapper;



    @Override
    public String getTextForLabel(String text) {
	// TODO Auto-generated method stub
	
	String text1 = "Das Ist ein Test";
	return text1;
    
    }
    
    

public Reservation createReservationFor(Vehicle v){
    Reservation r = new Reservation();
    
    r.setId(v.getId());
r.setId(1);
    /*
     * Setzen einer vorläufigen Kontonr. Der insert-Aufruf liefert dann ein
     * Objekt, dessen Nummer mit der Datenbank konsistent ist.
     */



return this.reservationMapper.insert(r);

  }
    
    
    
    
    
  




    @Override
    public ArrayList <Vehicle> getVehicleList() {
	// TODO Auto-generated method stub

    
    
   ArrayList <Vehicle> allVehicle  =  new ArrayList<Vehicle>();
   
   Vehicle a = new Vehicle();
   Vehicle b = new Vehicle();
   
   a.setVehicleCategory("SUV");
   a.setVehicleColour("blau");
   a.setVehicleModel("Audi a5");
   
  b.setVehicleCategory("Kombi");
  b.setVehicleColour("weiß");
  b.setVehicleModel("BMW 4er");
   allVehicle.add(a);
   allVehicle.add(b);
   
   
   
    
    
    return allVehicle;
    
    
    }

    public ArrayList<Integer> getNumber() {
ArrayList<Integer> a = new ArrayList<Integer>();
Integer c = new Integer(2);
Integer b = new Integer(1);
a.add(b);
a.add(c);
    
return a;
    
    
    
    
    }







  





}






  




