package com.diazbumma;

public class Cylinder extends Circle {

    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
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
