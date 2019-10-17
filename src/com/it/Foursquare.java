package com.it;

public class Foursquare extends Shape {

    private double sideFoursquare;

    public Foursquare() {
    }

    public Foursquare(double sideFoursquare, ColorEnum figureColor) {
        super(figureColor);
        this.sideFoursquare = sideFoursquare;
    }

    @Override
    public void draw() {
        System.out.println("This is a draw method for Foursquare");
    }

    @Override
    public double getArea() {
        return sideFoursquare * sideFoursquare;
    }

    @Override
    public ColorEnum getFigureColor() {
        return figureColor;
    }

    public double getSideFoursquare() {
        return sideFoursquare;
    }

    public void setSideFoursquare(double sideFoursquare) {
        this.sideFoursquare = sideFoursquare;
    }

    @Override
    public double getPerimeter() {
        return 4 * sideFoursquare;
    }

    public double getDiagonal() {
        return sideFoursquare * (float) (Math.sqrt(2));
    }

    @Override
    public String toString() {
        return String.format("Shape: Foursquare, area: %.2f sq.unit, side: %.2f unit, color: %s, perimeter:"+
                "%.2f, diagonal: %.2f unit", getArea(), getSideFoursquare(), getFigureColor(), getPerimeter(), getDiagonal());
    }

}
