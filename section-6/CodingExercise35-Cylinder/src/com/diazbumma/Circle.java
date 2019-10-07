package com.diazbumma;

public class Circle {

    private double radius;

    public Circle(double radius) {
        if (radius < 0d)
            this.radius = 0d;
        else
            this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return radius*radius*Math.PI;
    }
}
