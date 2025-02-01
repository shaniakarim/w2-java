package main;

import java.io.Serializable;
import java.util.ArrayList;

public class Student implements Serializable {
    String name;
    String studentNumber;
    ArrayList<String> courses;
    ArrayList<Integer> grades;

    Student(String name, String studentNumber) {
        this.name = name;
        this.studentNumber = studentNumber;
        this.courses = new ArrayList<>();
        this.grades = new ArrayList<>();
    }

    void addCourseCompletion(String course, int grade) {
        courses.add(course);
        grades.add(grade);
    }

    String getDetails() {
        return studentNumber + ": " + name;
    }

    void listCourses() {
        for (int i = 0; i < courses.size(); i++) {
            System.out.println(courses.get(i) + ": " + grades.get(i));
        }
    }

    ArrayList<Integer> getGrades() {
        return grades;
    }
}
