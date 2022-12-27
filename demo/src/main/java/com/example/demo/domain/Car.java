package com.example.demo.domain;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Car implements Vehicle {
   private final Logger logger = LoggerFactory.getLogger(Car.class);
   private Engine engine;
   public void start(){

       logger.info("Initiating car drive...");
       engine.ignite();
   }
}
