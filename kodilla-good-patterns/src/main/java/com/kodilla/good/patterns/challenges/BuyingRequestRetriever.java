package com.kodilla.good.patterns.challenges;

public class BuyingRequestRetriever {
    public BuyingRequest retrieve() {
        User user = new User("Anna", "Janicka");
        return new BuyingRequest(user);
    }
}
