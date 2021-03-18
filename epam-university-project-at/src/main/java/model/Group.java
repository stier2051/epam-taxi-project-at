package model;

import exception.NullStudentsInGroupException;

import java.util.List;

public class Group {
    private String groupName;
    private List<Student> students;

    public Group(String groupName, List<Student> students) {
        this.groupName = groupName;
        this.students = students;
    }

    public String getGroupName() {
        return groupName;
    }

    public List<Student> getStudents() throws NullStudentsInGroupException{
        if (students.size() == 0) {
            throw new NullStudentsInGroupException(NullStudentsInGroupException.class.getName() + ": must have student.");
        } else return students;
    }
}
