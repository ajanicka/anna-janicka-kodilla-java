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

        Country tanzania = new Country(BigDecimal.valueOf(57000000));
        Country RPA = new Country(BigDecimal.valueOf(60000000));
        Country chile = new Country(BigDecimal.valueOf(18000000));
        Country dominicana = new Country(BigDecimal.valueOf(10000000));
        Country russia = new Country(BigDecimal.valueOf(144000000));
        Country poland = new Country(BigDecimal.valueOf(28000000));

        world.addContinent(africa);
        world.addContinent(america);
        world.addContinent(eurasia);

        africa.addCountry(tanzania);
        africa.addCountry(RPA);
        america.addCountry(chile);
        america.addCountry(dominicana);
        eurasia.addCountry(russia);
        eurasia.addCountry(poland);
    }
}
