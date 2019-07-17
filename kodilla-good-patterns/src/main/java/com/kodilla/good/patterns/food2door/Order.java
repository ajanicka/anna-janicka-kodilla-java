package com.kodilla.good.patterns.food2door;

class Order {

    String providerInfo;
    String kindOfProduct;
    int amount;

    Order(String provider, String kindOfProduct, int amount) {
        this.providerInfo = provider;
        this.kindOfProduct = kindOfProduct;
        this.amount = amount;
    }
}
