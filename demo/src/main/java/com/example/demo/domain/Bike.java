package com.example.demo.domain;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Bike implements Vehicle{
    private final Logger logger = LoggerFactory.getLogger(Bike.class);
    private Engine engine;

    public void start(){

        logger.info("Initiating bike ride...");
        engine.ignite();
    }
}
