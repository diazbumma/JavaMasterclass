package com.diazbumma;

import java.util.ArrayList;

public class MobilePhone {

    private ArrayList<Contact> contacts;

    public MobilePhone() {
        contacts = new ArrayList<>();
    }

    public void newContact(String name, long number) {
        contacts.add(new Contact(name, number));
    }

    public void showContactList() {
        if (contacts.isEmpty()) {
            System.out.println("You have no contact");
            return;
        }
        System.out.println("You have " + contacts.size() + " in your contact list.");
        for (int i=0; i<contacts.size(); i++)
            System.out.println(i + ". " + contacts.get(i).getName() + " " + contacts.get(i).getNumber());
    }

    public void showContact(String name) {
        int pos = findContact(name);
        if (pos!=-1) {
            Contact contact = contacts.get(pos);
            System.out.println(contact.getName() + " " + contact.getNumber());
        }
    }

    public void modifyContact(String name, String newName) {
        int pos = findContact(name);
        if (pos!=-1)
            contacts.get(pos).setName(newName);
    }

    public void modifyContact(String name, long newNumber) {
        int pos = findContact(name);
        if (pos!=-1)
            contacts.get(pos).setNumber(newNumber);
    }

    public void removeContact(String name) {
        int pos = findContact(name);
        if (pos!=-1)
            contacts.remove(pos);
    }

    private int findContact(String name) {
        for (int i=0; i<contacts.size(); i++) {
            if (contacts.get(i).getName().equals(name))
                return i;
        }
        return -1;
    }
}
