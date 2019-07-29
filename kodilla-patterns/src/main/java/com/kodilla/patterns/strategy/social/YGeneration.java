package com.kodilla.patterns.strategy.social;

public class YGeneration extends User{
    public YGeneration(String name) {
        username = name;
        medium = new TwitterPublisher();
    }
}
