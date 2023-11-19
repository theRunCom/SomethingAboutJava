package org.example;

public class BankAccount {
    private String accountId;
    private double balance;
    private String accountHolder;

    public BankAccount(String accountId, String accountHolder, double initialBalance) {
        this.accountId = accountId;
        this.balance = initialBalance;
        this.accountHolder = accountHolder;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
        }
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountId() {
        return accountId;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void displayAccountDetails() {
        System.out.println("Account ID: " + accountId);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }
}
