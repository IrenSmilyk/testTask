package com.it;

public abstract class Shape {
    ColorEnum figureColor;

    public Shape() {
    }

    Shape(ColorEnum figureColor) {
        this.figureColor = figureColor;
    }

    public abstract void draw();

    public abstract double getArea();

    public abstract ColorEnum getFigureColor();

    public abstract double getPerimeter();


}
