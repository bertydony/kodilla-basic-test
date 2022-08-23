package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {
    private Calculator calculator = new Calculator();

    @Test
    public void testSum() {
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        assertEquals(13, sumResult);
    }

    @Test
    public void testSub() {
        int a = 10;
        int b = 8;
        int subtractResult = calculator.subtract(a, b);
        assertEquals(2, subtractResult);
    }

    @Test
    public void testSquared() {
        int a = 5;
        int n = 2;
        int squaredResult = calculator.squared(a, n);
        assertEquals(25, squaredResult, 0.1);
    }

    @Test
    public void squaredZero() {
        int a = 0;
        int n = 2;
        int squaredResult = calculator.squared(a, n);
        assertEquals(0, squaredResult, 0.01);
    }

    @Test
    public void squaredNegativeNumber() {
        int a = -5;
        int n = 3;
        int squaredResult = calculator.squared(a, n);
        assertEquals(-125, squaredResult, 0.01);
    }
}
