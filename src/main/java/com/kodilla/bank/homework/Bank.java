package com.kodilla.bank.homework;

public class Bank {
    private CashMachine firstCashMachine;
    private CashMachine secondCashMachine;
    private CashMachine thirdCashMachine;

    public Bank(){
        this.firstCashMachine = new CashMachine();
        this.secondCashMachine = new CashMachine();
        this.thirdCashMachine = new CashMachine();
    }

    public void addMoneyToFirstCashMachine(int money){
        this.firstCashMachine.addOperation(money);
    }
    public void addMoneyToSecondCashMachine(int money){
        this.secondCashMachine.addOperation(money);
    }
    public void addMoneyToThirdCashMachine(int money){
        this.thirdCashMachine.addOperation(money);
    }

    public int getFirstCashMachineBalance(){
        return this.firstCashMachine.getCountOfCash();
    }
    public int getSecondCashMachineBalance(){
        return this.secondCashMachine.getCountOfCash();
    }
    public int getThirdCashMachineBalance(){
        return this.thirdCashMachine.getCountOfCash();
    }

    public int getTotalBalance(){
        return getFirstCashMachineBalance() + getSecondCashMachineBalance() + getThirdCashMachineBalance();
    }

    public double getTotalWithdrawMoney(){
        return this.firstCashMachine.getAverageOfWithdraw() + this.secondCashMachine.getAverageOfWithdraw()
                + this.thirdCashMachine.getAverageOfWithdraw();
    }
}
