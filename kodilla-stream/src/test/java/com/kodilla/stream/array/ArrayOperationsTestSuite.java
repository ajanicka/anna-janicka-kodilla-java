package com.kodilla.stream.array;

import org.junit.Test;
import static org.junit.Assert.*;

public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage() {
        //Given
        int[] tableToCount = {1,3,10,133,13,99,7,9,11,33,13,12,17,55,99,100,22,77,33,20};

        //Then
        assertEquals(38.35, ArrayOperations.getAverage(tableToCount), 0);
    }
}
