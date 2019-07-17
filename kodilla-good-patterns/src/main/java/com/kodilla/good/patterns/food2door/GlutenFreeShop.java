package com.kodilla.good.patterns.food2door;

class GlutenFreeShop implements Producer {

    @Override
    public boolean process(Order order) {
        System.out.println("GlutenFreeShop, you've ordered: " + order.amount + " x " + order.kindOfProduct);
        return false;
    }
}
