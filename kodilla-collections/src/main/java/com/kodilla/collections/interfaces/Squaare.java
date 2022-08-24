package com.kodilla.collections.interfaces;

public class Squaare implements Shape{
    private double width;

    public Squaare(double width) {
        this.width = width;
    }

    public double getArea() {
        return width * width;
    }

    public double getPerimeter() {
        return 4 * width;
    }
}
