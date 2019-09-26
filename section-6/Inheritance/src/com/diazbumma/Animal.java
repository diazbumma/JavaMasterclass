package com.diazbumma;

public class Animal {

    private String name;
    private String species;
    private int eyes;
    private int legs;

    public Animal(String name, String species, int eyes, int legs) {
        this.name = name;
        this.species = species;
        this.eyes = eyes;
        this.legs = legs;
    }

    public void breed() {
        System.out.println("Animal is breeding");
    }

    public void move(int speed) {
        System.out.println("Animal is moving at " + speed + " km/s");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public int getEyes() {
        return eyes;
    }

    public void setEyes(int eyes) {
        this.eyes = eyes;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }
}
