package com.kiranthepro;

public class Sheep extends Animal {
    protected String lastSheared;

    public Sheep(String name, int age, String breed, String lastSheared) {
        super(name, age, breed);
        this.lastSheared = lastSheared;
    }

    // no other getter and setter methods need to be created as they already exist in the Animal superclass which this class inherits from.
    public String getLastSheared() {
        return lastSheared;
    }

    public void setLastSheared(String lastSheared) {
        this.lastSheared = lastSheared;
    }
}
