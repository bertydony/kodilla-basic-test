package com.kodilla.inheritance.homework;

public class Diamond extends Shape {
    public Diamond(double area, double circuit) {
        super(area, circuit);
    }
    double a = 5;
    double h = 4;

    @Override
    public void giveArea() {
        System.out.println("Pole rombu wynosi: " +a*h);
    }

    @Override
    public void giveCircuit() {
        System.out.println("Obwód rombu wynosi: " +a*4);
    }
}
