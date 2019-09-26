package com.diazbumma;

public class ManualCar extends Car{

    private int gearPosition;

    public ManualCar(String energySource, String brand, int seats, String model, String color) {
        super(energySource, brand, seats, model, color, "Manual");
        gearPosition = 0;
    }

    public void shiftGear(int gearPosition) {
        this.gearPosition = gearPosition;
    }

    public int getGearPosition() {
        return gearPosition;
    }
}
