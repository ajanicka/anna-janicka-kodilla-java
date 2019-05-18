package com.kodilla.stream.world;

import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class WorldTestSuite {

    World world = new World();

    @Test
    public void testGetPeopleQuantity() {
        //When
        BigDecimal peopleQuantity = world.getPeopleQuantity();

        //Then
        assertEquals(BigDecimal.valueOf(317000000), peopleQuantity);
    }

    @Before
    public void prepareWorld(){
        Continent africa = new Continent();
        Continent america = new Continent();
        Continent eurasia = new Continent();

        Country tanzania = new Country();
        Country RPA = new Country();
        Country chile = new Country();
        Country dominicana = new Country();
        Country russia = new Country();
        Country poland = new Country();

        world.addContinent(africa);
        world.addContinent(america);
        world.addContinent(eurasia);

        tanzania.peopleQuantity = BigDecimal.valueOf(57000000);
        RPA.peopleQuantity = BigDecimal.valueOf(60000000);
        chile.peopleQuantity = BigDecimal.valueOf(18000000);
        dominicana.peopleQuantity = BigDecimal.valueOf(10000000);
        russia.peopleQuantity = BigDecimal.valueOf(144000000);
        poland.peopleQuantity = BigDecimal.valueOf(28000000);

        africa.addCountry(tanzania);
        africa.addCountry(RPA);
        america.addCountry(chile);
        america.addCountry(dominicana);
        eurasia.addCountry(russia);
        eurasia.addCountry(poland);
    }
}
