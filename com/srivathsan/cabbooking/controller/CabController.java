package com.srivathsan.cabbooking.controller;

import com.srivathsan.cabbooking.dao.CabDAO;
import com.srivathsan.cabbooking.dao.RiderDAO;
import com.srivathsan.cabbooking.data.Cab;
import com.srivathsan.cabbooking.data.Driver;
import com.srivathsan.cabbooking.data.Location;
import com.srivathsan.cabbooking.data.Rider;

import java.util.Optional;

public class CabController {

    private static CabController INSTANCE = new CabController();

    private CabController() {

    }

    public static CabController getInstance() {
        return INSTANCE;
    }

    public void registerDriver(Cab cabDetails,  Driver driver) {
        CabDAO cabDAO = CabDAO.getInstance();
        cabDAO.addCab(cabDetails, driver);
    }

    public void registerRider(Rider rider) {
        RiderDAO riderDAO = RiderDAO.getInstance();
        riderDAO.addRider(rider);
    }

    public void updateCabLocation(int cabId, Location location) {
        CabDAO cabDAO = CabDAO.getInstance();
        cabDAO.updateLocation(cabId, location);
    }

    public void markDriverAvailability(int driverId, boolean status) {
        CabDAO.getInstance().markAvailability(driverId, status);
    }

    public Optional<Cab> bookCab(int riderId) {
        return CabDAO.getInstance().bookCab(riderId);
    }

    public void fetchAllRides(int riderId) {

    }

    public void endTrip(int tripId) {

    }
}
