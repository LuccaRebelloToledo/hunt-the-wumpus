package br.edu.univas.enums;

public enum Directions {
    NORTH("Norte"),
    SOUTH("Sul"),
    EAST("Leste"),
    WEST("Oeste");

    private final String direction;

    Directions(String direction) {
        this.direction = direction;
    }

    public String getDirection() {
        return this.direction;
    }
}
