package main;

import java.util.ArrayList;

public class Zoo {
    String name;
    ArrayList<Animal> animals;

    Zoo(String name) {
        this.name = name;
        animals = new ArrayList<>();
    }

    void addAnimal(Animal a) {
        animals.add(a);
    }

    void listAnimals() {
        if (animals.isEmpty()) {
            System.out.println(name + " contains no animals.");
        } else {
            System.out.println(name + " contains the following animals:");
            for (Animal a : animals) {
                System.out.println(a.details());
            }
        }
    }

    void runAnimals(int laps) {
        for (Animal a : animals) {
            for (int i = 0; i < laps; i++) {
                a.run(laps);
            }
        }
    }
}
