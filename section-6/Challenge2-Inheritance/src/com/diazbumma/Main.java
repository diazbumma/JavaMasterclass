package com.diazbumma;

public class Main {

    public static void main(String[] args) {
        ElectricCar myFirstCar = new ElectricCar("Tesla", 4, "Model X", Car.COLOR_GREY);
        System.out.println("My first car: " + myFirstCar.getBrand() + " " + myFirstCar.getModel());
        System.out.println("My first car transmission: " + myFirstCar.getTransmissionType());
        System.out.println("My first car speed right now: " + myFirstCar.getSpeed());
        myFirstCar.accelerate(6);
        myFirstCar.accelerate(7);
        System.out.println("My first car speed right now: " + myFirstCar.getSpeed());
        System.out.println(myFirstCar.toString());

        AutomaticCar mySecondCar = new AutomaticCar(Car.FUEL_GASOLINE,"Lamborghini", 2,
                "Aventador", Car.COLOR_RED);
        System.out.println("My second car: " + mySecondCar.getBrand() + " " + mySecondCar.getModel());
        System.out.println("My second car transmission: " + mySecondCar.getTransmissionType());
        System.out.println("My second car speed right now: " + mySecondCar.getSpeed());
        mySecondCar.accelerate(30);
        mySecondCar.accelerate(80);
        System.out.println("My second car speed right now: " + mySecondCar.getSpeed());
        System.out.println("My second car gear position right now: " + mySecondCar.getGearPosition());
        mySecondCar.decelerate(70);
        System.out.println("My second car gear position right now: " + mySecondCar.getGearPosition());
        System.out.println(mySecondCar.toString());

        ManualCar myThirdCar = new ManualCar(Car.FUEL_GASOLINE, "Corvette", 2, "Z06", Car.COLOR_BLUE);
        System.out.println("My third car: " + myThirdCar.getBrand() + " " + myThirdCar.getModel());
        System.out.println("My third car transmission: " + myThirdCar.getTransmissionType());
        System.out.println("My third car energy source: " + myThirdCar.getEnergySource());
        System.out.println("My third car speed right now: " + myThirdCar.getSpeed());
        System.out.println(myThirdCar.toString());

        Airplane myAirplane = new Airplane("Gulfstream", "G650ER", Airplane.PLANE_PRIVATE_JET);
        System.out.println(myAirplane.toString());
    }
}
