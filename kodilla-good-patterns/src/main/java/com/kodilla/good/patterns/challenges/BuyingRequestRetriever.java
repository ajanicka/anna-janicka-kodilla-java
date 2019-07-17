package com.kodilla.good.patterns.challenges;

public class BuyingRequestRetriever {
    public BuyingRequest retrieve() {
        System.out.println("class: BuyingRequestRetriever");

        User user = new User("Anna", "Janicka");
        return new BuyingRequest(user);
    }
}
