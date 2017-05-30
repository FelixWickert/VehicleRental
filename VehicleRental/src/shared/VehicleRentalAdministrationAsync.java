package shared;

import java.util.List;

import com.google.gwt.user.client.rpc.AsyncCallback;
import server.db.MemoryListMapper;
import server.db.ProfileMapper;
import server.db.ReservationMapper;
import server.db.VehicleMapper;
import server.report.ReportGeneratorImpl;
import shared.bo.MemoryList;
import shared.bo.Reservation;
import shared.bo.VehicleRental;


public interface VehicleRentalAdministrationAsync  {

    void getUserList(AsyncCallback<List<Object>> callback);

    void getUser(String id, AsyncCallback<Object> callback);

}