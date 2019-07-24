package com.kodilla.patterns.singleton;

import org.junit.Test;

import static org.junit.Assert.*;

public class LoggerTestSuite {

    @Test
    public void verifyAddedLog() {
        //Given
        Logger logger = Logger.getInstance();

        //When
        logger.log("log1");

        //Then
        assertEquals("log1", logger.getLastLog());
    }

    @Test
    public void getNoLogs() {
        //Given
        Logger logger = Logger.getInstance();

        //Then
        assertEquals("log1", logger.getLastLog());
    }
}