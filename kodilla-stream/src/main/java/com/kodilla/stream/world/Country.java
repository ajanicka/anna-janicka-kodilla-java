package com.kodilla.stream.world;

import java.math.BigDecimal;

public class Country {

    private BigDecimal peopleQuantity = BigDecimal.ZERO;

    public Country(BigDecimal peopleQuantity) {
        this.peopleQuantity = peopleQuantity;
    }

    public BigDecimal getPeopleQuantity(){
        return peopleQuantity;
    }
}
