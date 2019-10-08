package com.diazbumma;

public class Door {

    private String material;
    private String color;
    private Key keyRequiredToUnlock;
    private Dimension dimension;
    private boolean isOpened;
    private boolean isLocked;

    public Door(String material, String color, Key keyRequiredToUnlock, Dimension dimension) {
        this.material = material;
        this.color = color;
        this.keyRequiredToUnlock = keyRequiredToUnlock;
        this.dimension = dimension;
        isOpened = false;
        isLocked = false;
    }

    public boolean open() {
        if (isLocked) {
            System.out.println("The door is locked.");
            return false;
        } else if (isOpened) {
            System.out.println("Door is already opened.");
        } else {
            System.out.println("Door is opening..");
            isOpened = true;
            System.out.println("Door is opened");
        }
        return true;
    }

    public void close() {
        if (!isOpened) {
            System.out.println("Door is already closed.");
        } else {
            System.out.println("Door is closing..");
            isOpened = false;
            System.out.println("Door is closed.");
        }
    }

    public void lock(Key key) {
        if (isLocked) {
            System.out.println("Door is already locked..");
        }
        else if (key.isMatch(this.keyRequiredToUnlock.getUnique())) {
            System.out.println("Locking the door..");
            isLocked = true;
            System.out.println("Door is locked.");
        } else {
            System.out.println("Different key. Cannot lock.");
        }
    }

    public void unlock(Key key) {
        if (!isLocked) {
            System.out.println("Door is already unlocked..");
        }
        else if (key.isMatch(this.keyRequiredToUnlock.getUnique())) {
            System.out.println("Unlocking the door..");
            isLocked = false;
            System.out.println("Door is unlocked.");
        } else {
            System.out.println("Different key. Cannot unlock.");
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
