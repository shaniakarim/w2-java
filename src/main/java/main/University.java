package main;

import java.io.*;
import java.util.ArrayList;

public class University implements Serializable {
    ArrayList<Student> students;

    University() {
        students = new ArrayList<>();
    }

    void addStudent(Student student) {
        students.add(student);
    }

    void listStudents() {
        if (students.isEmpty()) {
            System.out.println("No students.");
        } else {
            for (int i = 0; i < students.size(); i++) {
                System.out.println(i + ": " + students.get(i).getDetails());
            }
        }
    }

    Student getStudent(int index) {
        if (index >= 0 && index < students.size()) {
            return students.get(index);
        }
        return null;
    }

    void saveToFile(String filename) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(this);
            System.out.println("Students saved to file.");
        } catch (IOException e) {
            System.out.println("Error saving students to file.");
        }
    }

    static University loadFromFile(String filename) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            System.out.println("Students loaded from file.");
            return (University) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error loading students from file.");
        }
        return new University();
    }
}
