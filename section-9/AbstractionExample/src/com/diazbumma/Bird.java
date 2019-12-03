package com.diazbumma;

public class Bird extends Animal {

    public Bird(String species) {
        super(species);
    }

    @Override
    public void walk() {
        System.out.println("Bird: I'm walking..");
    }

    @Override
    public void sounds(String sound) {
        System.out.println("Bird make sounds: " + sound);
    }
}
