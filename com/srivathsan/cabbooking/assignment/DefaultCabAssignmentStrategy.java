package com.srivathsan.cabbooking.assignment;

import com.srivathsan.cabbooking.dao.CabDAO;
import com.srivathsan.cabbooking.dao.RiderDAO;
import com.srivathsan.cabbooking.data.Cab;
import com.srivathsan.cabbooking.data.Rider;
import com.srivathsan.cabbooking.util.CabUtil;

import java.util.Optional;

public class DefaultCabAssignmentStrategy implements CabAssignmentStrategy{

    private double MAX_CONFIGURED_DISTANCE = 100;
    @Override
    public Optional<Cab> allocateCab(int riderId) {
        return CabDAO.getInstance().getCabs().stream().filter(cab -> cab.isAvailable() && isWithinMaxDistance(riderId, cab)).findFirst();
    }

    private boolean isWithinMaxDistance(int riderId,Cab cab) {
        Rider rider = RiderDAO.getInstance().getRider(riderId);
        return CabUtil.distance(rider.getLocation(), cab.getLocation()) <= MAX_CONFIGURED_DISTANCE;
    }
}
