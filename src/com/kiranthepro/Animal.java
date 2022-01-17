package com.kiranthepro;

public class Animal {

    // Subclasses can access these protected variables
    protected String name;
    protected int age;
    protected String breed;

    public Animal(String name, int age, String breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Animal {" +
                "name = " + name + '\'' +
                ", age = " + age + '\'' +
                ", breed = " + breed + '\'';
    }

    // POLYMORPHIC method because behaviour changes in Cow subclass (@Override used)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
