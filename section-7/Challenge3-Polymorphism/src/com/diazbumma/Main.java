package com.diazbumma;

public class Main {

    // We are going to go back to the car analogy.
    // Create a base class called Car
    // It should have a few fields that would be appropriate for a generice car calss.
    // engine, cylinders, wheels, etc.
    // Constructor should initialize cylinders (number of) and name, and set wheels to 4
    // and engine to true. Cylinders and names would be passed parameters.
    //
    // Create appropriate getters
    //
    // Create some methods like startEngine, accelerate, and brake
    //
    // show a message for each in the base class
    // Now create 3 sub classes for your favorite vehicles.
    // Override the appropriate methods to demonstrate polymorphism in use.
    // put all classes in the one java file (this one).

    public static void main(String[] args) {
        for (int i=0; i<10; i++) {
            Car currentCar = useCar((int) (Math.random()*3)+1);
            System.out.println(i+1 + ". " + currentCar.getBrands() + " " + currentCar.getModel() + " " +
                    currentCar.getEngineConfiguration() + currentCar.getCylinders());
        }
    }

    public static Car useCar(int carId) {
        switch (carId) {
            case 1:
                return new Lamborghini("Aventador", "V", 12);
            case 2:
                return new Koenigsegg("Agera", "V", 8);
            case 3:
                return new Tesla("Roadster");
            default:
                return null;
        }
    }
}
