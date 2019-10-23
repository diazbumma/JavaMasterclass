package com.diazbumma;

public class Car {

    private String brands;
    private String model;
    private String engineConfiguration;
    private int cylinders;
    private int speed;

    public Car(String brands, String model, String engineConfiguration, int cylinders) {
        this.brands = brands;
        this.model = model;
        this.engineConfiguration = engineConfiguration;
        this.cylinders = cylinders;
        speed = 0;
    }

    public String getBrands() {
        return brands;
    }

    public String getModel() {
        return model;
    }

    public String getEngineConfiguration() {
        return engineConfiguration;
    }

    public int getCylinders() {
        return cylinders;
    }

    public void accelerate(int speed) {
        this.speed += speed;
    }

    public void brake(int speed) {
        if (this.speed < speed)
            this.speed = 0;
        else
            this.speed -= speed;
    }
}
