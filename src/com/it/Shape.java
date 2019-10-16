package com.it;

public abstract class Shape {
    ColorEnum color;

    Shape(ColorEnum color) {
        this.color = color;
    }

    public abstract void draw();
    public abstract float area();
    public abstract ColorEnum getColor();

    @Override
    public String toString() {
        return "Shape:" ;
    }
}
