package com.it;

public class Triangle extends Shape {
    private double triangleBase;
    private double triangleHeight;
    private double sideA;
    private double sideB;

    public Triangle() {
    }

    public Triangle(double triangleBase, double triangleHeight, double sideA, double sideB, ColorEnum color) {
        super(color);
        this.triangleBase = triangleBase;
        this.triangleHeight = triangleHeight;
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public double getTriangleBase() {
        return triangleBase;
    }

    public void setTriangleBase(double triangleBase) {
        this.triangleBase = triangleBase;
    }

    public double getTriangleHeight() {
        return triangleHeight;
    }

    public void setTriangleHeight(double triangleHeight) {
        this.triangleHeight = triangleHeight;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }


    @Override
    public void draw() {
        System.out.println("This is a draw method for Triangle");
    }

    @Override
    public double area() {
        return 0.5f*triangleBase*triangleHeight;
    }

    @Override
    public ColorEnum getColor() {
        return color;
    }

    @Override
    public double perimeter() {
        return sideA+sideB+triangleBase;
    }

    @Override
    public String toString() {
        return String.format("Shape: Triangle, area: %.2f sq.unit, sideA: %.2f unit, sideB: %.2f unit, sideC: %.2f unit," +
                " color: %s, perimeter: %.2f, triangle height: %.2f", area(), getSideA(), getSideB(), getTriangleBase(), color, perimeter(), getTriangleHeight());
    }
}
