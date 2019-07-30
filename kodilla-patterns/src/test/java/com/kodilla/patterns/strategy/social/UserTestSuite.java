package com.kodilla.patterns.strategy.social;

import org.junit.Test;

import static org.junit.Assert.*;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User steven = new Millenials("Steven Links");

        //Then
        assertEquals("Snapchat", steven.sharePost());
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User steven = new Millenials("Steven Links");

        //When
        steven.setSocialPublisher(new FacebookPublisher());

        //Then
        assertEquals("Facebook", steven.sharePost());
    }
}
