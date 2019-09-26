package com.diazbumma;

public class ElectricCar extends Car{

    public ElectricCar(String brand, int seats, String model, String color) {
        super(FUEL_BATTERY, brand, seats, model, color, "No Transmission");
    }
}
