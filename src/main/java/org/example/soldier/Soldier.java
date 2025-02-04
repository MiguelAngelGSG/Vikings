package org.example.soldier;

public class Soldier {

    private int strength;
    private int health;

//    Constructor
    public Soldier(int health, int strength) {
        this.health = health;
        this.strength = strength;
    }

    public int attack() {
        return this.strength;
    }

    public void recieveDamage(int damage) {
        this.health -= damage;
    }

//    Getters
    public int getHealth() {
        return this.health;
    }

    public int getStrength() {
        return this.strength;
    }
}