package com.kodilla.patterns.strategy.social;

public class User {
    String username;
    SocialPublisher medium;

    String sharePost() {
        return medium.share();
    }

    void setSocialPublisher(SocialPublisher publisher) {
        medium = publisher;
    }
}
