package com.codingshuttle.project.uber.uberApp.services;

import com.codingshuttle.project.uber.uberApp.dto.DriverDTO;
import com.codingshuttle.project.uber.uberApp.dto.RideDTO;

import java.util.List;

public interface DriverService {
    RideDTO acceptRide(Long rideId);
    RideDTO cancelRide(Long rideIOd);
    RideDTO startRide(Long rideId);
    RideDTO endRide(Long rideId);
    RideDTO rateRider(Long rideId,Integer rating);
    DriverDTO getMyProfile();
    List<RideDTO> getAllMyRides();

}
