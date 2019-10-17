package com.it;

public class Circle extends Shape {
    private double radius;
    private static final double PI = 3.1415;

    public Circle() {
    }

    public Circle(double radius, ColorEnum figureColor) {
        super(figureColor);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.printf("Shape: Circle, area: %.2f sq.unit, radius: %.2f unit, color: %s, " +
                "perimeter: %.2f\n", getArea(), getRadius(), getFigureColor(), getPerimeter());
    }

    @Override
    public double getArea() {
        return PI * Math.pow(radius, 2);
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
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
