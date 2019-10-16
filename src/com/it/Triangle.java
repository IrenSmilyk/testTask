package com.it;

public class Triangle extends Shape {
    private float triangleBase;
    private float triangleHeight;
    private float sideA;
    private float sideB;


    public Triangle(float triangleBase, float triangleHeight, float sideA, float sideB, ColorEnum color) {
        super(color);
        this.triangleBase = triangleBase;
        this.triangleHeight = triangleHeight;
        this.sideA = sideA;
        this.sideB = sideB;

    }

    public float getTriangleBase() {
        return triangleBase;
    }

    public void setTriangleBase(float triangleBase) {
        this.triangleBase = triangleBase;
    }

    public float getTriangleHeight() {
        return triangleHeight;
    }

    public void setTriangleHeight(float triangleHeight) {
        this.triangleHeight = triangleHeight;
    }

    public float getSideA() {
        return sideA;
    }

    public void setSideA(float sideA) {
        this.sideA = sideA;
    }

    public float getSideB() {
        return sideB;
    }

    public void setSideB(float sideB) {
        this.sideB = sideB;
    }


    @Override
    public void draw() {
        System.out.println("This is a draw method for Triangle");
    }

    @Override
    public float area() {
        return 0.5f*triangleBase*triangleHeight;
    }

    @Override
    public ColorEnum getColor() {
        return color;
    }

    @Override
    public float perimeter() {
        return sideA+sideB+triangleBase;
    }

    @Override
    public String toString() {
        return String.format("Shape: Triangle, area: %.2f sq.unit, sideA: %.2f unit, sideB: %.2f unit, sideC: %.2f unit," +
                " color: %s, perimeter: %.2f, triangle height: %.2f", area(), getSideA(), getSideB(), getTriangleBase(), color, perimeter(), getTriangleHeight());
    }
}
