package com.kodilla.bank.homework;

import java.util.Scanner;

public class BankApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bank bank = new Bank();
        bank.addMoneyToFirstCashMachine(100);
        System.out.println(bank.getFirstCashMachineBalance());

    }
}
