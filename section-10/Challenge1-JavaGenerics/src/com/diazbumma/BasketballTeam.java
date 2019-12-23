package com.diazbumma;

public class BasketballTeam extends Team {

    public BasketballTeam(String teamName, int players) {
        super(teamName, players);
    }

    /*
     * 2 points awarded if win (denoted with 1),
     * 1 point awarded if draw (denoted with 0),
     * 0 points awarded if lose/not playing
     */
    @Override
    public void scoring(int objective) {
        switch (objective) {
            case 1:
                score += 2;
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
