package com.kodilla.good.patterns.food2door;

class OrderService {

    boolean newOrder(Producer producer, Order order)
    {
        return producer.process(order);
    }
}
