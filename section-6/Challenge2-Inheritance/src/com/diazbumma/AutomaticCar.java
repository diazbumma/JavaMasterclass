package com.diazbumma;

public class AutomaticCar extends Car {

    private int gearPosition;

    public AutomaticCar(String energySource, String brand, int seats, String model, String color) {
        super(energySource, brand, seats, model, color, "Automatic");
        gearPosition = 0;
    }

    @Override
    public void accelerate(int acceleration) {
        super.accelerate(acceleration);
        if (super.getSpeed() < 10)
            gearPosition = 1;
        else if (super.getSpeed() < 30)
            gearPosition = 2;
        else if (super.getSpeed() < 60)
            gearPosition = 3;
        else if (super.getSpeed() < 80)
            gearPosition = 4;
        else if (super.getSpeed() < 100)
            gearPosition = 5;
        else
            gearPosition = 6;
    }

    @Override
    public void decelerate(int deceleration) {
        super.decelerate(deceleration);
        if (super.getSpeed() < 5)
            gearPosition = 1;
        else if (super.getSpeed() < 20)
            gearPosition = 2;
        else if (super.getSpeed() < 40)
            gearPosition = 3;
        else if (super.getSpeed() < 60)
            gearPosition = 4;
        else if (super.getSpeed() < 80)
            gearPosition = 5;
        else
            gearPosition = 6;

    }

    public int getGearPosition() {
        return gearPosition;
    }
}
