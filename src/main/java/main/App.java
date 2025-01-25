package main;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Zoo name: ");
        Zoo zoo = new Zoo(s.nextLine());

        while (true) {
            System.out.println("1 Add animal");
            System.out.println("2 Show animals");
            System.out.println("3 Run animals");
            System.out.println("4 Exit");
            int choice = s.nextInt();
            s.nextLine();

            if (choice == 1) {
                System.out.print("Species: ");
                String sp = s.nextLine();
                System.out.print("Name: ");
                String nm = s.nextLine();
                System.out.print("Age: ");
                int ag = s.nextInt();
                s.nextLine();
                zoo.add(new Animal(sp, nm, ag));
            } else if (choice == 2) {
                zoo.show();
            } else if (choice == 3) {
                System.out.print("Laps: ");
                int laps = s.nextInt();
                s.nextLine();
                zoo.makeRun(laps);
            } else if (choice == 4) {
                break;
            } else {
                System.out.println("Invalid.");
            }
        }
        s.close();
    }
}
