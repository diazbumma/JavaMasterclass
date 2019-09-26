package com.diazbumma;

public class Car extends Vehicle{

    public static final String COLOR_BLUE = "Blue";
    public static final String COLOR_RED = "Red";
    public static final String COLOR_BLACK = "Black";
    public static final String COLOR_WHITE = "White";
    public static final String COLOR_GREY = "Grey";

    public static final String FUEL_DIESEL = "Diesel";
    public static final String FUEL_GASOLINE = "Gasoline";
    public static final String FUEL_BATTERY = "Battery";

    private int seats;
    private String color;
    private String transmissionType;

    public Car(String energySource, String brand, int seats, String model, String color, String transmissionType) {
        super("Car", energySource, brand, model);
        this.seats = seats;
        this.color = color;
        this.transmissionType = transmissionType;
    }

    public int getSeats() {
        return seats;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTransmissionType() {
        return transmissionType;
    }

    @Override
    public String toString() {
        return "Car info, brand: " + getBrand() + " " + getModel() + ", transmission: " + getTransmissionType() +
                ", fuel: " + getEnergySource();
    }
}
