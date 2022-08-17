package com.kodilla.inheritance.homework;

public class Windows extends OperatingSystem {
    public Windows(int year) {
        super(year);
    }

    public void turnOn() {
        System.out.println("Turning on the computer");
    }

    public void turnOff() {
        System.out.println("Turning off the computer");
    }

}