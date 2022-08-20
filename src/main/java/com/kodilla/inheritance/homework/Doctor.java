package com.kodilla.inheritance.homework;

public class Doctor extends Job {
    public Doctor(int salary) {
        super(8000);
    }
    @Override
    public void giveResponsibilities() {
        System.out.println("Healing people" + " " + "Giving advice");
    }
}
