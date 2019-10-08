package com.diazbumma;

public class Case {

    private String brand;
    private String model;
    private Dimension dimension;

    public Case(String brand, String model, Dimension dimension) {
        this.brand = brand;
        this.model = model;
        this.dimension = dimension;
    }

    public void pressPowerButton(Monitor monitor) {
        monitor.displayText("Computer is powering up..");
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public Dimension getDimension() {
        return dimension;
    }
}
