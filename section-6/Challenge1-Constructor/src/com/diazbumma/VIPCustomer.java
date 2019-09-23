package com.diazbumma;

public class VIPCustomer {
    private String name;
    private int creditLimit;
    private String emailAddress;

    public VIPCustomer() {
        this("vip customer", 1_500_000, "vip@bank.com");
    }

    public VIPCustomer(String name, String emailAddress) {
        this(name, 1_500_000, emailAddress);
    }

    public VIPCustomer(String name, int creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
        System.out.println("VIP Account created, name: " + this.name +
                " limit: " + this.creditLimit +
                " email: " + this.emailAddress);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCreditLimit(int creditLimit) {
        this.creditLimit = creditLimit;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
