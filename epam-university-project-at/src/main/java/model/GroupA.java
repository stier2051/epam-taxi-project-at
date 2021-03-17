package model;

import enums.Faculty;

import java.util.List;

public class GroupA extends Group{
    private List<Student> students;

    public GroupA(List<Student> students) {
        this.students = students;
    }
}
