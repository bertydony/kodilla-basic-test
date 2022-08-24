package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashMachineTestSuite {
    private CashMachine CashMachine = new CashMachine();
    @Test
    public void shouldHaveZeroLength() {

        int[] values = CashMachine.getValues();
        assertEquals(0, values.length);
    }

    @Test
    public void shouldAddTwoElementsToArray() {

        CashMachine.add(200);
        CashMachine.add(500);

        int[] values = CashMachine.getValues();
        assertEquals(2, values.length);
        assertEquals(200, values[0]);
        assertEquals(500, values[1]);
    }
}
