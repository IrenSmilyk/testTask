package com.it;

public class Foursquare extends Shape {

    private float sideA;


    public Foursquare(float sideA, ColorEnum color) {
        super(color);
        this.sideA = sideA;
    }

    @Override
    public void draw() {
        System.out.println("This is a draw method for Foursquare");
    }

    @Override
    public float area() {
        return sideA * sideA;
    }

    @Override
    public ColorEnum getColor() {
        return color;
    }

    public float getSideA() {
        return sideA;
    }

    public void setSideA(float sideA) {
        this.sideA = sideA;
    }

    @Override
    public float perimeter() {
        return 4 * sideA;
    }

    public float getDiagonal() {
        return sideA * (float) (Math.sqrt(2));
    }

    @Override
    public String toString() {
        return String.format("Shape: Foursquare, area: %.2f sq.unit, side: %.2f unit, color: %s, perimeter: %.2f, diagonal: %.2f unit", area(), getSideA(), color, perimeter(), getDiagonal());
    }

}
