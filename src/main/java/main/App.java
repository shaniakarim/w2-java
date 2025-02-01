package main;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        University university = new University();

        while (true) {
            System.out.println(
                    "1) Add student, 2) List students, 3) Add course completion for student, 4) List course completions of student, 5) Calculate the average of course completions, 6) Calculate median of course completions, 7) Save students to file, 8) Load students from file, 0) End the program");
            String choice = scanner.nextLine();

            if (choice.equals("0")) {
                System.out.println("Thank you for using the program.");
                break;
            }

            switch (choice) {
                case "1":
                    System.out.println("What is the name of the student?");
                    String name = scanner.nextLine();
                    System.out.println("What is the student number of the student?");
                    String studentNumber = scanner.nextLine();
                    university.addStudent(new Student(name, studentNumber));
                    break;

                case "2":
                    university.listStudents();
                    break;

                case "3":
                    university.listStudents();
                    System.out.println("Which student?");
                    try {
                        int studentIndex = Integer.parseInt(scanner.nextLine());
                        Student student = university.getStudent(studentIndex);
                        if (student != null) {
                            System.out.println("What is the name of the course?");
                            String course = scanner.nextLine();
                            System.out.println("What is the grade of the course?");
                            int grade = Integer.parseInt(scanner.nextLine());
                            student.addCourseCompletion(course, grade);
                        } else {
                            System.out.println("Invalid student index.");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid input.");
                    }
                    break;

                case "4":
                    university.listStudents();
                    System.out.println("Which student?");
                    try {
                        int index = Integer.parseInt(scanner.nextLine());
                        Student student = university.getStudent(index);
                        if (student != null) {
                            student.listCourses();
                        } else {
                            System.out.println("Invalid student index.");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid input.");
                    }
                    break;

                case "5":
                    university.listStudents();
                    System.out.println("Which student?");
                    try {
                        int index = Integer.parseInt(scanner.nextLine());
                        Student student = university.getStudent(index);
                        if (student != null) {
                            System.out.println("Average is " + Calculator.getAverageGrade(student));
                        } else {
                            System.out.println("Invalid student index.");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid input.");
                    }
                    break;

                case "6":
                    university.listStudents();
                    System.out.println("Which student?");
                    try {
                        int index = Integer.parseInt(scanner.nextLine());
                        Student student = university.getStudent(index);
                        if (student != null) {
                            System.out.println("Median is " + Calculator.getMedianGrade(student));
                        } else {
                            System.out.println("Invalid student index.");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid input.");
                    }
                    break;

                case "7":
                    university.saveToFile("students.dat");
                    break;

                case "8":
                    university = University.loadFromFile("students.dat");
                    break;

                default:
                    System.out.println("Wrong input value");
            }
        }

        scanner.close();
    }
}
