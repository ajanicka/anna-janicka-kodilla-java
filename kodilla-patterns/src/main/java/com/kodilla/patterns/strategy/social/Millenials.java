package com.kodilla.patterns.strategy.social;

public class Millenials extends User {
    public Millenials(String name) {
        username = name;
        medium = new SnapchatPublisher();
    }
}
