package com.kodilla.testing.shape;

public class Square implements Shape {

    double field;
    static final String shapeName = "square";

    public Square(double i) {
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
