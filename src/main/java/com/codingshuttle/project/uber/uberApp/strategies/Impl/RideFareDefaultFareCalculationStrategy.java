package com.codingshuttle.project.uber.uberApp.strategies.Impl;

import com.codingshuttle.project.uber.uberApp.dto.RideRequestDTO;
import com.codingshuttle.project.uber.uberApp.strategies.RideFareCalculateStrategy;

public class RideFareDefaultFareCalculationStrategy implements RideFareCalculateStrategy {
    @Override
    public double calculateFare(RideRequestDTO rideRequestDTO) {
        return 0;
    }
}
