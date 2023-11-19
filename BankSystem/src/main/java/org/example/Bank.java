package org.example;

import java.util.List;
import java.util.ArrayList;

public class Bank {
    private String name;
    private List<BankAccount> accounts;

    public Bank(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    public void addAccount(BankAccount account) {
        accounts.add(account);
    }

    public BankAccount findAccount(String accountId) {
        for (BankAccount account : accounts) {
            if (account.getAccountId().equals(accountId)) {
                return account;
            }
        }
        return null;
    }

    public void displayAccounts() {
        for (BankAccount account : accounts) {
            account.displayAccountDetails();
        }
    }
}
