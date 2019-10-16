package com.it;

public class Circle extends Shape {
    private float radius;
    public static final float PI=3.1415F;

    public Circle(float radius, ColorEnum color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("This is a circle");
    }

    @Override
    public float area() {
        return radius*radius*PI;
    }

    @Override
    public ColorEnum getColor() {
     return color;
    }

    float perimeter(){
        return 2*PI*radius;
    }

    float getRadius() {
        return radius;
    }


    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color=" + color +
                '}';
    }


}
