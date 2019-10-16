package com.it;

public class Foursquare extends Shape {

    private double sideA;

    public Foursquare() {
    }

    public Foursquare(double sideA, ColorEnum color) {
        super(color);
        this.sideA = sideA;
    }

    @Override
    public void draw() {
        System.out.println("This is a draw method for Foursquare");
    }

    @Override
    public double area() {
        return sideA * sideA;
    }

    @Override
    public ColorEnum getColor() {
        return color;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    @Override
    public double perimeter() {
        return 4 * sideA;
    }

    public double getDiagonal() {
        return sideA * (float) (Math.sqrt(2));
    }

    @Override
    public String toString() {
        return String.format("Shape: Foursquare, area: %.2f sq.unit, side: %.2f unit, color: %s, perimeter: %.2f, diagonal: %.2f unit", area(), getSideA(), color, perimeter(), getDiagonal());
    }

}
