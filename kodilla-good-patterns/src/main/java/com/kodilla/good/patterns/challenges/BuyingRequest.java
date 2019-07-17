package com.kodilla.good.patterns.challenges;

public class BuyingRequest {
    private User user;

    public BuyingRequest(User user) {
        this.user = user;
        System.out.println("class: BuyingRequest");
    }

    public User getBuyingUser() {
        return user;
    }
}
