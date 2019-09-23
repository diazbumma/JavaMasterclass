package com.diazbumma;

public class Main {

    public static void main(String[] args) {
    	BankAccount diazAccount = new BankAccount();
//	    BankAccount diazAccount = new BankAccount(1, 50_000,
//                "Odiaz Bumma", "odiazbumma@gmail.com", "085327697575");
		System.out.println(diazAccount.getEmail());
	    diazAccount.withdraw(70_000);
	    diazAccount.deposit(100_000);
	    diazAccount.withdraw(70_000);

	    VIPCustomer diazVIP = new VIPCustomer("Diaz", "odiazbumma@gmail.com");
		System.out.println(diazVIP.getEmailAddress());
    }
}
