package model;

import enums.Mark;
import enums.Subject;
import exception.NullGroupsInFacultyException;
import exception.NullStudentsInGroupException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

public class Faculty {
    static Logger logger = Logger.getGlobal();
    private String facultyName;
    private List<Group> groups;

    public Faculty(String facultyName, List<Group> groups) {
        this.facultyName = facultyName;
        this.groups = groups;
    }

    public String getFacultyName() {
        return facultyName;
    }

    public List<Group> getGroups() throws NullGroupsInFacultyException {
        if (groups.isEmpty()) {
            throw new NullGroupsInFacultyException("Faculty must have group!");
        }
        return groups;
    }

    public double getAverageMarkFromSubjectGroupFaculty(Subject subject, Group group) {
        List<Student> studentList = new ArrayList<>();
        Map<Subject, Mark> subjectMarkMap = new HashMap<>();
        double sumOfMarks = 0;
        int count = 0;

        for (Group groupIterator : groups) {
            if (groupIterator.equals(group)) {
                try {
                    studentList.addAll(groupIterator.getStudents());
                } catch (NullStudentsInGroupException e) {
                    logger.info("Group is empty! " + NullStudentsInGroupException.class.getName());
                }
            }
        }

        for (Student student : studentList) {
            subjectMarkMap.putAll(student.getMarkMap());
            for (Map.Entry<Subject, Mark> pair : subjectMarkMap.entrySet()) {
                if (pair.getKey().equals(subject)) {
                    sumOfMarks += (double) pair.getValue().getValue();
                    count++;
                }
            }
            subjectMarkMap.clear();
        }
        if (count == 0) count = 1;
        return sumOfMarks / count;
    }
}
