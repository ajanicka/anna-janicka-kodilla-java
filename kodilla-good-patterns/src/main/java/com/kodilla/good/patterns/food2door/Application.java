package com.kodilla.good.patterns.food2door;

class Application {

    public static void main(String[] args) {

        String provider;
        String kindOfProduct;
        int amount;

        OrderRetriever retriever = new OrderRetriever();
        Order order = retriever.retrieve();

        OrderService orderService = new OrderService();

        boolean orderDone_1 = orderService.newOrder(new ExtraFoodShop(), order);
        boolean orderDone_2 = orderService.newOrder(new GlutenFreeShop(), order);
        boolean orderDone_3 = orderService.newOrder(new HealthyShop(), order);
    }
}
