package com.kodilla.testing.forum.statistics;

public class StatisticsCalculator {
    public int usersNumber;
    public int postsNumber;
    public int commentsNumber;
    public int avgPostsNumberForUser;
    public int avgCommentsNumberForUser;
    public int avgCommentsNumberForPost;

    public void calculateAdvStatistics(Statistics statistics) {

        usersNumber = statistics.usersNames().size();
        postsNumber = statistics.postsCount();
        commentsNumber = statistics.commentsCount();

        if (usersNumber != 0) {
            avgCommentsNumberForUser = commentsNumber / usersNumber;
        }

        if (usersNumber != 0) {
            avgPostsNumberForUser = postsNumber / usersNumber;
        }

        if(postsNumber != 0) {
            avgCommentsNumberForPost = commentsNumber / postsNumber;
        }
    }
}
