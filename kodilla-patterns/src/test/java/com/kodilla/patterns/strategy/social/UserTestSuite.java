package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User steven = new Millenials("Steven Links");

        //Then
        Assert.assertEquals("Snapchat", steven.sharePost());
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User steven = new Millenials("Steven Links");

        //When
        steven.setSocialPublisher(new FacebookPublisher());

        //Then
        Assert.assertEquals("Facebook", steven.sharePost());
    }
}
