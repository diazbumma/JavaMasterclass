package com.diazbumma;

import java.util.ArrayList;
import java.util.Collections;

public class League<T extends Team> {

    private String leagueName;
    private int year;
    private ArrayList<T> teamList;

    public League(String leagueName, int year) {
        this.leagueName = leagueName;
        this.year = year;
        this.teamList = new ArrayList<>();
    }

    public boolean addTeam(T team) {
        if (teamList.contains(team))
            return false;

        teamList.add(team);
        return true;
    }

    public boolean addScore(String team, int result) {
        boolean found = false;

        for (int i = 0; i < teamList.size(); i++) {
            if (teamList.get(i).getName().equals(team)) {
                teamList.get(i).scoring(result);
                found = true;
            }
        }

        return found;
    }

    public String getLeagueName() {
        return leagueName;
    }

    public int getYear() {
        return year;
    }

    public ArrayList<T> getTeamList() {
        Collections.sort(teamList);
        return teamList;
    }

    public int getNumberOfTeam () {
        return teamList.size();
    }
}
