package com.kodilla.testing.forum.statistics;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticsCalculatorTestSuite {

    Statistics statisticsMock = mock(Statistics.class);
    StatisticsCalculator statisticsCalculator = new StatisticsCalculator();

    @Test
    public void testCalculateAvgStatisticsZeroPosts() {
        //Given
        when(statisticsMock.usersNames()).thenReturn(createUsersList(2));
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(0);

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
        when(statisticsMock.usersNames()).thenReturn(createUsersList(2));
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(0);

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
        when(statisticsMock.usersNames()).thenReturn(createUsersList(2));
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(0);

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
        when(statisticsMock.usersNames()).thenReturn(createUsersList(2));
        when(statisticsMock.postsCount()).thenReturn(100);
        when(statisticsMock.commentsCount()).thenReturn(50);

        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(0, statisticsCalculator.avgCommentsNumberForPost);
        assertEquals(50, statisticsCalculator.avgPostsNumberForUser);
    }

    @Test
    public void testCalculateAvgStatisticCommentsNrBiggerThanPostsNr() {
        //Given
        when(statisticsMock.usersNames()).thenReturn(createUsersList(2));
        when(statisticsMock.postsCount()).thenReturn(50);
        when(statisticsMock.commentsCount()).thenReturn(100);

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
        when(statisticsMock.usersNames()).thenReturn(createUsersList(0));
        when(statisticsMock.postsCount()).thenReturn(100);
        when(statisticsMock.commentsCount()).thenReturn(50);

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
        when(statisticsMock.usersNames()).thenReturn(createUsersList(100));
        when(statisticsMock.postsCount()).thenReturn(100);
        when(statisticsMock.commentsCount()).thenReturn(50);

        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(100, statisticsCalculator.usersNumber);
    }

    private List<String> createUsersList(int numberOfUsers) {
        List<String> users = new ArrayList<>();
        for (int i = 0; i < numberOfUsers; i++) {
            users.add("user");
        }

        return users;
    }
}