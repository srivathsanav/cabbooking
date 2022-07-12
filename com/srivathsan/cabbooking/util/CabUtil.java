package com.srivathsan.cabbooking.util;

import com.srivathsan.cabbooking.data.Location;

public class CabUtil {
    public static double distance (Location l1, Location l2) {
        double value =  Math.pow((l1.getX() - l2.getX()),2) +
                Math.pow((l2.getY() - l2.getY()),2);
        return Math.sqrt(value);
    }
}
