package com.diazbumma;

public class FlyingAnimal extends Animal{

    private int wings;
    private String coat;

    public FlyingAnimal(String name, String species, int wings, String coat ) {
        super(name, species, 2, 2);
        this.wings = wings;
        this.coat = coat;
    }

    @Override
    public void breed() {
        super.breed();
        System.out.println("Flying Animal is breeding");
    }

    public void fly(int speed) {
        super.move(speed);
        System.out.println("Move type: flying");
    }

    public void setWings(int wings) {
        this.wings = wings;
    }

    public void setCoat(String coat) {
        this.coat = coat;
    }

    public int getWings() {
        return wings;
    }

    public String getCoat() {
        return coat;
    }
}
