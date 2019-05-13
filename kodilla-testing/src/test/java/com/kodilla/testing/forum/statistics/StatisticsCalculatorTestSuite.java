package com.kodilla.testing.forum.statistics;

import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticsCalculatorTestSuite {

    @Test
    public void testCalculateAvgStatisticsZeroPosts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> users = new ArrayList<>();
        users.add("user1");
        users.add("user2");

        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(0);

        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();

        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(0, statisticsCalculator.avgCommentsNumberForPost);
        assertEquals(0, statisticsCalculator.avgPostsNumberForUser);
        assertEquals(0, statisticsCalculator.postsNumber);
    }

    @Test
    public void testCalculateAvgStatistics1000Posts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> users = new ArrayList<>();
        users.add("user1");
        users.add("user2");

        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(0);

        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();

        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(0, statisticsCalculator.avgCommentsNumberForPost);
        assertEquals(500, statisticsCalculator.avgPostsNumberForUser);
        assertEquals(1000, statisticsCalculator.postsNumber);
    }

    @Test
    public void testCalculateAvgStatisticsZeroComments() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> users = new ArrayList<>();
        users.add("user1");
        users.add("user2");

        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(0);

        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();

        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(0, statisticsCalculator.avgCommentsNumberForPost);
        assertEquals(0, statisticsCalculator.avgCommentsNumberForUser);
        assertEquals(0, statisticsCalculator.commentsNumber);
    }

    @Test
    public void testCalculateAvgStatisticCommentsNrLowerThanPostsNr() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> users = new ArrayList<>();
        users.add("user1");
        users.add("user2");

        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(100);
        when(statisticsMock.commentsCount()).thenReturn(50);

        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();

        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(0, statisticsCalculator.avgCommentsNumberForPost);
        assertEquals(50, statisticsCalculator.avgPostsNumberForUser);
    }

    @Test
    public void testCalculateAvgStatisticCommentsNrBiggerThanPostsNr() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> users = new ArrayList<>();
        users.add("user1");
        users.add("user2");

        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(50);
        when(statisticsMock.commentsCount()).thenReturn(100);

        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();

        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(2, statisticsCalculator.avgCommentsNumberForPost);
        assertEquals(50, statisticsCalculator.avgCommentsNumberForUser);
        assertEquals(25, statisticsCalculator.avgPostsNumberForUser);
    }

    @Test
    public void testCalculateAvgStatisticsZeroUsers() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> users = new ArrayList<>();

        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(100);
        when(statisticsMock.commentsCount()).thenReturn(50);

        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();

        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(0, statisticsCalculator.usersNumber);
        assertEquals(0, statisticsCalculator.avgPostsNumberForUser);
        assertEquals(0, statisticsCalculator.avgCommentsNumberForUser);
    }

    @Test
    public void testCalculateAvgStatistics100Users() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> users = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            users.add("user");
        }

        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(100);
        when(statisticsMock.commentsCount()).thenReturn(50);

        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();

        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(100, statisticsCalculator.usersNumber);
    }
}