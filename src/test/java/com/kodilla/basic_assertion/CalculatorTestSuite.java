package com.kodilla.basic_assertion;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {
    private Calculator calculator;
    int b;
    int a;
    int n;


    @BeforeAll
    public void setUp(){
        calculator = new Calculator();
        b = 8;
        a = 5;
        n = 2;

    }

    @Test
    public void testSum() {
        int sumResult = calculator.sum(a, b);
        assertEquals(13, sumResult);
    }

    @Test
    public void testSub() {
        int subtractResult = calculator.subtract(a, b);
        assertEquals(-3, subtractResult);
    }

    @Test
    public void testSquared() {
        int squaredResult = calculator.squared(a, n);
        assertEquals(25, squaredResult, 0.1);
    }

    @Test
    public void squaredZero() {
        int squaredResult = calculator.squared(a, n);
        assertEquals(0, squaredResult, 0.01);
    }

    @Test
    public void squaredNegativeNumber() {
        int squaredResult = calculator.squared(a, n);
        assertEquals(-125, squaredResult, 0.01);
    }
}
