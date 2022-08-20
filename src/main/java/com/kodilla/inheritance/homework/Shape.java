package com.kodilla.inheritance.homework;

public abstract class Shape {
    public double area;
    public double circuit;

    public Shape(double area, double circuit){
        this.area = area;
        this.circuit = circuit;
    }
    public abstract void giveArea();
    public abstract void giveCircuit();
}
