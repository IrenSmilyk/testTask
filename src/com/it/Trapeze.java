package com.it;

public class Trapeze extends Shape {
    private float trapezoidBaseA;
    private float trapezoidBaseB;
    private float trapezoidHeight;
    private float sideA;
    private float sideB;

    public Trapeze(float trapezoidBaseA, float trapezoidBaseB, float trapezoidHeight, float sideA, float sideB, ColorEnum color) {
        super(color);
        this.trapezoidBaseA = trapezoidBaseA;
        this.trapezoidBaseB = trapezoidBaseB;
        this.trapezoidHeight = trapezoidHeight;
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public float getTrapezoidBaseA() {
        return trapezoidBaseA;
    }

    public void setTrapezoidBaseA(float trapezoidBaseA) {
        this.trapezoidBaseA = trapezoidBaseA;
    }

    public float getTrapezoidBaseB() {
        return trapezoidBaseB;
    }

    public void setTrapezoidBaseB(float trapezoidBaseB) {
        this.trapezoidBaseB = trapezoidBaseB;
    }

    public float getTrapezoidHeight() {
        return trapezoidHeight;
    }

    public void setTrapezoidHeight(float trapezoidHeight) {
        this.trapezoidHeight = trapezoidHeight;
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
        System.out.println("This is a draw method for Trapeze");
    }

    @Override
    public float area() {
        return 0.5f * (trapezoidBaseA + trapezoidBaseB) * trapezoidHeight;
    }

    @Override
    public ColorEnum getColor() {
        return color;
    }

    @Override
    public float perimeter() {
        return trapezoidBaseA + trapezoidBaseB + sideA + sideB;
    }

}
