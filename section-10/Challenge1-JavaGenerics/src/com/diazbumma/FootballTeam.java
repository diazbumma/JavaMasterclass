package com.diazbumma;

public class FootballTeam extends Team {

    public FootballTeam(String teamName, int players) {
        super(teamName, players);
    }

    /*
     * 3 points awarded if win,
     * 1 point awarded if draw,
     * 0 points awarded if lose/not playing
     */
    @Override
    public void scoring(int objective) {
        switch (objective) {
            case 1:
                score += 3;
                break;
            case 0:
                score++;
                break;
        }
    }

    @Override
    public int compareTo(Team o) {
        return Integer.compare(o.getScore(), score);
    }
}
