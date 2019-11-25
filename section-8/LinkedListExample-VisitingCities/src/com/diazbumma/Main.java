package com.diazbumma;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        LinkedList<String> cities = new LinkedList<>();
        /*cities.add("Jakarta");
        cities.add("Jogjakarta");
        cities.add("Surabaya");
        cities.add("Bandung");
        cities.add("Semarang");
        cities.add("Serang");*/
        addInOrder(cities, "Jakarta");
        addInOrder(cities, "Jogjakarta");
        addInOrder(cities, "Surabaya");
        addInOrder(cities, "Bandung");
        addInOrder(cities, "Semarang");
        addInOrder(cities, "Serang");
        printList(cities);
        visit(cities);
    }

    public static void printList(LinkedList<String> cities) {
        Iterator<String> i = cities.iterator();
        while (i.hasNext()) {
            System.out.println("City " + i.next());
        }
    }

    public static void addInOrder(LinkedList<String> cities, String data) {
        ListIterator<String> iterator = cities.listIterator();
        while (iterator.hasNext()) {
            int comparator = iterator.next().compareTo(data);
            if (comparator > 0){
                iterator.previous();
                iterator.add(data);
                return;
            }
        }
        iterator.add(data);
    }

    public static void visit(LinkedList<String> cities) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;
        ListIterator<String> iterator = cities.listIterator();
        if (!cities.isEmpty()) {
            System.out.println("Now visiting " + iterator.next());
            printMenu();
        } else {
            System.out.println("No cities");
            return;
        }
        while (!quit) {
            switch (scanner.nextInt()) {
                case 1:
                    quit = true;
                    break;
                case 2:
                    if (!forward) {
                        iterator.next();
                        forward = true;
                    }
                    if (iterator.hasNext())
                        System.out.println("Now visiting " + iterator.next());
                    else
                        System.out.println("Reaching the end of the list.");
                    break;
                case 3:
                    if (forward) {
                        iterator.previous();
                        forward = false;
                    }
                    if (iterator.hasPrevious())
                        System.out.println("Now visiting " + iterator.previous());
                    else
                        System.out.println("Reaching the very first of the list.");
                    break;
                default:
                    System.out.println("Menu unrecognized.");
            }
        }
    }

    public static void printMenu() {
        System.out.println("Menu: \n" +
                "1. Quit\n" +
                "2. Next city\n" +
                "3. Previous city\n" +
                "Enter menu: ");
    }
}
