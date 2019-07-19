package com.kodilla.good.patterns.food2door;

class Application {

    public static void main(String[] args) {

        OrderRetriever retriever = new OrderRetriever();
        Order order = retriever.retrieve();

        OrderService orderService = new OrderService();

        orderService.newOrder(new ExtraFoodShop(), order);
        orderService.newOrder(new GlutenFreeShop(), order);
        orderService.newOrder(new HealthyShop(), order);
    }
}
