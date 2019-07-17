package com.kodilla.good.patterns.food2door;

class OrderRetriever {

    String provider = "ExtraFoodShop";
    int amount = 2;
    String kindOfProduct = "Milk";

    Order retrieve() {
        return new Order(provider, kindOfProduct, amount);
    }
}
