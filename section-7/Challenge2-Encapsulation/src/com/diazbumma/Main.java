package com.diazbumma;

public class Main {

    // Create a class and demonstrate proper encapsulation techniques
    // the class will be called Printer
    // It will simulate a real Computer Printer
    // It should have fields for the toner Level, number of pages printed, and
    // also whether its a duplex printer (capable of printing on both sides of the paper).
    // Add methods to fill up the toner (up to a maximum of 100%), another method to
    // simulate printing a page (which should increase the number of pages printed).
    // Decide on the scope, whether to use constructors, and anything else you think is needed.

    public static void main(String[] args) {
        Printer myPrinter = new Printer(false);
        myPrinter.doPrint(4000);
        System.out.println("Current toner level: " + myPrinter.getTonerLevel());
        System.out.println("Current pages printed: " + myPrinter.getPagesPrinted());
        myPrinter.refill(60);
        myPrinter.refill(60);
        System.out.println(myPrinter.getTonerLevel());
        myPrinter.doPrint(1500);
        System.out.println(myPrinter.getTonerLevel());
        System.out.println(myPrinter.getPagesPrinted());
        myPrinter.doPrint(2000);
        myPrinter.doPrint(200);
        System.out.println("Printer has printed for " + myPrinter.getPagesPrinted() + " pages in total");
    }
}
