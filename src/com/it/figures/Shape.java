package com.it.figures;

import com.it.ColorEnum;

public abstract class Shape {
    private ColorEnum figureColor;

    protected Shape() {
    }

    protected Shape(ColorEnum figureColor) {
        this.figureColor = figureColor;
    }

    public abstract void draw();

    public abstract double area();

    public abstract double perimeter();

    public ColorEnum getFigureColor(){
        return figureColor;
    }

    public void setFigureColor(ColorEnum figureColor) {
        this.figureColor = figureColor;
    }
}
