package com.georgioskachrimanis.javacourse;

import java.util.ArrayList;
import java.util.Collections;

public class League<T extends Team>{
    private String name;
    private ArrayList<T> league = new ArrayList<T>();

    // Constructor
    public League(String name) {
        this.name = name;
    }

    // Getters
    public String getName() {
        return name;
    }

    // Methods

    public boolean addTeam(T team){
        if (league.contains(team)){
            System.out.println("Team" + team.getName() + " is already in the " + this.getName()+ "!");
            return false;
        }else {
            league.add(team);
            System.out.println("Team " + team.getName() + " is added to the " + this.getName() + "!");
            return true;
        }
    }
    public void printStandings() {
        // the Collections.sort works because we have in the team class the implemented method of compareTo.
        // The Collections API is using it to sort out the items of the list.
        Collections.sort(this.league);
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("Teams Ranking: ");
        for (T t : this.league) {
            System.out.println(t.getName() + " : " + t.ranking());
        }
    }


}
