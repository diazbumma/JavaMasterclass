package com.diazbumma;

public class Airplane extends Vehicle {

    public static final String PLANE_AIR_FIGHTER = "Air fighter";
    public static final String PLANE_PRIVATE_JET = "Private jet";
    public static final String PLANE_COMMERCIAL_JET = "Commercial jet";

    private String category;

    public Airplane(String brand, String model, String category) {
        super("Airplane", "Aviation Gas", brand, model);
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return "Plane info, brand: " + getBrand() + " " + getModel() + ", category: " + getCategory() +
                ", fuel: " + getEnergySource();
    }
}
