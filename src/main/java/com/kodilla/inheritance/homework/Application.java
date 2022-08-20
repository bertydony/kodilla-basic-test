package com.kodilla.inheritance.homework;

public class Application {
    public static void main(String[] args) {

        Square square = new Square(0,0);
        square.giveArea();
        square.giveCircuit();

        Rectangle rectangle = new Rectangle(0,0);
        rectangle.giveArea();
        rectangle.giveCircuit();

        Diamond diamond = new Diamond(0,0);
        diamond.giveArea();
        diamond.giveCircuit();
    }
    }

