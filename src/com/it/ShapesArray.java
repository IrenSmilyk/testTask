package com.it;

import java.util.Random;

class ShapesArray {

    Shape[] fillArray() {
        Random rand = new Random();
        int highLevelRandomValues = 20; // maximum number of shapes in an array
        int amountOfElements = rand.nextInt(highLevelRandomValues); //random number of shapes in an array
        Shape[] array = new Shape[amountOfElements]; // array of shapes
        Shape shape = null;
        for (int i = 0; i < amountOfElements; i++) {
            int randomNumber = rand.nextInt(4); //random number for choosing the type of figure
            switch (randomNumber) {
                case 0:
                    shape = new Circle();
                    getRandomColor(shape);
                    ((Circle) shape).setRadius(getRandomDoubleValue(rand));
                    break;
                case 1:
                    shape = new Foursquare();
                    getRandomColor(shape);
                    ((Foursquare) shape).setSideFoursquare(getRandomDoubleValue(rand));
                    break;
                case 2:
                    shape = new Trapeze();
                    getRandomColor(shape);
                    ((Trapeze) shape).setUpperTrapeziumBase(getRandomDoubleValue(rand));
                    ((Trapeze) shape).setLowerTrapeziumBase(getRandomDoubleValue(rand));
                    ((Trapeze) shape).setLeftTrapezoidBase(getRandomDoubleValue(rand));
                    ((Trapeze) shape).setRightTrapezoidBase(getRandomDoubleValue(rand));
                    ((Trapeze) shape).setTrapezoidHeight(getRandomDoubleValue(rand));
                    break;
                case 3:
                    shape = new Triangle();
                    getRandomColor(shape);
                    ((Triangle) shape).setLeftSide(getRandomDoubleValue(rand));
                    ((Triangle) shape).setRightSide(getRandomDoubleValue(rand));
                    ((Triangle) shape).setTriangleBase(getRandomDoubleValue(rand));
                    ((Triangle) shape).setTriangleHeight(getRandomDoubleValue(rand));
                    break;
            }
            array[i] = shape;
        }
        return array;
    }

    void printArray(Shape[] array) {
        for (Shape sh : array) {
            System.out.println(sh);
        }
    }

    private double getRandomDoubleValue(Random rand) {
        return (rand.nextDouble() * 10000) / 100.0;
    }

    private void getRandomColor(Shape shape) {
        shape.figureColor = ColorEnum.values()[(int) (Math.random() * ColorEnum.values().length)];
    }
}
