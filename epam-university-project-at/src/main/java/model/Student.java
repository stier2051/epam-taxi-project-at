package model;

import enums.Mark;
import enums.Subject;
import exception.MarkUnknownException;
import exception.NullSubjectByStudentException;

import java.util.*;

public class Student {
    private int id;
    private String name;
    private Map<Subject, Mark> markMap = new HashMap<>();

    public Student(int id, String name, Subject subjectOne, Mark markOne, Subject subjectTwo, Mark markTwo, Subject subjectThree, Mark markThree) {
        this.id = id;
        this.name = name;
        try {
            this.addMark(subjectOne, markOne);
            this.addMark(subjectTwo, markTwo);
            this.addMark(subjectThree, markThree);
        } catch (MarkUnknownException e) {
            e.printStackTrace();
        }
    }

    public Map<Subject, Mark> getMarkMap() {
        return markMap;
    }

    public List<Subject> getSubject() throws NullSubjectByStudentException {
        List<Subject> subjectList = new ArrayList<>();
        for (Map.Entry<Subject, Mark> pair : markMap.entrySet()) {
            subjectList.add(pair.getKey());
        }
        if (subjectList.size() == 0) {
            throw new NullSubjectByStudentException(NullSubjectByStudentException.class.getName() + ":" + subjectList + " must have subject.");
        }
        return subjectList;
    }

    public void addMark(Subject subject, Mark mark) throws MarkUnknownException {
        if (mark.getValue() > 0 && mark.getValue() < 6) this.markMap.put(subject, mark);
        else {
            throw new MarkUnknownException(MarkUnknownException.class.getName() + ":" + mark + " must be in range of 1 to 5");
        }
    }

    public double getAverageMarkFromAllSubjects() {
        double sumOfMarks = 0;
        for (Map.Entry<Subject, Mark> pair : markMap.entrySet()) {
            sumOfMarks += (double) pair.getValue().getValue();
        }
        return sumOfMarks/markMap.size();
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
