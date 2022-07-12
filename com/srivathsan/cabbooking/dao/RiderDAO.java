package com.srivathsan.cabbooking.dao;

import com.srivathsan.cabbooking.data.Cab;
import com.srivathsan.cabbooking.data.Driver;
import com.srivathsan.cabbooking.data.Rider;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RiderDAO {
    private static RiderDAO riderDAO = new RiderDAO();

    private RiderDAO() {
        return;
    }

    public static RiderDAO getInstance() {
        return riderDAO;
    }

    private Map<Integer, Rider> riderMap = new HashMap();

    public  void addRider(Rider rider) {
        riderMap.put(rider.getId(), rider);
    }

    public Rider getRider(int riderId) {
        return riderMap.get(riderId);
    }


}
