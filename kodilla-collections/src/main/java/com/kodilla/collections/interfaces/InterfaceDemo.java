package com.kodilla.collections.interfaces;

public class InterfaceDemo {
    public static void main(String[] args) {
        Squaare squaare = new Squaare(10.0);
        showShapesDetails(squaare);

        Circle circle = new Circle(7);
        showShapesDetails(circle);

        Triangle triangle = new Triangle(6.0, 4.0, 7.211);
        showShapesDetails(triangle);
    }

    private static void showShapesDetails(Shape shape) {
        System.out.println(shape.getArea());
        System.out.println(shape.getPerimeter());
    }

}