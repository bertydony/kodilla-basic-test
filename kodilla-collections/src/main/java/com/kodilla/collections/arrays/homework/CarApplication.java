package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.interfaces.homework.Audi;
import com.kodilla.collections.interfaces.homework.BMW;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Opel;

import java.util.Random;

public class CarApplication {
    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        Random random = new Random();
        Car[] cars = new Car[random.nextInt(15) + 1];
        for (int n = 0; n < cars.length; n++)
            cars[n] = drawCar();
        for (Car car : cars)
            CarUtils.displayCarInfo(car);

    }

    private static Car drawCar() {
        Random random = new Random();
        int drawnCarKind = random.nextInt(3);     // possible values: 0, 1, 2
        double a = getRandomSize(random);
        if (drawnCarKind == 0)
            return new Audi(a);
        else if (drawnCarKind == 1)
            return new BMW(a);
        else {
            double b = getRandomSize(random);
            double c = getRandomSize(random);
            return new Opel(a);
        }
    }

    private static double getRandomSize(Random random) {
        return random.nextDouble() * 100 + 1;       // possible values: 1.000-100.999...
    }
}
