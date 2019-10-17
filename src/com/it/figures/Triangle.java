package com.it.figures;

import com.it.ColorEnum;

public class Triangle extends Shape {
    private double triangleBase;
    private double heightHeldToBaseSide;
    private double leftSide;
    private double rightSide;

    public Triangle() {
    }

    public Triangle(double triangleBase, double heightHeldToBaseSide, double leftSide, double rightSide, ColorEnum figureColor) {
        super(figureColor);
        this.triangleBase = triangleBase;
        this.heightHeldToBaseSide = heightHeldToBaseSide;
        this.leftSide = leftSide;
        this.rightSide = rightSide;
    }

    @Override
    public void draw() {
        System.out.printf("Shape: Triangle, area: %.2f sq.unit, left side: %.2f unit, right side: %.2f unit, base: %.2f unit, " +
                        "color: %s, perimeter: %.2f, height: %.2f unit\n", area(), getLeftSide(), getRightSide(),
                getTriangleBase(), getFigureColor(), perimeter(), getHeightHeldToBaseSide());
    }

    @Override
    public double area() {
        return 0.5 * triangleBase * heightHeldToBaseSide;
    }

    @Override
    public double perimeter() {
        return leftSide + rightSide + triangleBase;
    }

    public double getTriangleBase() {
        return triangleBase;
    }

    public void setTriangleBase(double triangleBase) {
        this.triangleBase = triangleBase;
    }

    public double getHeightHeldToBaseSide() {
        return heightHeldToBaseSide;
    }

    public void setHeightHeldToBaseSide(double heightHeldToBaseSide) {
        this.heightHeldToBaseSide = heightHeldToBaseSide;
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
    public String toString() {
        return "Triangle{" +
                "triangleBase=" + triangleBase +
                ", heightHeldToBaseSide=" + heightHeldToBaseSide +
                ", leftSide=" + leftSide +
                ", rightSide=" + rightSide +
                '}';
    }
}
