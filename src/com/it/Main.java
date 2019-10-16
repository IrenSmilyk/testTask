package com.it;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random rand = new Random();
        int amountOfElements = rand.nextInt(10);
        Shape[] array = new Shape[amountOfElements];
        Shape shape = null;
        for (int i = 0; i < amountOfElements; i++) {
            int randomNumber = rand.nextInt(4);
            switch (randomNumber) {
                case 0:
                    shape = new Circle();
                    shape.color = ColorEnum.values()[(int) (Math.random() * ColorEnum.values().length)];
                    ((Circle)shape).setRadius((rand.nextDouble()*10000)/100.0);
                    break;
                case 1:
                    shape = new Foursquare();
                    shape.color = ColorEnum.values()[(int) (Math.random() * ColorEnum.values().length)];
                    ((Foursquare)shape).setSideA((rand.nextDouble()*10000)/100.0);
                    break;
                case 2:
                    shape = new Trapeze();
                    shape.color = ColorEnum.values()[(int) (Math.random() * ColorEnum.values().length)];
                    ((Trapeze)shape).setSideA((rand.nextDouble()*10000)/100.0);
                    ((Trapeze)shape).setSideB((rand.nextDouble()*10000)/100.0);
                    ((Trapeze)shape).setTrapezoidBaseA((rand.nextDouble()*10000)/100.0);
                    ((Trapeze)shape).setTrapezoidBaseB((rand.nextDouble()*10000)/100.0);
                    ((Trapeze)shape).setTrapezoidHeight((rand.nextDouble()*10000)/100.0);

                    break;
                case 3:
                    shape = new Triangle();
                    shape.color = ColorEnum.values()[(int) (Math.random() * ColorEnum.values().length)];
                    ((Triangle)shape).setSideA((rand.nextDouble()*10000)/100.0);
                    ((Triangle)shape).setSideB((rand.nextDouble()*10000)/100.0);
                    ((Triangle)shape).setTriangleBase((rand.nextDouble()*10000)/100.0);
                    ((Triangle)shape).setTriangleHeight((rand.nextDouble()*10000)/100.0);
                    break;
            }
            array[i] = shape;
        }
        for (Shape sh : array) {
            System.out.println(sh);
        }
    }
}
