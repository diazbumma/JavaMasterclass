package com.diazbumma;

public abstract class Animal implements MakeSound {

    private String species;

    public Animal(String species) {
        this.species = species;
    }

    public abstract void walk();

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }
}
