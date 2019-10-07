package com.diazbumma;

public class Motherboard {

    private String brand;
    private String model;
    private String chipset;

    public Motherboard(String brand, String model, String chipset) {
        this.brand = brand;
        this.model = model;
        this.chipset = chipset;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getChipset() {
        return chipset;
    }
}
