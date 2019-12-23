package com.diazbumma;

public abstract class Team implements Comparable<Team> {

    private String teamName;
    private int players;
    protected int score;

    public Team(String teamName, int players) {
        this.teamName = teamName;
        this.players = players;
        this.score = 0;
    }

    public abstract void scoring(int objective);

    public String getName() {
        return teamName;
    }

    public int getPlayers() {
        return players;
    }

    public void setPlayers(int players) {
        this.players = players;
    }

    public int getScore() {
        return score;
    }
}
