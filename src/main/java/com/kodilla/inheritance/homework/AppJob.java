package com.kodilla.inheritance.homework;

public class AppJob {
    public static void main(String[] args) {
        Teacher teacher = new Teacher( 3000);
        teacher.giveResponsibilities();

        Doctor doctor = new Doctor(8000);
        doctor.giveResponsibilities();
    }
}
