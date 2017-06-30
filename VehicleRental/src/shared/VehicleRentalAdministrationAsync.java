package shared;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.TextBox;

import server.db.MemoryListMapper;
import server.db.ProfileMapper;
import server.db.ReservationMapper;
import server.db.VehicleMapper;
import server.report.ReportGeneratorImpl;
import shared.bo.MemoryList;
import shared.bo.Reservation;
import shared.bo.Vehicle;
import shared.bo.VehicleRental;


public interface VehicleRentalAdministrationAsync  {

    void getTextForLabel(String text, AsyncCallback<String> callback);
   

    void getVehicleList(AsyncCallback<ArrayList<Vehicle>> callback);


    void createReservationFor(Vehicle v, AsyncCallback<Reservation> callback);





}