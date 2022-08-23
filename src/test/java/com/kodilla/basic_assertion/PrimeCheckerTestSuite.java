package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PrimeCheckerTestSuite {
    private PrimeChecker checker = new PrimeChecker();
    private static int count = 0;
    @Test
    public void shouldReturnFalseWhenPassingNotPrimeNumber() {
        boolean result = checker.isPrime(14);
        count++;
        System.out.println("Test number " + count);
        assertFalse(result);
    }

    @Test
    public void returnTrueWhenPrimeNumber() {
        boolean result = checker.isPrime(13);
        count++;
        System.out.println("Test number " + count);
        assertTrue(result);
    }

    @Test
    public void returnTrueWhenPrimeNumberTwo() {
        boolean result = checker.isPrime(2);
        count++;
        System.out.println("Test number " + count);
        assertTrue(result);
    }

    @Test
    public void returnFalseWhenNoPrimeNumberOne() {
        boolean result = checker.isPrime(1);
        count++;
        System.out.println("Test number " + count);
        assertFalse(result);
    }

    @Test
    public void returnFalseWhenNoPrimeNumberZero() {
        boolean result = checker.isPrime(0);
        count++;
        System.out.println("Test number " + count);
        assertFalse(result);
    }

    @Test
    public void returnFalseWhenNoPrimeNegativeNumber() {
        boolean result = checker.isPrime(-6);
        count++;
        System.out.println("Test number " + count);
        assertFalse(result);
    }

}
