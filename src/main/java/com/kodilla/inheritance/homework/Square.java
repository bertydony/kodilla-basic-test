package com.kodilla.inheritance.homework;

public class Square extends Shape {

    public Square(double area, double circuit) {
        super(area,circuit);
    }
    double a = 5;

    @Override
    public void giveArea() {
        System.out.println("Pole kwadratu wynosi: " +a*a);
    }

    @Override
    public void giveCircuit() {
        System.out.println("Obwód kwadratu wynosi: " +a*4);
    }
}
