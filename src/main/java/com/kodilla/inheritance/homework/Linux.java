package com.kodilla.inheritance.homework;

public class Linux extends Windows {
    public Linux(int year) {
        super(year);
    }

    public void turnOn() {
        System.out.println("Turning on the computer");
    }

    public void turnOff() {
        System.out.println("Turning off the computer");
    }
}
