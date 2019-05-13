package com.kodilla.testing.com.kodilla.testing.shape;

public class Triangle implements Shape {

    double field;
    static final String shapeName = "triangle";

    public Triangle(double i) {
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
