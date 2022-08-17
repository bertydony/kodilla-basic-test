package com.kodilla.inheritance.homework;

public class SystemApp {
    public static void main(String[] args) {
        Windows windows = new Windows(1992);
        windows.turnOn();
        windows.yearOfPublishment();

        Linux linux = new Linux(1994);
        linux.turnOn();
        linux.yearOfPublishment();
    }
}