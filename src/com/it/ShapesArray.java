package com.it;

import java.util.Random;

class ShapesArray {

    Shape[] fillArray() {
        Random rand = new Random();
        int highLevelRandomValues = 20; // maximum number of shapes in an array
        int amountOfElements = rand.nextInt(highLevelRandomValues); //random number of shapes in an array
        Shape[] array = new Shape[amountOfElements]; // array of shapes

        for (int i = 0; i < amountOfElements; i++) {
            int randomNumber = rand.nextInt(4); //random number for choosing the type of figure
            switch (randomNumber) {
                case 0:
                    Circle circle = new Circle();
                    circle.setFigureColor(getRandomColor());
                    circle.setRadius(getRandomDoubleValue(rand));
                    array[i] = circle;
                    break;
                case 1:
                    Square foursquare = new Square();
                    foursquare.setFigureColor(getRandomColor());
                    foursquare.setSideSquare(getRandomDoubleValue(rand));
                    array[i] = foursquare;
                    break;
                case 2:
                    Trapeze trapeze = new Trapeze();
                    trapeze.setFigureColor(getRandomColor());
                    trapeze.setUpperTrapeziumBase(getRandomDoubleValue(rand));
                    trapeze.setLowerTrapeziumBase(getRandomDoubleValue(rand));
                    trapeze.setLeftTrapezoidBase(getRandomDoubleValue(rand));
                    trapeze.setRightTrapezoidBase(getRandomDoubleValue(rand));
                    trapeze.setTrapezoidHeight(getRandomDoubleValue(rand));
                    array[i] = trapeze;
                    break;
                case 3:
                    Triangle triangle = new Triangle();
                    triangle.setFigureColor(getRandomColor());
                    triangle.setLeftSide(getRandomDoubleValue(rand));
                    triangle.setRightSide(getRandomDoubleValue(rand));
                    triangle.setTriangleBase(getRandomDoubleValue(rand));
                    triangle.setHeightHeldToBaseSide(getRandomDoubleValue(rand));
                    array[i] = triangle;
                    break;
            }

        }
        return array;
    }

    private ColorEnum getRandomColor() {
        return ColorEnum.values()[(int) (Math.random() * ColorEnum.values().length)];
    }

    private double getRandomDoubleValue(Random rand) {
        return (rand.nextDouble() * 100.0);
    }

    void printArray(Shape[] array) {
        for (Shape sh : array) {
            sh.draw();
        }
    }
}
