package com.kodilla.inheritance.homework;

public class Rectangle extends Shape {
    public Rectangle(double area, double circuit) {
        super(area,circuit);
    }
    double a = 5;
    double b = 3;

    @Override
    public void giveArea() {
        System.out.println("Pole prostokąta wynosi: " +a*b);
    }

    @Override
    public void giveCircuit() {
        System.out.println("Obwód prostokąta wynosi: " +(2*a + 2*b));
    }
}
