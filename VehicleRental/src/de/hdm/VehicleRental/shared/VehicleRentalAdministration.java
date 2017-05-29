package de.hdm.VehicleRental.shared;


import java.util.Vector;

import de.hdm.VehicleRental.server.db.MemoryListMapper;
import de.hdm.VehicleRental.server.db.ProfileMapper;
import de.hdm.VehicleRental.server.db.ReservationMapper;
import de.hdm.VehicleRental.server.db.VehicleMapper;
import de.hdm.VehicleRental.shared.bo.MemoryList;
import de.hdm.VehicleRental.shared.bo.Reservation;
import de.hdm.VehicleRental.shared.bo.Vehicle;
import de.hdm.VehicleRental.shared.bo.VehicleRental;


//Interface, das von der Verwaltungsklasse VehicalRentalAdministrationImpl implementiert wird

public interface VehicleRentalAdministration {

	
	ReservationMapper reservationMapper=null;

	 ProfileMapper profileMapper= null;

	 MemoryListMapper memoryListMapper=null;

	 VehicleRental vehicleRental=null;

	 VehicleMapper vehicleMapper=null;
	/**
	 * Getter of reservationMapper
	 */
}