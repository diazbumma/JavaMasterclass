package com.diazbumma;

public class Main {

    // Create a single room of a house using composition.
    // Think about the things that should be included in the room.
    // Maybe physical parts of the house but furniture as well
    // Add at least one method to access an object via a getter and
    // then that objects public method as you saw in the previous video
    // then add at least one method to hide the object e.g. not using a getter
    // but to access the object used in composition within the main class
    // like you saw in this video.

    public static void main(String[] args) {
        Key murdocksKey = new Key("ClintEastwood");

        House rockTheHouse = new House("Red", "Rancher House",
                new Dimension(6,6,6),
                new Bedroom(new Dimension(3,3, 3)),
                new Bathroom(new Dimension(3,3, 3)),
                new Door("wood", "white", murdocksKey, new Dimension(1.981, 0.686)),
                new Window("wood", "white", new Dimension(1.5, 1.2)));

        System.out.println("House type: " + rockTheHouse.getType());

        //get out from house, lock the door, and then try to enter the house
        System.out.println("\n==Entering a locked house");
        rockTheHouse.getOutFromHouse();
        rockTheHouse.getFrontDoor().lock(murdocksKey);
        rockTheHouse.enterTheHouse();

        //try to unlock with the different key
        System.out.println("\n==Unlocking with the different key");
        Key russelsKey = new Key("Humility");
        rockTheHouse.getFrontDoor().unlock(russelsKey);
        rockTheHouse.enterTheHouse();

        //try to unlock with the original key
        System.out.println("\n==Unlocking with the original key");
        rockTheHouse.getFrontDoor().unlock(murdocksKey);
        rockTheHouse.enterTheHouse();
    }
}
