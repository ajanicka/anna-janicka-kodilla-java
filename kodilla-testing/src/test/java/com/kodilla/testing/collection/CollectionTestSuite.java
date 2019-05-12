package com.kodilla.testing.collection;

import static org.junit.Assert.*;
import org.junit.*;
import org.junit.rules.TestName;
import java.util.ArrayList;

public class CollectionTestSuite {

    @Rule
    public TestName testName = new TestName();

    @Before
    public void before() {
        System.out.println(" START : " + testName.getMethodName());
    }

    @After
    public void after() {
        System.out.println(" FINISH : " + testName.getMethodName());
    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();

        //When
        ArrayList<Integer> returnedList = oddNumbersExterminator.exterminate(new ArrayList<>());

        //Then
        assertTrue(returnedList.isEmpty());
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();

        ArrayList<Integer> inputList = new ArrayList<>();
        inputList.add(2);
        inputList.add(3);
        inputList.add(5);
        inputList.add(28);
        inputList.add(310);

        ArrayList<Integer> expectedList = new ArrayList<>();
        expectedList.add(2);
        expectedList.add(28);
        expectedList.add(310);

        //When
        ArrayList<Integer> returnedList = oddNumbersExterminator.exterminate(inputList);

        //Then
        assertEquals(returnedList, expectedList);
    }
}
