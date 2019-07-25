package com.kodilla.patterns.singleton;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LoggerTestSuite {

    private Logger logger;

    @Before
    public void createLoggerWithOneLog() {
        logger = Logger.getInstance();
        logger.log("log1");
    }

    @Test
    public void verifyAddedLog() {
        //Then
        assertEquals("log1", logger.getLastLog());
    }

    @Test
    public void verifyNoSecondLogger() {
        //Given
        Logger logger2 = Logger.getInstance();

        //Then
        assertEquals("log1", logger2.getLastLog());
    }
}