package com.diazbumma;

public class Room {

    private String type;
    private Dimension dimension;

    public Room(String type, Dimension dimension) {
        this.type = type;
        this.dimension = dimension;
    }

    public String getType() {
        return type;
    }

    public Dimension getDimension() {
        return dimension;
    }
}
