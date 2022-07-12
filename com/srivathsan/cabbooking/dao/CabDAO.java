package com.srivathsan.cabbooking.dao;

import com.srivathsan.cabbooking.assignment.CabAssignmentStrategy;
import com.srivathsan.cabbooking.assignment.DefaultCabAssignmentStrategy;
import com.srivathsan.cabbooking.data.*;

import java.util.*;

public class CabDAO {

    private CabAssignmentStrategy assignmentStrategy = new DefaultCabAssignmentStrategy();

    private static CabDAO cabDAO = new CabDAO();

    Map<Integer, Cab> cabMap = new HashMap<>();
    Map<Integer, Cab> driverMap = new HashMap<>();

    private CabDAO() {
        return;
    }

    public static CabDAO getInstance() {
        return cabDAO;
    }

    public  void addCab(Cab cab, Driver driver) {
        cab.setDriver(driver);
        driverMap.put(driver.getId(), cab);
        cabMap.put(cab.getId(), cab);
    }

    public  void removeCab(Cab cab) {
        cabMap.remove(cab.getId());
    }

    public void updateLocation(Integer cabId, Location location) {
        Cab cab =  cabMap.get(cabId);
        cab.setLocation(location);
    }

    public void markAvailability(int driverId, boolean available) {
        driverMap.get(driverId).setAvailable(available);
    }

    public Optional<Cab> bookCab(int riderId) {
        Optional<Cab> cab = assignmentStrategy.allocateCab(riderId);
        if (cab.isEmpty()) {
            return Optional.empty();
        }
        cab.get().setAvailable(false);
        Trip trip = new Trip (RiderDAO.getInstance().getRider(riderId), cab.get(), new Random().nextInt(), TripStatus.STARTED);
        TripDAO.getInstance().addTrip(trip);
        return cab;
    }

    public void endTrip(int tripId) {
        TripDAO.getInstance().endTrip(tripId);
    }


    public List<Cab> getCabs() {
        List<Cab> cabs = new ArrayList<>(driverMap.values());
        return cabs;
    }
}
