package com.kodilla.basic_assertion;

public class Application {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 7;
        int n = 2;

        int sumResult = calculator.sum(a, b);
        int subtractResult = calculator.subtract(a, b);
        int squaredResult = calculator.squared(a, n);
        boolean correct = ResultChecker.assertEquals(12, sumResult);
        if(correct){
            System.out.println("Metoda sum działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda sum nie działa poprawnie dla liczb " + a + " i " + b);
        }
        boolean correct2 = ResultChecker.assertEquals(-2, subtractResult);
        if(correct2){
            System.out.println("Metoda substract działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda substract nie działa poprawnie dla liczb " + a + " i " + b);
        }
        boolean correct3 = ResultChecker.assertEquals(25, squaredResult);
        if(correct3){
            System.out.println("Metoda squared działa poprawnie dla liczb " + a );
        } else {
            System.out.println("Metoda squared nie działa poprawnie dla liczb " + a );
        }
    }
}