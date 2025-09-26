package com.java.oop.bank;

public class SavingsAccount {
    private int balance;
    private String name;

    public SavingsAccount(int initial, String userName){
        balance = initial;
        name = userName;
    }

    public void deposit(int amount){
        balance = balance + amount;
        System.out.println(amount + " is added to your account!");
    }

    public int withdraw(int amount){
        if (balance >= amount){
            balance -= amount;
            System.out.println(amount + " was deducted from your account");
            return amount;
        }
        else {
            System.out.println("Insufficient funds");
            // We return 0 because the modifier of this method is int and not void
            return 0;
        }
    }
    public void checkBalance(){
        System.out.println("Your current balance is: "+ balance);
    }

    @Override
    public String toString(){
        return "This is the savings account of " + name + " with balance of: " + balance;
    }
}
