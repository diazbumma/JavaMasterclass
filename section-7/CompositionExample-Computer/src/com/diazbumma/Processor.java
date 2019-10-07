package com.diazbumma;

public class Processor {

    private String brand;
    private String model;
    private double freq;
    private int core;

    public Processor(String brand, String model, double freq, int core) {
        this.brand = brand;
        this.model = model;
        this.freq = freq;
        this.core = core;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getFreq() {
        return freq;
    }

    public int getCore() {
        return core;
    }
}
