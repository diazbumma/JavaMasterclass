package com.diazbumma;

public class Window {

    private String material;
    private String color;
    private Dimension dimension;
    private boolean isOpened;

    public Window(String material, String color, Dimension dimension) {
        this.material = material;
        this.color = color;
        this.dimension = dimension;
        isOpened = false;
    }

    public void open() {
        if (isOpened) {
            System.out.println("Window is already opened.");
        } else {
            System.out.println("Window is opening..");
            isOpened = true;
        }
    }

    public void close() {
        if (!isOpened) {
            System.out.println("Window is already closed.");
        } else {
            System.out.println("Window is closing..");
            isOpened = false;
        }
    }

    public String getMaterial() {
        return material;
    }

    public String getColor() {
        return color;
    }

    public Dimension getDimension() {
        return dimension;
    }
}
