package main;

import java.util.ArrayList;

public class Zoo {
    String name;
    ArrayList<Animal> animals;

    Zoo(String name) {
        this.name = name;
        animals = new ArrayList<>();
    }

    void add(Animal a) {
        animals.add(a);
    }

    void show() {
        if (animals.size() == 0) {
            System.out.println("Zoo is empty.");
        } else {
            for (Animal a : animals) {
                System.out.println(a.details());
            }
        }
    }

    void makeRun(int laps) {
        for (Animal a : animals) {
            a.run(laps);
        }
    }
}
