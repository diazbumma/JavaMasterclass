package com.diazbumma;

public class Main {

    public static void main(String[] args) {
        MakeSound animalMakeSound;
        Bird thatBird = new Bird("Nyctea scandiaca");
        Dog thatDog = new Dog("Lupus familiaris");

        animalMakeSound = thatBird;
        animalMakeSound.sounds("Hoot.. hoot..");
        animalMakeSound = thatDog;
        animalMakeSound.sounds("Woof.. woof..");

        thatBird.walk();
        thatDog.walk();
    }
}
