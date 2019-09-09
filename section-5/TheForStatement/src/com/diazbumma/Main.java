package com.diazbumma;

public class Main {

    public static void main(String[] args) {

        // using the for statement, call the calculateInterest method with
        // the amount of 10000 with an interestRate of 2,3,4,5,6,7, and 8
        // and print the results to the console window.

        double balance = 10000d;
        for(int i=2; i<=8;i++) {
            System.out.println("the amount "+ balance + " at " + i + "% interest is " + String.format("%.2f",calculateInterest(balance, (double) i)));
        }

        for(int i=8; i>=2; i--) {
            System.out.println("the amount "+ balance + " at " + i + "% interest is " + String.format("%.2f",calculateInterest(balance, (double) i)));
        }
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate/100.0));
    }
}
