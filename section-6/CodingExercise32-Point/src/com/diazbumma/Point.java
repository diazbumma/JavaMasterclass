package com.diazbumma;

public class Point {

    private int x;
    private int y;

    public Point() {
        this(0, 0);
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public double distance() {
        return Math.sqrt((0d-x)*(0d-x) + (0d-y)*(0d-y));
    }

    public double distance(int xB, int yB) {
        return Math.sqrt((xB-x)*(xB-x) + (yB-y)*(yB-y));
    }

    public double distance(Point anotherPoint) {
        return Math.sqrt((anotherPoint.getX()-x)*(anotherPoint.getX()-x) + (anotherPoint.getY()-y)*(anotherPoint.getY()-y));
    }
}
