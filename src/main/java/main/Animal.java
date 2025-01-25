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
        return species + ": " + name + ", " + age + " years";
    }

    void run() {
        System.out.println(name + " runs really fast!");
    }
}
