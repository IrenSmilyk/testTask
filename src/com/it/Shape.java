package com.it;

public abstract class Shape {
    private ColorEnum figureColor;

    protected Shape() {
    }

    protected Shape(ColorEnum figureColor) {
        this.figureColor = figureColor;
    }

    public abstract void draw();

    public abstract double getArea();

    public abstract double getPerimeter();

    public ColorEnum getFigureColor(){
        return figureColor;
    }

    public void setFigureColor(ColorEnum figureColor) {
        this.figureColor = figureColor;
    }
}
