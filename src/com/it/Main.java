package com.it;

public class Main {

    public static void main(String[] args) {
        Circle circle = new Circle(3.6f, ColorEnum.GRAY);
        System.out.println("Area "+circle.area());
        circle.draw();
        System.out.println("Color "+circle.getColor());
        System.out.println("Radius "+circle.getRadius());
        System.out.println("Perimeter "+circle.perimeter());
        System.out.println(circle);
    }
}
