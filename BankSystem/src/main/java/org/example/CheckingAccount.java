package org.example;

public class CheckingAccount extends BankAccount {
    private double overdraftLimit;

    public CheckingAccount(String accountId, String accountHolder, double initialBalance, double overdraftLimit) {
        super(accountId, accountHolder, initialBalance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && getBalance() + overdraftLimit >= amount) {
            super.withdraw(amount);
        }
    }
}
