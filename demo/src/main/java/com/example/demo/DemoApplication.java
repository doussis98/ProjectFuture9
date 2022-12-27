package com.example.demo;

import com.example.demo.domain.Bike;
import com.example.demo.domain.Car;
import com.example.demo.service.TravelService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	private static final Logger logger = LoggerFactory.getLogger(Car.class);
	public static void main(String[] args) {


		SpringApplication.run(DemoApplication.class, args);
		logger.info("Starting program execution");
		TravelService travelService = new TravelService(new Bike());
		travelService.StartJourney();

	}

}
