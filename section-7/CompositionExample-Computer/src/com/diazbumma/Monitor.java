package com.diazbumma;

public class Monitor {

    private String brand;
    private String model;
    private Resolution resolution;
    private Dimension dimension;

    public Monitor(String brand, String model, Resolution resolution, Dimension dimension) {
        this.brand = brand;
        this.model = model;
        this.resolution = resolution;
        this.dimension = dimension;
    }

    public static void displayText(String text) {
        System.out.println("Monitor is displaying text: " + text);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public Resolution getResolution() {
        return resolution;
    }

    public Dimension getDimension() {
        return dimension;
    }
}
