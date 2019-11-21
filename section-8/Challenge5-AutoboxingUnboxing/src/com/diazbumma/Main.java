package com.diazbumma;

import java.util.Scanner;

public class Main {

    // You job is to create a simple banking application.
    // There should be a Bank class
    // It should have an arraylist of Branches
    // Each Branch should have an arraylist of Customers
    // The Customer class should have an arraylist of Doubles (transactions)
    // Customer:
    // Name, and the ArrayList of doubles.
    // Branch:
    // Need to be able to add a new customer and initial transaction amount.
    // Also needs to add additional transactions for that customer/branch
    // Bank:
    // Add a new branch
    // Add a customer to that branch with initial transaction
    // Add a transaction for an existing customer for that branch
    // Show a list of customers for a particular branch and optionally a list
    // of their transactions
    // Demonstration autoboxing and unboxing in your code
    // Hint: Transactions
    // Add data validation.
    // e.g. check if exists, or does not exist, etc.
    // Think about where you are adding the code to perform certain actions

    private static Scanner scanner = new Scanner(System.in);
    private static Bank myBank = new Bank();

    public static void main(String[] args) {
        while (true) {
            System.out.println("Bank menu:\n" +
                    "1. Add branch\n" +
                    "2. Add customer\n" +
                    "3. Add transaction\n" +
                    "4. Show Transaction\n" +
                    "5. Exit\n" +
                    "Enter menu:");
            switch (scanner.nextInt()) {
                case 1:
                    addBranch();
                    break;
                case 2:
                    addCustomer();
                    break;
                case 3:
                    addTransaction();
                    break;
                case 4:
                    showTransaction();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Menu unrecognized");
            }
        }
    }

    public static void addBranch() {
        System.out.println("Enter branch name: ");
        String branchName = scanner.next();
        myBank.addBranch(Branch.createBranch(branchName));
    }

    public static void addCustomer() {
        if (myBank.hasBranch()) {
            myBank.showBranchList();
            System.out.println("Select branch: ");
            int branchSelect = scanner.nextInt();
            System.out.println("Enter name: ");
            String customerName = scanner.next();
            System.out.println("First time deposit: ");
            double firstDeposit = scanner.nextDouble();
            myBank.addCustomer(branchSelect, Customer.createCustomer(customerName, Double.valueOf(firstDeposit)));
        } else {
            System.out.println("No branch, create branch first");
        }
    }

    public static void addTransaction() {
        if (myBank.hasBranch()) {
            myBank.showBranchList();
            System.out.println("Select branch: ");
            int branchSelect = scanner.nextInt();
            myBank.getBranch(branchSelect).showCustomer();
            if (myBank.getBranch(branchSelect).hasCustomer()) {
                System.out.println("Select Customer: ");
                int customerSelect = scanner.nextInt();
                System.out.println("Enter transaction: ");
                double trx = scanner.nextDouble();
                myBank.addTransaction(branchSelect, customerSelect, Double.valueOf(trx));
            }
        } else {
            System.out.println("No branch, create branch first");
        }
    }

    public static void showTransaction() {
        if (myBank.hasBranch()) {
            myBank.showBranchList();
            System.out.println("Select branch: ");
            int branchSelect = scanner.nextInt();
            myBank.getBranch(branchSelect).showCustomer();
            if (myBank.getBranch(branchSelect).hasCustomer()) {
                System.out.println("Select Customer: ");
                int customerSelect = scanner.nextInt();
                myBank.getBranch(branchSelect).getCustomer(customerSelect).showTransactions();
            }
        } else {
            System.out.println("No branch, create branch first");
        }
    }
}
