package com.kodilla.patterns2.decorator.pizza;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

@SpringBootTest
@RunWith(SpringRunner.class)
public class PizzaOrderTestSuite {
    @Test
    public void testBasicPizzaOrderGetCost() {
        // Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        // When
        BigDecimal calculatedCost = theOrder.getCost();
        // Then
        assertEquals(new BigDecimal(15), calculatedCost);
    }

    @Test
    public void testBasicPizzaOrderGetDescription() {
        // Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        // When
        String description = theOrder.getDescription();
        // Then
        assertEquals("Basic pizza with tomato sauce and cheese", description);
    }

    @Test
    public void testHawaiiPizzaOrderGetCost() {
        // Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new PineaplePizzaDecorator(theOrder);
        // When
        BigDecimal calculatedCost = theOrder.getCost();
        // Then
        assertEquals(new BigDecimal(20), calculatedCost);
    }

    @Test
    public void testHawaiiPizzaOrderGetDescription() {
        // Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new PineaplePizzaDecorator(theOrder);
        // When
        String description = theOrder.getDescription();
        // Then
        assertEquals("Basic pizza with tomato sauce and cheese + pineaple", description);
    }

    @Test
    public void testHawaiiPizzaWithAdditionalCheeseOrderGetCost() {
        // Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new PineaplePizzaDecorator(theOrder);
        theOrder = new AdditionalCheeseDecorator(theOrder);
        // When
        BigDecimal calculatedCost = theOrder.getCost();
        // Then
        assertEquals(new BigDecimal(23), calculatedCost);
    }

    @Test
    public void testHawaiiPizzaWithAdditionalCheeseOrderGetDescription() {
        // Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new PineaplePizzaDecorator(theOrder);
        theOrder = new AdditionalCheeseDecorator(theOrder);
        // When
        String description = theOrder.getDescription();
        // Then
        assertEquals("Basic pizza with tomato sauce and cheese + pineaple + additional cheese", description);
    }
}