package com.kodilla.collections.interfaces.homework;

public class CarRace {

        public static void main(String[] args) {
            BMW bmw = new BMW(100);
            doRace(bmw);

            Audi audi  = new Audi(100);
            doRace(audi);

            Opel opel = new Opel(100);
            doRace(opel);
        }

        private static void doRace(Car car) {
            System.out.println("Increase Speed: "+car.increaseSpeed());
            System.out.println("Decrease speed: "+car.decreaseSpeed());
            System.out.println("Final speed: "+car.getSpeed());
        }
}
