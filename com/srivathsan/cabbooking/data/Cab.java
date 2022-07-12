package com.srivathsan.cabbooking.data;

public class Cab {

    private Integer id;
    private Location location;
    private Trip trip;
    private boolean isAvailable;
    private Driver driver;

    public Cab(Integer id, Location location, boolean isAvailable) {
        this.id = id;
        this.location = location;
        this.isAvailable = isAvailable;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        id = id;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Trip getTrip() {
        return trip;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public void setTrip(Trip trip) {
        setAvailable(false);
        this.trip = trip;
    }

    public boolean isAvailable() {
        return isAvailable;
    }


}
