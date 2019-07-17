package com.kodilla.good.patterns.food2door;

class OrderService {

    private Producer producer;

    OrderService(Producer producer) {
        this.producer = producer;
    }

    boolean process(Order order) {
        return producer.process(order);
    }
}
