package com.srivathsan.cabbooking.data;

public class Rider {
    private int id;
    private Location location;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Rider(int id, Location location) {
        this.id = id;
        this.location = location;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}
