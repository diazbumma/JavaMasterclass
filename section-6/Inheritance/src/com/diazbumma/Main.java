package com.diazbumma;

public class Main {

    public static void main(String[] args) {

        FlyingAnimal eagleBird = new FlyingAnimal("Eagle", "Haliaeetus leucocephalus", 2, "Feather");
        eagleBird.breed();
        System.out.println(eagleBird.getSpecies());
        eagleBird.fly(5);

        //Reference vs Object
        FlyingAnimal birdReference = eagleBird;
        System.out.println("Eagle bird species: " + eagleBird.getSpecies());
        System.out.println("Reference bird species: " + birdReference.getSpecies());

        birdReference.setSpecies("Haliaeetus vocifer");
        System.out.println("Eagle bird species: " + eagleBird.getSpecies());
    }
}
