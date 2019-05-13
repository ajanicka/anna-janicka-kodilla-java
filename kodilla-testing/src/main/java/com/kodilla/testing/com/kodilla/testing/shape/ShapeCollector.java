package com.kodilla.testing.com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {

    public ArrayList<Shape> shapesList = new ArrayList<>();

    public void addFigure(Shape shape) {
        shapesList.add(shape);
    }

    public boolean removeFigure(Shape shape) {
        if (shapesList.contains(shape)) {
            return (shapesList.remove(shape));
        }
            return false;
    }

    public Shape getFigure(int n) {
        if (shapesList.size() > n) {
            return shapesList.get(n);
        }
        return null;
    }

    public String showFigures() {
        String result = "";

        if (shapesList.size() > 0) {
            result = shapesList.get(0).getShapeName() + ":" + shapesList.get(0).getField();
        }

        for(int i = 1; i < shapesList.size(); i++) {
            result += ", " + shapesList.get(i).getShapeName() + ":" + shapesList.get(i).getField();
        }

        return result;
    }
}
