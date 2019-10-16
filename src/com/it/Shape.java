package com.it;

public abstract class Shape {
    ColorEnum color;

    public Shape() {
    }

    Shape(ColorEnum color) {
        this.color = color;
    }

    public abstract void draw();

    public abstract double area();

    public abstract ColorEnum getColor();

    public abstract double perimeter();


}
