package com.it;

import com.it.figures.*;

import java.util.Random;

class ShapesArray {
    private Random rand;
    private final static int MAX_SHAPES = 20; // maximum number of shapes in an array

    Shape[] fillArray() {
        rand = new Random();
        int amountOfElements = rand.nextInt(MAX_SHAPES); //random number of shapes in an array
        Shape[] array = new Shape[amountOfElements]; // array of shapes

        for (int i = 0; i < amountOfElements; i++) {
            int randomNumber = rand.nextInt(4); //random number for choosing the type of figures
            switch (randomNumber) {
                case 0:
                    Circle circle = new Circle();
                    circle.setFigureColor(nextColor());
                    circle.setRadius(nextDouble());
                    array[i] = circle;
                    break;
                case 1:
                    Square foursquare = new Square();
                    foursquare.setFigureColor(nextColor());
                    foursquare.setSideSquare(nextDouble());
                    array[i] = foursquare;
                    break;
                case 2:
                    Trapeze trapeze = new Trapeze();
                    trapeze.setFigureColor(nextColor());
                    trapeze.setUpperTrapeziumBase(nextDouble());
                    trapeze.setLowerTrapeziumBase(nextDouble());
                    trapeze.setLeftTrapezoidBase(nextDouble());
                    trapeze.setRightTrapezoidBase(nextDouble());
                    trapeze.setTrapezoidHeight(nextDouble());
                    array[i] = trapeze;
                    break;
                case 3:
                    Triangle triangle = new Triangle();
                    triangle.setFigureColor(nextColor());
                    triangle.setLeftSide(nextDouble());
                    triangle.setRightSide(nextDouble());
                    triangle.setTriangleBase(nextDouble());
                    triangle.setHeightHeldToBaseSide(nextDouble());
                    array[i] = triangle;
                    break;
            }
        }
        return array;
    }

    private ColorEnum nextColor() {
        return ColorEnum.values()[(int) (Math.random() * ColorEnum.values().length)];
    }

    private double nextDouble() {
        return (rand.nextDouble() * 100.0);
    }

    void printArray(Shape[] array) {
        for (Shape sh : array) {
            sh.draw();
        }
    }
}
