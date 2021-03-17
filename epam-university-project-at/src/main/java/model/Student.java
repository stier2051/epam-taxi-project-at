package model;

import enums.Faculty;
import enums.Group;

import java.util.List;

public class Student {
    private int id;
    private String name;
    private Faculty faculty;
    private Group group;
    private int mathMark;
    private int lawMark;
    private int englishMark;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Student(int id, String name, int mathMark, int lawMark, int englishMark) {
        this.id = id;
        this.name = name;
        this.mathMark = mathMark;
        this.lawMark = lawMark;
        this.englishMark = englishMark;
    }

    public Student(int id, String name, Faculty faculty, Group group, int mathMark, int lawMark, int englishMark) {
        this.id = id;
        this.name = name;
        this.faculty = faculty;
        this.group = group;
        this.mathMark = mathMark;
        this.lawMark = lawMark;
        this.englishMark = englishMark;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public Group getGroup() {
        return group;
    }

    public int getMathMark() {
        return mathMark;
    }

    public int getLawMark() {
        return lawMark;
    }

    public int getEnglishMark() {
        return englishMark;
    }

    public double getAverageMarkOfStudent(double markOne, double markTwo, double markThree) {
        return ((double)this.getMathMark() + (double) this.getLawMark() + (double) this.getEnglishMark()) / 3;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
