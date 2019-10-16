package com.it;

public class Circle extends Shape {
    private float radius;
    private static final float PI = 3.1415F;

    Circle(float radius, ColorEnum color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("This is a draw method for Circle");
    }

    @Override
    public float area() {
        return radius * radius * PI;
    }

    @Override
    public ColorEnum getColor() {
        return color;
    }

    @Override
    public float perimeter() {
        return 2 * PI * radius;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return String.format("Shape: Circle, area: %.2f sq.unit, radius: %.2f unit, color: %s, perimeter: %.2f", area(), getRadius(), color, perimeter());
    }

}
