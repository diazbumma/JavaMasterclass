package com.diazbumma;

public class Dimension {

    private double width;
    private double height;
    private double depth;

    public Dimension(double width, double height) {
        this(width, height, 0d);
    }

    public Dimension(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getDepth() {
        return depth;
    }
}
