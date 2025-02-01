package main;

import java.util.ArrayList;
import java.util.Collections;

public class Calculator {
    static double getAverageGrade(Student student) {
        ArrayList<Integer> grades = student.getGrades();
        if (grades.isEmpty()) {
            return 0;
        }
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.size();
    }

    static double getMedianGrade(Student student) {
        ArrayList<Integer> grades = student.getGrades();
        if (grades.isEmpty()) {
            return 0;
        }
        ArrayList<Integer> sortedGrades = new ArrayList<>(grades);
        Collections.sort(sortedGrades);
        int size = sortedGrades.size();
        if (size % 2 == 1) {
            return sortedGrades.get(size / 2);
        }
        return (sortedGrades.get(size / 2 - 1) + sortedGrades.get(size / 2)) / 2.0;
    }
}
