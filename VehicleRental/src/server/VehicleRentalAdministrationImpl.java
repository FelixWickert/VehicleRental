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
import com.google.gwt.user.client.Event;

public class VehicleRentalAdministrationImpl extends RemoteServiceServlet implements
        VehicleRentalAdministration {

    private static final long serialVersionUID = 1L;
    public VehicleMapper vmapper =null;



    @Override
    public String getTextForLabel(String text) {
	// TODO Auto-generated method stub
	
	String text1 = "Das Ist ein Test";
	return text1;
    
    }



    public int getNumber(int numb) {
	int a = 10;
	return 10;
    }}