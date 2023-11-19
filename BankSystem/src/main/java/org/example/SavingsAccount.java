package org.example;

public class SavingsAccount extends BankAccount {
    private double annualInterestRate;

    public SavingsAccount(String accountId, String accountHolder, double initialBalance, double annualInterestRate) {
        super(accountId, accountHolder, initialBalance);
        this.annualInterestRate = annualInterestRate;
    }

    public void addInterest() {
        double interest = getBalance() * annualInterestRate / 100;
        deposit(interest);
    }
}
