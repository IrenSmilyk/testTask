package com.it;

public class Main {

    public static void main(String[] args) {
        Circle circle = new Circle(3.6f, ColorEnum.GRAY);
        circle.draw();
        System.out.println(circle);
        Foursquare foursquare = new Foursquare(4f, ColorEnum.RED);
        foursquare.draw();
        System.out.println(foursquare);
        Triangle triangle = new Triangle(2, 3, 4, 5, ColorEnum.BLUE);
        triangle.draw();
        System.out.println(triangle);
    }
}
