package com.srivathsan.cabbooking.data;

public class Trip {
    private Rider rider;
    private Cab cab;
    private int id;
    private int durationInMins;
    private TripStatus tripStatus;

    public Trip(Rider rider, Cab cab, int id, TripStatus tripStatus) {
        this.rider = rider;
        this.cab = cab;
        this.id = id;
        this.tripStatus = tripStatus;
    }

    public Rider getRider() {
        return rider;
    }

    public void setRider(Rider rider) {
        this.rider = rider;
    }

    public Cab getCab() {
        return cab;
    }

    public void setCab(Cab cab) {
        this.cab = cab;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDurationInMins() {
        return durationInMins;
    }

    public void setDurationInMins(int durationInMins) {
        this.durationInMins = durationInMins;
    }

    public TripStatus getTripStatus() {
        return tripStatus;
    }

    public void setTripStatus(TripStatus tripStatus) {
        this.tripStatus = tripStatus;
    }
}
