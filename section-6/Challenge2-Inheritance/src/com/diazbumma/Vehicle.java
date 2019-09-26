package com.diazbumma;

public class Vehicle {

    private String type;
    private String energySource;
    private String brand;
    private String model;
    protected int speed;

    public Vehicle(String type, String energySource, String brand, String model) {
        this.type = type;
        this.energySource = energySource;
        this.brand = brand;
        this.model = model;
        this.speed = 0;
    }

    public void accelerate(int acceleration) {
        speed += acceleration;
    }

    public void decelerate(int deceleration) {
        if (deceleration < speed) {
            speed -= deceleration;
        } else {
            speed = 0;
        }
    }

    public int getSpeed() {
        return speed;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getEnergySource() {
        return energySource;
    }

    public void setEnergySource(String energySource) {
        this.energySource = energySource;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
