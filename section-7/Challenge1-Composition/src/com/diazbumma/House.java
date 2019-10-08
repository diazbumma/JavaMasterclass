package com.diazbumma;

public class House {

    private String color;
    private String type;
    private Dimension dimension;
    private Bedroom bedRoom;
    private Bathroom bathRoom;
    private Door frontDoor;
    private Window frontWindow;

    public House(String color, String type, Dimension dimension,
                 Bedroom bedRoom, Bathroom bathRoom, Door frontDoor, Window frontWindow) {
        this.color = color;
        this.type = type;
        this.dimension = dimension;
        this.bedRoom = bedRoom;
        this.bathRoom = bathRoom;
        this.frontDoor = frontDoor;
        this.frontWindow = frontWindow;
    }

    public void enterTheHouse() {
        if (frontDoor.open()) {
            System.out.println("Welcome back to the house.");
            frontDoor.close();
        } else {
            System.out.println("Cannot enter house. The door is locked.");
        }
    }

    public void getOutFromHouse() {
        if (frontDoor.open()) {
            System.out.println("See you later.");
            frontDoor.close();
        } else {
            System.out.println("Cannot get out from the house. The door is locked.");
        }
    }

    public String getColor() {
        return color;
    }

    public String getType() {
        return type;
    }

    public Dimension getDimension() {
        return dimension;
    }

    public Bedroom getBedRoom() {
        return bedRoom;
    }

    public Bathroom getBathRoom() {
        return bathRoom;
    }

    public Door getFrontDoor() {
        return frontDoor;
    }

    public Window getFrontWindow() {
        return frontWindow;
    }
}
