package com.it;

public class Circle extends Shape {
    private double radius;
    private static final double PI = 3.1415;

    public Circle() {
    }

    Circle(double radius, ColorEnum figureColor) {
        super(figureColor);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("This is a draw method for Circle");
    }

    @Override
    public double getArea() {
        return radius * radius * PI;
    }

    @Override
    public ColorEnum getFigureColor() {
        return figureColor;
    }

    @Override
    public double getPerimeter() {
        return 2 * PI * radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return String.format("Shape: Circle, area: %.2f sq.unit, radius: %.2f unit, color: %s,"+
                "perimeter: %.2f", getArea(), getRadius(), getFigureColor(), getPerimeter());
    }

}
