package com.diazbumma;

import java.util.ArrayList;
import java.util.List;

public class Player implements Saveable {

    private String name;
    private int hitPoints;
    private int health;
    private String skill;

    public Player(String name, int hitPoints) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.health = 100;
        this.skill = "Blade Furry";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    @Override
    public void write(List<String> data) {
        if (!data.isEmpty()) {
            name = data.get(0);
            hitPoints = Integer.parseInt(data.get(1));
            health = Integer.parseInt(data.get(2));
            skill = data.get(3);
        }
    }

    @Override
    public List<String> read() {
        List<String> toRead = new ArrayList<>();
        toRead.add(0, name);
        toRead.add(1, String.valueOf(hitPoints));
        toRead.add(2, String.valueOf(health));
        toRead.add(3, skill);
        return toRead;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", hitPoints=" + hitPoints +
                ", health=" + health +
                ", skill='" + skill + '\'' +
                '}';
    }
}
