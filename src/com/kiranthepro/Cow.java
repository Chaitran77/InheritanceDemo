package com.kiranthepro;

public class Cow extends Animal {

    private String lastFed;

    public Cow(String name, int age, String breed, String lastFed) {
        super(name, age, breed);
        this.lastFed = lastFed;
    }

    // basically irrelevant
    @Override
    public String getName() {
        return "Cow's name is " + this.name;
    }

    public String getLastFed() {
        return lastFed;
    }

    public void setLastFed(String lastFed) {
        this.lastFed = lastFed;
    }
}
