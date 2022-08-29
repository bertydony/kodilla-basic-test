package com.kodilla.collections.lists.homework;
import com.kodilla.collections.interfaces.homework.Audi;
import com.kodilla.collections.interfaces.homework.Car;
import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {
    public static void main(String[] args) {
        List<Audi> cars = new ArrayList<>();
        cars.add(new Audi(140));
        cars.add(new Audi(50));
        cars.add(new Audi(90));

        cars.remove(2);
        Audi audi = new Audi(50);
        cars.remove(audi);

        System.out.println(cars.size());
        for (Audi car : cars) {
            System.out.println(car + ", Final speed:" + car.getSpeed());
        }
    }
}
