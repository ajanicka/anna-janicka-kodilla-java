package com.kodilla.spring.portfolio;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardTestSuite {

    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        //When
        board.toDoList.tasks.add("TODO_TASK");
        board.inProgressList.tasks.add("IN_PROGRESS_TASK");
        board.doneList.tasks.add("DONE_TASK");

        //Then
        assertEquals("TODO_TASK", board.toDoList.tasks.get(0));
        assertEquals("IN_PROGRESS_TASK", board.inProgressList.tasks.get(0));
        assertEquals("DONE_TASK", board.doneList.tasks.get(0));
    }
}
