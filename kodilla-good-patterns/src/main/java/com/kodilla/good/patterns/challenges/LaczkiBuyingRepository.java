package com.kodilla.good.patterns.challenges;

public class LaczkiBuyingRepository implements BuyingRepository {
    @Override
    public void createOrder(User buyingUser) {
        System.out.println("class: LaczkiBuyingRepository");
    }
}
