package com.kodilla.testing.shape;

import com.kodilla.testing.com.kodilla.testing.shape.*;
import org.junit.*;

public class ShapeCollectorTestSuite {

    ShapeCollector shapeCollector = new ShapeCollector();

    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }

    @After
    public void after(){
        System.out.println("Test Case: end");
        shapeCollector.shapesList.clear();
    }

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }

    @Test
    public void testAddFigure(){
        //Given
        //When
        shapeCollector.addFigure(new Square(5.5));
        //Then
        Assert.assertEquals(1, shapeCollector.shapesList.size());
    }

    @Test
    public void testGetExistingFigure() {
        //Given
        shapeCollector.addFigure(new Square(3));
        shapeCollector.addFigure(new Triangle(12));

        //When
        Shape shape = shapeCollector.getFigure(0);

        //Then
        Assert.assertEquals("square", shape.getShapeName());
    }

    @Test
    public void testShowCollection() {
        //Given
        shapeCollector.addFigure(new Square(25));
        shapeCollector.addFigure(new Triangle(15));
        shapeCollector.addFigure(new Circle(10));

        //When
        String figures = shapeCollector.showFigures();

        //Then
        Assert.assertEquals("square:25.0, triangle:15.0, circle:10.0", figures);
    }

    @Test
    public void testRemoveExistingFigure() {
        //Given
        Square checkingSquare = new Square(25);
        shapeCollector.addFigure(checkingSquare);
        shapeCollector.addFigure(new Triangle(15));

        //When
        boolean result = shapeCollector.removeFigure(checkingSquare);

        //Then
        Assert.assertEquals(1, shapeCollector.shapesList.size());
        Assert.assertEquals(true, result);
    }

    @Test
    public void testRemoveNotExistingFigure() {
        //Given
        shapeCollector.addFigure(new Square(25));
        shapeCollector.addFigure(new Triangle(15));

        //When
        boolean result = shapeCollector.removeFigure(new Circle(7));

        //Then
        Assert.assertEquals(2, shapeCollector.shapesList.size());
        Assert.assertEquals(false, result);

    }

    @Test
    public void testTryingToGetFigureEmptyCollection() {
        //Given
        //When
        //Then
        Assert.assertNull(shapeCollector.getFigure(0));
    }

    @Test
    public void testShowEmptyCollection() {
        String figures = shapeCollector.showFigures();
        Assert.assertEquals("", figures);
    }
}
