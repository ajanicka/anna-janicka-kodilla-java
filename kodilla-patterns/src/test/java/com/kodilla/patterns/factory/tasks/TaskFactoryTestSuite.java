package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TaskFactoryTestSuite {
    @Test
    public void testFactoryShopping() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shopping = factory.makeTask(TaskFactory.SHOPPING);
        //Then
        assertEquals("The shopping task", shopping.getTaskName());
    }

    @Test
    public void testFactoryDriving() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task driving = factory.makeTask(TaskFactory.DRIVING);
        driving.executeTask();
        //Then
        assertEquals("The driving task", driving.getTaskName());
        assertTrue(driving.isTaskExecuted());
    }

    @Test
    public void testFactoryPainting() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task painting = factory.makeTask(TaskFactory.PAINTING);

        //Then
        assertEquals("The painting task", painting.getTaskName());
        assertFalse(painting.isTaskExecuted());
    }
}