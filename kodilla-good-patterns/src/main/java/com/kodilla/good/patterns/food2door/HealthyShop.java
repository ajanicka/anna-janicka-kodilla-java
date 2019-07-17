package com.kodilla.good.patterns.food2door;

class HealthyShop implements Producer {

    @Override
    public boolean process(Order order) {
        System.out.println("HealthyShop, you've ordered: " + order.amount + " x " + order.kindOfProduct);
        return false;
    }
}
