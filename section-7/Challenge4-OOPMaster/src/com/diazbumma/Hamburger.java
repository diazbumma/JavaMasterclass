package com.diazbumma;

public class Hamburger {

    public static final String MEAT_BEEF = "beef";
    public static final String MEAT_HAM = "ham";
    public static final String MEAT_SALMON = "salmon";

    public static final String HAMBURGER_NORMAL = "normal";
    public static final String HAMBURGER_HEALTHY = "healthy";
    public static final String HAMBURGER_DELUXE = "deluxe";

    private String breadRoll;
    private String meat;
    private int patties;
    private int lettuce;
    private int tomato;
    private int onion;
    protected String inMenu;
    protected int price; //in rupiah

    public Hamburger(String breadRoll, String meat, int price) {
        this(breadRoll, meat, 1, 1, 1, 1, price);
    }

    private Hamburger(String breadRoll, String meat, int patties, int lettuce, int tomato, int onion, int price) {
        this.breadRoll = breadRoll;
        this.meat = meat;
        this.patties = patties;
        this.lettuce = lettuce;
        this.tomato = tomato;
        this.onion = onion;
        this.price = price;
        inMenu = HAMBURGER_NORMAL;
    }

    public String getInMenu() {
        return inMenu;
    }

    public void addPatties(int patties) {
        this.patties += patties;
        price += (10_000*patties);
    }

    public void addLettuce(int lettuce) {
        this.lettuce += lettuce;
        price += (2_000*lettuce);
    }

    public void addTomato(int tomato) {
        this.tomato += tomato;
        price += (1_000*tomato);
    }

    public void addOnion(int onion) {
        this.onion += onion;
        price += (1_500*onion);
    }

    public int getPrice() {
        return price;
    }

    public void printDetail() {
        System.out.println(inMenu + " hamburger with " + breadRoll + " and " + meat);
        System.out.println("patties: " + patties + "x");
        System.out.println("lettuce: " + lettuce + "x");
        System.out.println("tomato: " + tomato + "x");
        System.out.println("onion: " + onion + "x");
    }
}
