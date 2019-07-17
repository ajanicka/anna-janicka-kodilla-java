package com.kodilla.good.patterns.challenges;

public class BuyingRequest {
    private User user;

    public BuyingRequest(User user) {
        this.user = user;
    }

    public User getBuyingUser() {
        return user;
    }
}
