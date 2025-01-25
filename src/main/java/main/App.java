package main;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, name the zoo:");
        String zooName = scanner.nextLine();
        Zoo zoo = new Zoo(zooName);

        while (true) {
            System.out.println("1) Create a new animal, 2) List all animals, 3) Run animals, 0) End the program");
            String choice = scanner.nextLine();

            if (choice.equals("0")) {
                System.out.println("Thank you for using the program.");
                break;
            }

            switch (choice) {
                case "1":
                    System.out.println("What species?");
                    String species = scanner.nextLine();
                    System.out.println("Enter the name of the animal:");
                    String name = scanner.nextLine();
                    System.out.println("Enter the age of the animal:");
                    int age;
                    try {
                        age = Integer.parseInt(scanner.nextLine());
                        if (age < 0)
                            throw new NumberFormatException();
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid age. Please try again.");
                        continue;
                    }
                    zoo.addAnimal(new Animal(species, name, age));
                    break;

                case "2":
                    zoo.listAnimals();
                    break;

                case "3":
                    System.out.println("How many laps?");
                    int laps;
                    try {
                        laps = Integer.parseInt(scanner.nextLine());
                        if (laps <= 0)
                            throw new NumberFormatException();
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid input. Please enter a positive number.");
                        continue;
                    }
                    zoo.runAnimals(laps);
                    break;

                default:
                    System.out.println("Wrong input value");
                    break;
            }
        }

        scanner.close();
    }
}
