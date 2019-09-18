package com.diazbumma;

public class Car {

    private int door;
    private int wheel;
    private String model;
    private String engine;
    private String colour;

    public void setDoor(int door) {
        this.door = door;
    }

    public void setWheel(int wheel) {
        this.wheel = wheel;
    }

    public void setModel(String model) {
        String validModel = model.toLowerCase();
        if (validModel.equals("panamera")) {
            this.model = model;
        } else {
            this.model = "Unknown";
        }
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getDoor() {
        return door;
    }

    public int getWheel() {
        return wheel;
    }

    public String getModel() {
        return model;
    }

    public String getEngine() {
        return engine;
    }

    public String getColour() {
        return colour;
    }
}
