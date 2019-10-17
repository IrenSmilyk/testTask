package com.it;

public class Triangle extends Shape {
    private double triangleBase;
    private double triangleHeight;
    private double leftSide;
    private double rightSide;

    public Triangle() {
    }

    public Triangle(double triangleBase, double triangleHeight, double sideA, double sideB, ColorEnum figureColor) {
        super(figureColor);
        this.triangleBase = triangleBase;
        this.triangleHeight = triangleHeight;
        this.leftSide = sideA;
        this.rightSide = sideB;
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

    public double getLeftSide() {
        return leftSide;
    }

    public void setLeftSide(double leftSide) {
        this.leftSide = leftSide;
    }

    public double getRightSide() {
        return rightSide;
    }

    public void setRightSide(double rightSide) {
        this.rightSide = rightSide;
    }


    @Override
    public void draw() {
        System.out.println("This is a draw method for Triangle");
    }

    @Override
    public double getArea() {
        return 0.5f*triangleBase*triangleHeight;
    }

    @Override
    public ColorEnum getFigureColor() {
        return figureColor;
    }

    @Override
    public double getPerimeter() {
        return leftSide + rightSide +triangleBase;
    }

    @Override
    public String toString() {
        return String.format("Shape: Triangle, area: %.2f sq.unit, leftSide: %.2f unit, rightSide: %.2f unit, sideC: %.2f unit," +
                "color: %s, perimeter: %.2f, triangle height: %.2f", getArea(), getLeftSide(), getRightSide(),
                getTriangleBase(), figureColor, getPerimeter(), getTriangleHeight());
    }
}
