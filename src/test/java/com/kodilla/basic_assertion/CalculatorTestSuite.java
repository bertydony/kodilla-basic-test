package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {
    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        assertEquals(13, sumResult);
    }
    @Test
    public void testSub() {
        Calculator calculator = new Calculator();
        int a = 10;
        int b = 8;
        int subtractResult = calculator.subtract(a, b);
        assertEquals(2, subtractResult);
    }
    @Test
    public void testSquared() {
        Calculator calculator = new Calculator();
        int a = 5;
        int n = 2;
        int squaredResult = calculator.squared(a, n);

        assertEquals(25, squaredResult);
    }
}
