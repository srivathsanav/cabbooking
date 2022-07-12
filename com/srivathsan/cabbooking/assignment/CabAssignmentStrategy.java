package com.srivathsan.cabbooking.assignment;

import com.srivathsan.cabbooking.data.Cab;

import java.util.Optional;

public interface CabAssignmentStrategy {

    Optional<Cab> allocateCab(int riderId);
}
