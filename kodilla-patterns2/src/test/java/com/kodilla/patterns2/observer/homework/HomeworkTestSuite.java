package com.kodilla.patterns2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HomeworkTestSuite {

    @Test
    public void testAssignmentsQueue() {
        // Given
        TasksQueue tasksQueue1 = new TasksQueue("Andrzej Janicki");
        TasksQueue tasksQueue2 = new TasksQueue("Krzysztof Kowalsi");
        TasksQueue tasksQueue3 = new TasksQueue("Juliusz Cezar");

        Mentor mentor1 = new Mentor("John Smith", true);
        Mentor mentor2 = new Mentor("John Kovalsky", true);

        tasksQueue1.registerObserver(mentor1);
        tasksQueue2.registerObserver(mentor1);
        tasksQueue3.registerObserver(mentor1);
        tasksQueue3.registerObserver(mentor2);

        // When
        tasksQueue1.addTask(new Task("Exercise 20.4"));
        tasksQueue2.addTask(new Task("Exercise 20.4"));
        tasksQueue3.addTask(new Task("Exercise 20.3"));

        // Then
        assertEquals(3, mentor1.getUpdateCount());
        assertEquals(1, mentor2.getUpdateCount());
    }
}