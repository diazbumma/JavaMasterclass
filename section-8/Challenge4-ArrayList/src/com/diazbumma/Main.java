package com.diazbumma;

import java.util.Scanner;

public class Main {

    // Create a program that implements a simple mobile phone with the following capabilities.
    // Able to store, modify, remove and query contact names.
    // You will want to create a separate class for Contacts (name and phone number).
    // Create a master class (MobilePhone) that holds the ArrayList of Contacts
    // The MobilePhone class has the functionality listed above.
    // Add a menu of options that are available.
    // Options:  Quit, print list of contacts, add new contact, update existing contact, remove contact
    // and search/find contact.
    // When adding or updating be sure to check if the contact already exists (use name)
    // Be sure not to expose the inner workings of the ArrayList to MobilePhone
    // e.g. no ints, no .get(i) etc
    // MobilePhone should do everything with Contact objects only.

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        MobilePhone mobilePhone = new MobilePhone();
        while (true) {
            System.out.println("Choose menu\n" +
                    "1. Show contact list\n" +
                    "2. Add new contact\n" +
                    "3. Show contact\n" +
                    "4. Update existing contact name\n" +
                    "5. Update existing contact number\n" +
                    "6. Delete contact\n" +
                    "7. Exit.\n" +
                    "Enter menu:");
            int select = scanner.nextInt();
            scanner.nextLine();
            switch (select) {
                case 1:
                    mobilePhone.showContactList();
                    break;
                case 2:
                    System.out.println("Enter name:");
                    String name = scanner.nextLine();
                    System.out.println("Enter number:");
                    String number = scanner.nextLine();
                    Contact newContact = Contact.createContact(name, Long.parseLong(number));
                    mobilePhone.newContact(newContact);
                    break;
                case 3:
                    mobilePhone.showContactList();
                    System.out.println("Enter contact name to show info:");
                    String contactToShow = scanner.nextLine();
                    mobilePhone.showContact(contactToShow);
                    break;
                case 4:
                    mobilePhone.showContactList();
                    System.out.println("Enter contact name to edit:");
                    String contactName = scanner.nextLine();
                    System.out.println("Enter new name:");
                    String newName = scanner.nextLine();
                    mobilePhone.modifyContact(contactName, newName);
                    break;
                case 5:
                    mobilePhone.showContactList();
                    System.out.println("Enter contact name to edit:");
                    String contactName2 = scanner.nextLine();
                    System.out.println("Enter new number:");
                    String newNumber = scanner.nextLine();
                    mobilePhone.modifyContact(contactName2, Long.parseLong(newNumber));
                    break;
                case 6:
                    mobilePhone.showContactList();
                    System.out.println("Enter contact name to delete:");
                    String contactName3 = scanner.nextLine();
                    mobilePhone.removeContact(contactName3);
                    break;
                case 7:
                    return;
                default:
                    System.out.println("Menu unrecognized.");
            }
        }
    }
}
