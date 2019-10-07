package com.diazbumma;

public class Cuboid extends Rectangle {

    private double height;

    public Cuboid(double width, double length, double height) {
        super(width, length);
        if (height < 0d)
            this.height = 0d;
        else
            this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        double base = getArea();
        return base*height;
    }
}
