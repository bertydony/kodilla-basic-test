package com.kodilla.bank.homework;

public class CashMachine {
    private int[] operations;
    private int size;

    public CashMachine() {
        this.size = 0;
        this.operations = new int[0];
    }

    public void addOperation(int value) {
        this.size++;
        int[] newTab = new int[this.size];
        System.arraycopy(operations, 0, newTab, 0, operations.length);
        newTab[this.size - 1] = value;
        this.operations = newTab;
    }

    public int[] getOperations() {
        return operations;
    }

    public void addPayment() {


    }

    public void withdrawMoney() {

    }

    public void countCash() {

    }

    public int numbersOfOperations() {
        int payments = 0;
        if (this.operations.length == 0) {
            return 0;
        } else {
            for (int i = 0; i < this.operations.length; i++) {
                if (this.operations[i] > 0) {
                    payments += 1;
                }
            }
        }
        System.out.println(payments);
        return payments;
    }

    public double getAverageOfOperations() {
        if (this.operations.length == 0) {
            return 0;
        } else {
            double sum = 0;
            int operation = 0;
            for (int i = 0; operations.length < 0; i++) {
                if (this.operations[i] > 0) {
                    sum = sum + this.operations[i];
                    operation++;
                }
            }
            System.out.println(sum/operation);
            return sum/operation;
        }
    }
}
