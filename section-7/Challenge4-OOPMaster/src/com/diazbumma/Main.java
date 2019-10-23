package com.diazbumma;

import java.util.Scanner;

public class Main {

    // The purpose of the application is to help a fictitious company called Bills Burgers to manage
    // their process of selling hamburgers.
    // Our application will help Bill to select types of burgers, some of the additional items (additions) to
    // be added to the burgers and pricing.
    // We want to create a base hamburger, but also two other types of hamburgers that are popular ones in Bills store.
    // The basic hamburger should have the following items.
    // Bread roll type, meat and up to 4 additional additions (things like lettuce, tomato, carrot, etc) that
    // the customer can select to be added to the burger.
    // Each one of these items gets charged an additional price so you need some way to track how many items got added
    // and to calculate the final price (base burger with all the additions).
    // This burger has a base price and the additions are all separately priced (up to 4 additions, see above).
    // Create a Hamburger class to deal with all the above.
    // The constructor should only include the roll type, meat and price, can also include name of burger or you
    // can use a setter.
    // Also create two extra varieties of Hamburgers (subclasses) to cater for
    // a) Healthy burger (on a brown rye bread roll), plus two addition items that can be added.
    // The healthy burger can have 6 items (Additions) in total.
    // hint:  you probably want to process the two additional items in this new class (subclass of Hamburger),
    // not the base class (Hamburger), since the two additions are only appropriate for this new class
    // (in other words new burger type).
    // b) Deluxe hamburger - comes with chips and drinks as additions, but no extra additions are allowed.
    // hint:  You have to find a way to automatically add these new additions at the time the deluxe burger
    // object is created, and then prevent other additions being made.
    //  All 3 classes should have a method that can be called anytime to show the base price of the hamburger
    // plus all additionals, each showing the addition name, and addition price, and a grand/final total for the
    // burger (base price + all additions)
    // For the two additional classes this may require you to be looking at the base class for pricing and then
    // adding totals to final price.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bills Burgers menu");
        System.out.println("1. Hamburger");
        System.out.println("2. Healthy Hamburger");
        System.out.println("3. Deluxe Hamburger");
        System.out.println("Choose your burgers: ");
        Hamburger hamburger = chooseHamburger(scanner);
        if (!hamburger.getInMenu().equals(Hamburger.HAMBURGER_HEALTHY)) {
            System.out.println("\nDo you want more patties? (0-3)");
            hamburger.addPatties(scanner.nextInt());
            System.out.println("\nDo you want more lettuce? (0-3)");
            hamburger.addLettuce(scanner.nextInt());
            System.out.println("\nDo you want more tomato? (0-3)");
            hamburger.addTomato(scanner.nextInt());
            System.out.println("\nDo you want more onion? (0-3)");
            hamburger.addOnion(scanner.nextInt());
        }
        if (hamburger.getInMenu().equals(Hamburger.HAMBURGER_DELUXE)) {
            System.out.println("\nDo you want more cheese? (0-3)");
            ((DeluxeHamburger) hamburger).addCheese(scanner.nextInt());
            System.out.println("\nDo you want more fries? (0-3)");
            ((DeluxeHamburger) hamburger).addFries(scanner.nextInt());
        }
        System.out.println("\n=Bills Burger=");
        hamburger.printDetail();
        System.out.println("tax: " + hamburger.getPrice()*10/100);
        System.out.println("Total: " + (hamburger.getPrice()+(hamburger.getPrice()*10/100)));
    }

    public static Hamburger chooseHamburger(Scanner scanner) {
        switch (scanner.nextInt()) {
            case 2:
                return new HealthyHamburger(22_000);
            case 3:
                return new DeluxeHamburger("sesame buns", chooseMeat(scanner), 25_000);
            default:
                return new Hamburger("sesame buns", chooseMeat(scanner), 20_000);
        }
    }

    public static String chooseMeat(Scanner scanner) {
        System.out.println("\n1. " + Hamburger.MEAT_BEEF);
        System.out.println("2. " + Hamburger.MEAT_HAM);
        System.out.println("3. " + Hamburger.MEAT_SALMON);
        System.out.println("Choose your meat: ");
        switch (scanner.nextInt()) {
            case 2:
                return Hamburger.MEAT_HAM;
            case 3:
                return Hamburger.MEAT_SALMON;
            default:
                return Hamburger.MEAT_BEEF;
        }
    }
}
