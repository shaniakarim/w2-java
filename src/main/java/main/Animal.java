package main;

public class Animal {
    String species;
    String name;
    int age;

    Animal(String species, String name, int age) {
        this.species = species;
        this.name = name;
        this.age = age;
    }

    String details() {
        return species + " " + name + " " + age;
    }

    void run(int laps) {
        System.out.println(name + " ran " + laps + " laps.");
    }
}
