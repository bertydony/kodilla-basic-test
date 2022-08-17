package com.kodilla.inheritance.homework;

public class OperatingSystem {
    private int year;

    public OperatingSystem(int year) {
        this.year = year;
    }

    public void turnOn() {
        System.out.println("Turning on the computer");
    }

    public void turnOff() {
        System.out.println("Turning off the computer");
    }

    public void yearOfPublishment() {
        System.out.println("Publishing date: " + year);
    }

    public int getYear() {
        return year;
    }
}