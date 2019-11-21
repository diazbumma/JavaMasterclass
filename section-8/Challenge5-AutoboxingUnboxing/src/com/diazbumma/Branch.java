package com.diazbumma;

import java.util.ArrayList;

public class Branch {

    private String branchName;
    private ArrayList<Customer> customers = new ArrayList<>();

    public Branch(String branchName) {
        this.branchName = branchName;
    }

    public static Branch createBranch(String branchName) {
        return new Branch(branchName);
    }

    public String getBranchName() {
        return branchName;
    }

    public boolean hasCustomer() {
        return !customers.isEmpty();
    }

    public void showCustomer() {
        if (!customers.isEmpty()) {
            for (int i = 0; i < customers.size(); i++) {
                System.out.println(i + ". " + customers.get(i).getName());
            }
        } else {
            System.out.println("No customer");
        }
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public Customer getCustomer(int iCustomer) {
        return customers.get(iCustomer);
    }
}
