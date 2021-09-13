package com.georgioskachrimanis.javacourse;

import java.util.ArrayList;

public class Team<T extends Player> implements Comparable<Team<T>>{
    private String name;

    int played = 0;
    int won = 0;
    int lost = 0;
    int tied = 0;

    private ArrayList<T> playersOfTeam = new ArrayList<>();

    // Constructor
    public Team(String name) {
        this.name = name;
    }

    // Getter
    public String getName() {
        return name;
    }

    // Implemented methods
    @Override
    public int compareTo(Team<T> team) {
        return Integer.compare(team.ranking(), this.ranking());
        // -1:this.team > team
        // 0: same score
        // 1:this.team < team
    }

    // Methods
    public boolean addPlayer(T player) {
        if (playersOfTeam.contains(player)){
            System.out.println("The player " + player.getName() + " is already on this team!");
            return false;
        } else {
            playersOfTeam.add(player);
            System.out.println(player.getName() + " is added to " + this.name);
            return true;
        }
    }

    public int numPlayers() {
        return this.playersOfTeam.size();
    }

    public void matchResult(Team<T> opponent, int ourScore, int theirScore) {
        String message;
        if (ourScore > theirScore) {
            won++;
            message = " beat ";
        } else if (ourScore == theirScore) {
            tied++;
            message = " drew with ";
        } else {
            lost++;
            message = " lost to ";
        }
        played++;

        // these lines will also update opponents score. This is a really nice piece of code to be honest...
        if (opponent !=null) {
            System.out.println(this.getName() + message + opponent.getName());
            opponent.matchResult(null, theirScore, ourScore);
        }
    }

    public int ranking() {
        return won * 2 + tied;
    }

}
