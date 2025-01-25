package main;

import java.util.ArrayList;

public class Zoo {
    String name;
    ArrayList<Animal> animals;

    Zoo(String name) {
        this.name = name;
        animals = new ArrayList<>();
    }

    void addAnimal(Animal animal) {
        animals.add(animal);
    }

    void listAnimals() {
        if (animals.isEmpty()) {
            System.out.println(name + " contains no animals.");
        } else {
            System.out.println(name + " contains the following animals:");
            for (Animal animal : animals) {
                System.out.println(animal.details());
            }
        }
    }

    void runAnimals(int laps) {
        for (Animal animal : animals) {
            for (int i = 0; i < laps; i++) {
                animal.run();
            }
        }
    }
}
