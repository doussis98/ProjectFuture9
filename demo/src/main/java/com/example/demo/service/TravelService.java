package com.example.demo.service;

import com.example.demo.domain.Bike;
import com.example.demo.domain.Car;
import com.example.demo.domain.Vehicle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TravelService {
    private final Logger logger = LoggerFactory.getLogger(Car.class);
    private Vehicle vehicle;

    public TravelService(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
    public void StartJourney(){
        logger.info("Starting travel...");
        vehicle.start();
    }
}
