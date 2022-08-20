package com.kodilla.inheritance.homework;

public abstract class Job {
    private int salary;
    public Job(int salary) {
        this.salary = salary;
    }
    public int getSalary() {
        return salary;
    }
    public abstract void giveResponsibilities();
}
