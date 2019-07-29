package com.kodilla.patterns.factory.tasks;

import java.awt.*;

public final class TaskFactory {
    public static final String DRIVING = "DRIVING";
    public static final String PAINTING = "PAINTING";
    public static final String SHOPPING = "SHOPPING";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case DRIVING:
                return new DrivingTask("The driving task", "LB", "train");
            case PAINTING:
                return new PaintingTask("The painting task", "Black", "Cat");
            case SHOPPING:
                return new ShoppingTask("The shopping task", "Milk", 2);
            default:
                return null;
        }

    }
}