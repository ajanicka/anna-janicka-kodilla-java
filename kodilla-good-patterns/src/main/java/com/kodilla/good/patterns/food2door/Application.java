package com.kodilla.good.patterns.food2door;

class Application {

    public static void main(String[] args) {

        String provider;
        String kindOfProduct;
        int amount;

        OrderRetriever retriever = new OrderRetriever();
        Order order = retriever.retrieve();

        OrderService orderService_1 = new OrderService(new ExtraFoodShop());
        OrderService orderService_2 = new OrderService(new GlutenFreeShop());
        OrderService orderService_3 = new OrderService(new HealthyShop());

        boolean orderDone_1 = orderService_1.process(order);
        boolean orderDone_2 = orderService_2.process(order);
        boolean orderDone_3 = orderService_3.process(order);
    }
}
