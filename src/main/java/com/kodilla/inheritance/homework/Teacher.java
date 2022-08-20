package com.kodilla.inheritance.homework;

public class Teacher extends Job {
    public Teacher(int salary) {
        super(3000);
    }
    @Override
    public void giveResponsibilities() {
        System.out.println("Teaching" + " " + "Giving grades");
    }
}
