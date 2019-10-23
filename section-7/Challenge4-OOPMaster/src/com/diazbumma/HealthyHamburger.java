package com.diazbumma;

public class HealthyHamburger extends Hamburger{

    public HealthyHamburger(int price) {
        super("brown rye", MEAT_SALMON, price);
        super.inMenu = HAMBURGER_HEALTHY;
    }

    @Override
    public void addPatties(int patties) {
        System.out.println("Cannot add extra addition for healthy burger.");
    }

    @Override
    public void addLettuce(int lettuce) {
        System.out.println("Cannot add extra addition for healthy burger.");
    }

    @Override
    public void addTomato(int tomato) {
        System.out.println("Cannot add extra addition for healthy burger.");
    }

    @Override
    public void addOnion(int onion) {
        System.out.println("Cannot add extra addition for healthy burger.");
    }
}
