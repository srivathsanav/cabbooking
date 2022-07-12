package com.srivathsan.cabbooking.dao;

import com.srivathsan.cabbooking.data.Rider;
import com.srivathsan.cabbooking.data.Trip;
import com.srivathsan.cabbooking.data.TripStatus;

import java.util.HashMap;
import java.util.Map;

public class TripDAO {

    private static TripDAO tripDAO = new TripDAO();

    private TripDAO() {
        return;
    }

    public static TripDAO getInstance() {
        return tripDAO;
    }

    private Map<Integer, Trip> tripMap = new HashMap();

    public  void addTrip(Trip trip) {
        tripMap.put(trip.getId(), trip);
    }

    public Trip getTrip(int trip) {
        return tripMap.get(trip);
    }

    public Trip endTrip(int tripId) {
        Trip trip = tripMap.get(tripId);
        trip.setTripStatus(TripStatus.COMPLETED);
        trip.getCab().setAvailable(true);
        return trip;
    }

}
