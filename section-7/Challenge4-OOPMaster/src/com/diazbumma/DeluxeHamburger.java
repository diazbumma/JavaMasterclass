package com.diazbumma;

public class DeluxeHamburger extends Hamburger{

    private int cheese;
    private int fries;

    public DeluxeHamburger(String breadRoll, String meat, int price) {
        super(breadRoll, meat, price);
        this.cheese = 1;
        this.fries = 1;
        super.inMenu = HAMBURGER_DELUXE;
    }

    public void addCheese(int cheese) {
        this.cheese += cheese;
        super.price += (5000*cheese);
    }

    public void addFries(int fries) {
        this.fries += fries;
        super.price += (10_000*fries);
    }

    @Override
    public void printDetail() {
        super.printDetail();
        System.out.println("cheese: " + cheese + "x");
        System.out.println("fries: " + fries + "x");
    }
}
