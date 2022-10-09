package com.kodilla.bank.homework;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class BankTestSuite {

    Bank bank = new Bank();

    @Test
    public void getTotalBalanceMoneyTest(){
        bank.addMoneyToFirstCashMachine(100);
        bank.addMoneyToSecondCashMachine(300);
        bank.addMoneyToThirdCashMachine(350);
        double result = bank.getFirstCashMachineBalance() + bank.getSecondCashMachineBalance() + bank.getThirdCashMachineBalance();
        double expected = 750;
        assertEquals(expected, result);
    }

    @Test
    public void addMoneyToFirstCashMachine(){
        bank.addMoneyToFirstCashMachine(400);
        double result = bank.getFirstCashMachineBalance();
        double expected = 400;
        assertEquals(expected, result);
    }
    @Test
    public void addMoneyToSecondCashMachine() {
        bank.addMoneyToSecondCashMachine(400);
        double result = bank.getSecondCashMachineBalance();
        double expected = 400;
        assertEquals(expected, result);
    }

    @Test
    public void addMoneyToThirdCashMachine() {
        bank.addMoneyToThirdCashMachine(400);
        double result = bank.getThirdCashMachineBalance();
        double expected = 400;
        assertEquals(expected, result);
    }

    @Test
    public void getTotalWithdrawMoney(){
        bank.addMoneyToFirstCashMachine(1200);
        bank.addMoneyToSecondCashMachine(50);
        bank.addMoneyToThirdCashMachine(600);
        double result = bank.getTotalWithdrawMoney();
        double expected = 1850;
        assertEquals(expected, result);
    }
}
