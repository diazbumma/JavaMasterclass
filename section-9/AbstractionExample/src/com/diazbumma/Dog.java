package com.diazbumma;

public class Dog extends Animal {

    public Dog(String species) {
        super(species);
    }

    @Override
    public void walk() {
        System.out.println("Dog: I'm walking..");
    }

    @Override
    public void sounds(String sound) {
        System.out.println("Dog make sounds: " + sound);
    }
}
