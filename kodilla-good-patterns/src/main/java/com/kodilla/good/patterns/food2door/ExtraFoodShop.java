package com.kodilla.good.patterns.food2door;

class ExtraFoodShop implements Producer {

    @Override
    public boolean process(Order order) {
        System.out.println("ExtraFoodShop, you've ordered: " + order.amount + " x " + order.kindOfProduct);
        return false;
    }
}
