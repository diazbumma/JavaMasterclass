package com.diazbumma;

import java.util.ArrayList;

public class Bank {

    private ArrayList<Branch> branches = new ArrayList<>();

    public boolean hasBranch() {
        return !branches.isEmpty();
    }

    public void showBranchList() {
        if (!branches.isEmpty()) {
            for (int i = 0; i < branches.size(); i++) {
                System.out.println(i + ". " + branches.get(i).getBranchName());
            }
        } else {
            System.out.println("No branch");
        }
    }

    public Branch getBranch(int iBranch) {
        return branches.get(iBranch);
    }

    public void addBranch(Branch branch) {
        branches.add(branch);
    }

    public void addCustomer(int iBranch, Customer customer) {
        branches.get(iBranch).addCustomer(customer);
    }

    public void addTransaction(int iBranch, int iCustomer, Double trx) {
        branches.get(iBranch).getCustomer(iCustomer).addTrx(trx);
    }
}
