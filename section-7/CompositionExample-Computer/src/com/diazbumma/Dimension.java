package com.diazbumma;

public class Dimension {

    private double height;
    private double width;
    private double depth;

    public Dimension(double width, double height) {
        this(height, width, 0d);
    }

    public Dimension(double height, double width, double depth) {
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public double getDepth() {
        return depth;
    }
}
