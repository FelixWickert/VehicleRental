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

    private static final long serialVersionUID = 1L;

    private List userList = new ArrayList();

    public VehicleRentalAdministrationImpl() {
    }}