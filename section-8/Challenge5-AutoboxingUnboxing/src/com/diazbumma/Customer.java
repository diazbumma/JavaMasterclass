package com.diazbumma;

import java.util.ArrayList;

public class Customer {

    private String name;
    private ArrayList<Double> transactions = new ArrayList<>();

    public Customer(String name, Double initTrx) {
        this.name = name;
        transactions.add(initTrx);
    }

    public static Customer createCustomer(String name, Double initTrx) {
        return new Customer(name, initTrx);
    }

    public String getName() {
        return name;
    }

    public void addTrx(Double trx) {
        transactions.add(trx);
    }

    public void showTransactions() {
        System.out.println("Customer Name: " + name);
        if (!transactions.isEmpty()) {
            for (int i = 0; i < transactions.size(); i++) {
                System.out.println(i + ". " + transactions.get(i).doubleValue());
            }
        } else {
            System.out.println("No transaction");
        }
    }
}
