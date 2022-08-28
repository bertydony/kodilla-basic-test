package com.kodilla.collections.arrays.homework;


import com.kodilla.collections.interfaces.homework.Audi;
import com.kodilla.collections.interfaces.homework.BMW;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Opel;

public class CarUtils {
    public static void displayCarInfo(Car car) {
        System.out.println("-----------------------------");
        System.out.println("Car brand: " + getCarName(car));
        System.out.println("Car Speed: " + car.getSpeed());
        System.out.println("Car acceleration: " + car.increaseSpeed());
    }

    private static String getCarName(Car car) {
        if (car instanceof Audi)
            return "Audi";
        else if (car instanceof BMW)
            return "BMW";
        else if (car instanceof Opel)
            return "Opel";
        else
            return "Unknown car name";
    }
}
