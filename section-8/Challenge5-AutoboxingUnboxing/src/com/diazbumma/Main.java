package com.diazbumma;

import java.util.Scanner;

public class Main {

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
