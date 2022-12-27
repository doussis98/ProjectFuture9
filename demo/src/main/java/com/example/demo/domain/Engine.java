package com.example.demo.domain;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Engine {

    private final Logger logger = LoggerFactory.getLogger(Engine.class);
    private String cc;
    private EngineType enginetype;

    public void ignite(){
        logger.info("Igniting engine of type {}", this.getEnginetype());
    }

    public EngineType getEnginetype() {
        return enginetype;
    }
}
