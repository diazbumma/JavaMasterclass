package com.diazbumma;

import java.util.ArrayList;

public class Main {

    // Create a generic class to implement a league table for a sport.
    // The class should allow teams to be added to the list, and store
    // a list of teams that belong to the league.
    //
    // Your class should have a method to print out the teams in order,
    // with the team at the top of the league printed first.
    //
    // Only teams of the same type should be added to any particular
    // instance of the league class - the program should fail to compile
    // if an attempt is made to add an incompatible team.

    public static void main(String[] args) {
        League<FootballTeam> championsLeague = new League<>("UEFA Champions League", 2019);
        championsLeague.addTeam(new FootballTeam("Real Madrid", 15));
        championsLeague.addTeam(new FootballTeam("Milan", 20));
        championsLeague.addTeam(new FootballTeam("Liverpool", 22));
        championsLeague.addTeam(new FootballTeam("Barcelona", 13));

        //win = 1, draw = 0, lose -1
        championsLeague.addScore("Barcelona", 1);
        championsLeague.addScore("Milan", -1);
        championsLeague.addScore("Real Madrid", 1);
        championsLeague.addScore("Liverpool", -1);
        championsLeague.addScore("Milan", -1);
        championsLeague.addScore("Liverpool", 1);
        championsLeague.addScore("Barcelona", 1);
        championsLeague.addScore("Real Madrid", -1);

        ArrayList<FootballTeam> finalScoreBoardFootball = championsLeague.getTeamList();
        System.out.println("Final Rank of " + championsLeague.getLeagueName() + " " + championsLeague.getYear());
        for (int i = 0; i < championsLeague.getNumberOfTeam(); i++) {
            String teamName = finalScoreBoardFootball.get(i).getName();
            int score = finalScoreBoardFootball.get(i).getScore();
            System.out.println((i+1) + ". " + teamName + " " + score);
        }

        League<BasketballTeam> nba = new League<>("NBA", 2019);
        nba.addTeam(new BasketballTeam("Boston Celtics", 14));
        nba.addTeam(new BasketballTeam("Toronto Raptors", 13));
        nba.addTeam(new BasketballTeam("Chicago Bulls", 16));
        nba.addTeam(new BasketballTeam("LA Lakers", 12));

        System.out.println("\n====================");

        //win = 1, draw = 0, lose -1
        nba.addScore("Boston Celtics", 1);
        nba.addScore("Toronto Raptors", -1);
        nba.addScore("LA Lakers", 1);
        nba.addScore("Chicago Bulls", -1);
        nba.addScore("Toronto Raptors", -1);
        nba.addScore("Chicago Bulls", 1);
        nba.addScore("Boston Celtics", -1);
        nba.addScore("LA Lakers", 1);

        ArrayList<BasketballTeam> finalScoreBoardBasketball = nba.getTeamList();
        System.out.println("Final Rank of " + nba.getLeagueName() + " " + nba.getYear());
        for (int i = 0; i < nba.getNumberOfTeam(); i++) {
            String teamName = finalScoreBoardBasketball.get(i).getName();
            int score = finalScoreBoardBasketball.get(i).getScore();
            System.out.println((i+1) + ". " + teamName + " " + score);
        }
    }
}
