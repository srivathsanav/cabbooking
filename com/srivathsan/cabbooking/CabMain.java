package com.srivathsan.cabbooking;

import com.srivathsan.cabbooking.controller.CabController;
import com.srivathsan.cabbooking.data.Cab;
import com.srivathsan.cabbooking.data.Driver;
import com.srivathsan.cabbooking.data.Location;
import com.srivathsan.cabbooking.data.Rider;

import java.util.Optional;

public class CabMain {

    public static void main(String[] args) {
        CabController cabController = CabController.getInstance();

        Cab cabDetails = new Cab(1, new Location(1, 1), true);
        Driver driver = new Driver(1);
        cabController.registerDriver(cabDetails, driver);

        cabDetails = new Cab(2, new Location(2, 2), true);
        driver = new Driver(2);
        cabController.registerDriver(cabDetails, driver);

        cabDetails = new Cab(3, new Location(3, 3), true);
        driver = new Driver(3);
        cabController.registerDriver(cabDetails, driver);


        Rider rider = new Rider(11, new Location(4, 4));
        cabController.registerRider(rider);
        System.out.println(Optional.ofNullable(cabController.bookCab(rider.getId())).get().orElse(null));



        rider = new Rider(12, new Location(5, 5));
        cabController.registerRider(rider);
        System.out.println(Optional.ofNullable(cabController.bookCab(rider.getId()).get()).orElse(null));


        rider = new Rider(13, new Location(6, 6));
        cabController.registerRider(rider);
        System.out.println(Optional.ofNullable(cabController.bookCab(rider.getId())).get().orElse(null));


        rider = new Rider(14, new Location(7, 7));
        cabController.registerRider(rider);
        System.out.println(Optional.ofNullable(cabController.bookCab(rider.getId())).get().orElse(null));




    }
}
