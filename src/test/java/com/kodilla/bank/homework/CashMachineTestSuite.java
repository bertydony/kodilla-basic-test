package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashMachineTestSuite {
    private CashMachine CashMachine = new CashMachine();

    @Test
    public void shouldHaveZeroLength() {

        int[] values = CashMachine.getOperations();
        assertEquals(0, values.length);
    }

    @Test
    public void shouldAddTwoElementsToArray() {

        CashMachine.addOperation(200);
        CashMachine.addOperation(500);

        int[] values = CashMachine.getOperations();
        assertEquals(2, values.length);
        assertEquals(200, values[0]);
        assertEquals(500, values[1]);
    }

    @Test
    public void numbersOfOperationsTest() {
        CashMachine.addOperation(100);
        CashMachine.addOperation(500);
        CashMachine.addOperation(200);
        CashMachine.addOperation(100);
        CashMachine.addOperation(100);

        int result = CashMachine.getOperations().length;
        int expectedResult = 5;
        assertEquals(expectedResult, result);
    }

    @Test
    public void getAverageOfOperationsTest() {
        CashMachine.addOperation(100);
        CashMachine.addOperation(500);
        CashMachine.addOperation(200);
        CashMachine.addOperation(100);
        CashMachine.addOperation(100);

        double expected = 200;
        assertEquals(expected, CashMachine.getAverageOfOperations());
    }

    @Test
    public void getCountOfCashTest() {
        CashMachine.addOperation(200);
        CashMachine.addOperation(300);

        int result = CashMachine.getCountOfCash();
        int expected = 500;

        assertEquals(expected, result);
    }

    @Test
    public void getAverageOfWithdrawTest() {
        CashMachine.addOperation(100);
        CashMachine.addOperation(500);

        double expected = 300;

        assertEquals(expected, CashMachine.getAverageOfWithdraw());
    }

    @Test
    public void getNumberOfWithdraws() {
        CashMachine.addOperation(300);
        CashMachine.addOperation(1000);

        int expected = 2;
        int result = CashMachine.getOperations().length;
        assertEquals(expected, result);
    }
}
