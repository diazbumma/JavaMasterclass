package com.diazbumma;

import java.util.ArrayList;
import java.util.List;

public class Monster implements Saveable {

    private String name;
    private int hitpoints;
    private int health;

    public Monster(String name, int hitpoints, int health) {
        this.name = name;
        this.hitpoints = hitpoints;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHitpoints() {
        return hitpoints;
    }

    public void setHitpoints(int hitpoints) {
        this.hitpoints = hitpoints;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    @Override
    public void write(List<String> data) {
        if (!data.isEmpty()) {
            name = data.get(0);
            hitpoints = Integer.parseInt(data.get(1));
            health = Integer.parseInt(data.get(2));
        }
    }

    @Override
    public List<String> read() {
        List<String> toRead= new ArrayList<>();
        toRead.add(0, name);
        toRead.add(1, String.valueOf(hitpoints));
        toRead.add(2, String.valueOf(health));
        return toRead;
    }

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", hitpoints=" + hitpoints +
                ", health=" + health +
                '}';
    }
}
