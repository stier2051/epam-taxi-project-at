package model;

import enums.Faculty;

import java.util.List;

public class GroupB extends Group{
    private List<Student> students;

    public GroupB(List<Student> students) {
        this.students = students;
    }
}
