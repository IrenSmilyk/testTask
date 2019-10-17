package com.it;

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
                "%.2f, diagonal: %.2f unit\n", getArea(), getSideSquare(), getFigureColor(), getPerimeter(), getDiagonal());
    }

    @Override
    public double getArea() {
        return Math.pow(sideSquare,2);
    }

    @Override
    public double getPerimeter() {
        return 4 * sideSquare;
    }

    public double getSideSquare() {
        return sideSquare;
    }

    public void setSideSquare(double sideSquare) {
        this.sideSquare = sideSquare;
    }

    public double getDiagonal() {
        return sideSquare * (float) (Math.sqrt(2));
    }

    @Override
    public String toString() {
        return "Square{" +
                "sideSquare=" + sideSquare +
                '}';
    }
}
