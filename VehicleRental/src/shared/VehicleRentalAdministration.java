package shared;


import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

import server.db.MemoryListMapper;
import server.db.ProfileMapper;
import server.db.ReservationMapper;
import server.db.VehicleMapper;
import shared.bo.MemoryList;
import shared.bo.Reservation;
import shared.bo.Vehicle;
import shared.bo.VehicleRental;


//Interface, das von der Verwaltungsklasse VehicalRentalAdministrationImpl implementiert wird

@RemoteServiceRelativePath("vehi")
public interface VehicleRentalAdministration extends RemoteService {
    
    public String getTextForLabel( String text) ;
    
    
    
    public ArrayList <Vehicle> getVehicleList();
    
   
public Reservation createReservationFor(Vehicle v);



}