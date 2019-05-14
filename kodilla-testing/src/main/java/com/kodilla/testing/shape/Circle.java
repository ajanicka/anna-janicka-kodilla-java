package com.kodilla.testing.shape;

public class Circle implements Shape {

    double field;
    static final String shapeName = "circle";

    public Circle(double i) {
        this.field = i;
    }

    @Override
    public String getShapeName() {
        return shapeName;
    }

    @Override
    public double getField() {
        return field;
    }
}
