package com.it;

public class Main {

    public static void main(String[] args) {
        ShapesArray shapesArray = new ShapesArray();
        System.out.println("A random set of shapes with a random number of objects in the set:");
        shapesArray.printArray(shapesArray.fillArray());
    }
}
