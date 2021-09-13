package com.georgioskachrimanis.javacourse;

public abstract class Player {
    private String name;

    // Constructors
    public Player(String name) {
        this.name = name;
    }

    // Getters
    public String getName() {
        return name;
    }
}
