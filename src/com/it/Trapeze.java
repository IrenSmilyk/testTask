package com.it;

public class Trapeze extends Shape {
    private double trapezoidBaseA;
    private double trapezoidBaseB;
    private double trapezoidHeight;
    private double sideA;
    private double sideB;

    public Trapeze() {
    }

    public Trapeze(double trapezoidBaseA, double trapezoidBaseB, double trapezoidHeight, double sideA, double sideB, ColorEnum color) {
        super(color);
        this.trapezoidBaseA = trapezoidBaseA;
        this.trapezoidBaseB = trapezoidBaseB;
        this.trapezoidHeight = trapezoidHeight;
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public double getTrapezoidBaseA() {
        return trapezoidBaseA;
    }

    public void setTrapezoidBaseA(double trapezoidBaseA) {
        this.trapezoidBaseA = trapezoidBaseA;
    }

    public double getTrapezoidBaseB() {
        return trapezoidBaseB;
    }

    public void setTrapezoidBaseB(double trapezoidBaseB) {
        this.trapezoidBaseB = trapezoidBaseB;
    }

    public double getTrapezoidHeight() {
        return trapezoidHeight;
    }

    public void setTrapezoidHeight(double trapezoidHeight) {
        this.trapezoidHeight = trapezoidHeight;
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
        System.out.println("This is a draw method for Trapeze");
    }

    @Override
    public double area() {
        return 0.5f * (trapezoidBaseA + trapezoidBaseB) * trapezoidHeight;
    }

    @Override
    public ColorEnum getColor() {
        return color;
    }

    @Override
    public double perimeter() {
        return trapezoidBaseA + trapezoidBaseB + sideA + sideB;
    }

    @Override
    public String toString() {
        return String.format("Shape: Trapeze, area: %.2f sq.unit, sideA: %.2f unit, sideB: %.2f unit, trapezoid baseB: %.2f unit," +
                " trapezoid baseA: %.2f unit, color: %s, perimeter: %.2f, trapezoid height: %.2f", area(), getSideA(), getSideB(),
                getTrapezoidBaseA(), getTrapezoidBaseB(), color, perimeter(), getTrapezoidHeight());
    }
}
