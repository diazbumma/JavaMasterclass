package com.diazbumma;

public class BankAccount {
    private int number;
    private int balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount() {
        this(100, 50_000, "Default Name", "default@email.com", "08123456789");
        System.out.println("Default account created");
    }

    public BankAccount(int number, int balance, String customerName, String email, String phoneNumber) {
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public int getNumber() {
        return number;
    }

    public int getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void deposit(int money) {
        this.balance += money;
        System.out.println("Successful deposited, available balance: " + this.balance);
    }

    public void withdraw(int money) {
        if (this.balance < money) {
            System.out.println("Insufficient funds, transaction not processed. Available balance: " + this.balance);
        } else {
            this.balance -= money;
            System.out.println("Successful withdrawal, available balance: " + this.balance);
        }
    }
}
