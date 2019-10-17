package com.it;

public class Trapeze extends Shape {
    private double leftTrapezoidBase;
    private double rightTrapezoidBase;
    private double trapezoidHeight;
    private double upperTrapeziumBase;
    private double lowerTrapeziumBase;

    public Trapeze() {
    }

    public Trapeze(double leftTrapezoidBase, double rightTrapezoidBase, double trapezoidHeight, double upperTrapeziumBase, double lowerTrapeziumBase, ColorEnum figureColor) {
        super(figureColor);
        this.leftTrapezoidBase = leftTrapezoidBase;
        this.rightTrapezoidBase = rightTrapezoidBase;
        this.trapezoidHeight = trapezoidHeight;
        this.upperTrapeziumBase = upperTrapeziumBase;
        this.lowerTrapeziumBase = lowerTrapeziumBase;
    }

    @Override
    public void draw() {
        System.out.printf("Shape: Trapeze, area: %.2f sq.unit, upper base: %.2f unit, lower base: %.2f unit, left side: %.2f unit, " +
                        "right base: %.2f unit, color: %s, perimeter: %.2f, height: %.2f unit, diagonal1: %.2f unit, diagonal2: %.2f unit\n",
                getArea(), getUpperTrapeziumBase(), getLowerTrapeziumBase(), getLeftTrapezoidBase(), getRightTrapezoidBase(), getFigureColor(), getPerimeter(),
                getTrapezoidHeight(), getDiagonal1(), getDiagonal2());
    }

    @Override
    public double getArea() {
        return 0.5 * (upperTrapeziumBase + lowerTrapeziumBase) * trapezoidHeight;
    }

    @Override
    public double getPerimeter() {
        return leftTrapezoidBase + rightTrapezoidBase + upperTrapeziumBase + lowerTrapeziumBase;
    }

    public double getLeftTrapezoidBase() {
        return leftTrapezoidBase;
    }

    public void setLeftTrapezoidBase(double leftTrapezoidBase) {
        this.leftTrapezoidBase = leftTrapezoidBase;
    }

    public double getRightTrapezoidBase() {
        return rightTrapezoidBase;
    }

    public void setRightTrapezoidBase(double rightTrapezoidBase) {
        this.rightTrapezoidBase = rightTrapezoidBase;
    }

    public double getTrapezoidHeight() {
        return trapezoidHeight;
    }

    public void setTrapezoidHeight(double trapezoidHeight) {
        this.trapezoidHeight = trapezoidHeight;
    }

    public double getUpperTrapeziumBase() {
        return upperTrapeziumBase;
    }

    public void setUpperTrapeziumBase(double upperTrapeziumBase) {
        this.upperTrapeziumBase = upperTrapeziumBase;
    }

    public double getLowerTrapeziumBase() {
        return lowerTrapeziumBase;
    }

    public void setLowerTrapeziumBase(double lowerTrapeziumBase) {
        this.lowerTrapeziumBase = lowerTrapeziumBase;
    }

    public double getDiagonal1() {
        return Math.sqrt(Math.pow(rightTrapezoidBase, 2) + upperTrapeziumBase * lowerTrapeziumBase - ((lowerTrapeziumBase * (Math.pow(rightTrapezoidBase, 2) - Math.pow(leftTrapezoidBase, 2))) / lowerTrapeziumBase - upperTrapeziumBase));
    }

    public double getDiagonal2() {
        return Math.sqrt(Math.pow(leftTrapezoidBase, 2) + upperTrapeziumBase * lowerTrapeziumBase - ((lowerTrapeziumBase * (Math.pow(leftTrapezoidBase, 2) - Math.pow(rightTrapezoidBase, 2))) / lowerTrapeziumBase - upperTrapeziumBase));
    }

    @Override
    public String toString() {
        return "Trapeze{" +
                "leftTrapezoidBase=" + leftTrapezoidBase +
                ", rightTrapezoidBase=" + rightTrapezoidBase +
                ", trapezoidHeight=" + trapezoidHeight +
                ", upperTrapeziumBase=" + upperTrapeziumBase +
                ", lowerTrapeziumBase=" + lowerTrapeziumBase +
                '}';
    }
}
