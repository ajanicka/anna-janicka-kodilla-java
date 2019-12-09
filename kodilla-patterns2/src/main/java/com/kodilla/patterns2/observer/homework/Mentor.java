package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer {
    private final String mentorName;
    private final boolean isToBeNotified;
    private int updateCount;


    public Mentor(String mentorName, boolean isToBeNotified) {
        this.mentorName = mentorName;
        this.isToBeNotified = isToBeNotified;
    }

    @Override
    public void update(TasksQueue tasksQueue) {
        System.out.println("@" + mentorName + ": New assignment has been added to queue by " + tasksQueue.getStudentName());
        updateCount++;
    }

    public int getUpdateCount() {
        return updateCount;
    }

}
