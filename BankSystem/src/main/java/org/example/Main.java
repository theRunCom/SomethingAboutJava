package org.example;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("123456", "John Doe", 1000.0);
        account.deposit(500.0);
        account.withdraw(200.0);
        account.displayAccountDetails();
    }
}