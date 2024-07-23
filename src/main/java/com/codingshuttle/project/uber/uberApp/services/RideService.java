package com.codingshuttle.project.uber.uberApp.services;

import com.codingshuttle.project.uber.uberApp.dto.DriverDTO;
import com.codingshuttle.project.uber.uberApp.dto.RideRequestDTO;
import com.codingshuttle.project.uber.uberApp.entities.Driver;
import com.codingshuttle.project.uber.uberApp.entities.Ride;
import com.codingshuttle.project.uber.uberApp.entities.enums.RideStatus;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

public interface RideService {
    Ride getRideById(Long rideId);

    void matchWithDrivers(RideRequestDTO rideRequestDTO);

    Ride createNewRide(RideRequestDTO rideRequestDTO, Driver driver) ;

    Ride updateRideStatus(Long rideId, RideStatus rideStatus);
    Page<Ride> getAllRidesOfRider(Long riderId, PageRequest pageRequest);

    Page<Ride> getAllOfRideOfDriver(Long driverId,PageRequest pageRequest);
}
