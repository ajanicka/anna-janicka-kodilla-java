package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testBigmacNew() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun(true)
                .burgers(3)
                .sauce("BBQ")
                .ingredient("Onion")
                .ingredient("Becon")
                .build();

        System.out.println(bigmac);
        //When
        int howManyIngredients = bigmac.getIngredients().size();
        //Then
        Assert.assertEquals(2, howManyIngredients);
        Assert.assertEquals(3, bigmac.getBurgers());
    }
}
