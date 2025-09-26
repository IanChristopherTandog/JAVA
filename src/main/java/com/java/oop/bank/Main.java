package com.java.oop.bank;

public class Main {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount(100, "Ian");

        savings.checkBalance();
        savings.withdraw(2);
        savings.deposit(300);

        System.out.println(savings);
    }
}
