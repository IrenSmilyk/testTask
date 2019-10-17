package com.it.figures;

import com.it.ColorEnum;

public class Square extends Shape {

    private double sideSquare;

    public Square() {
    }

    public Square(double sideSquare, ColorEnum figureColor) {
        super(figureColor);
        this.sideSquare = sideSquare;
    }

    @Override
    public void draw() {
        System.out.printf("Shape: Square, area: %.2f sq.unit, side: %.2f unit, color: %s, perimeter: " +
                "%.2f, diagonal: %.2f unit\n", area(), getSideSquare(), getFigureColor(), perimeter(), diagonalSize());
    }

    @Override
    public double area() {
        return Math.pow(sideSquare,2);
    }

    @Override
    public double perimeter() {
        return 4 * sideSquare;
    }

    public double getSideSquare() {
        return sideSquare;
    }

    public void setSideSquare(double sideSquare) {
        this.sideSquare = sideSquare;
    }

    public double diagonalSize() {
        return sideSquare * (float) (Math.sqrt(2));
    }

    @Override
    public String toString() {
        return "Square{" +
                "sideSquare=" + sideSquare +
                '}';
    }
}
