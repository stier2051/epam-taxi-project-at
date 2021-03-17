import enums.Faculty;
import enums.Group;
import enums.Subject;
import model.GroupA;
import model.Student;

import java.util.ArrayList;
import java.util.List;

public class University {
    private List<Student> students;
    private List<Group> groups;

    public University(List<Student> students) {
        this.students = students;
    }

    public List<Student> getStudentsListByFaculty(Faculty faculty) {
        List<Student> list = new ArrayList<>();
        for (Student student : students) {
            if (student.getFaculty().equals(faculty)) list.add(student);
        }
        return list;
    }

    public List<Student> getStudentsListByGroup(Group group) {
        List<Student> list = new ArrayList<>();
        for (Student student : students) {
            if (student.getGroup().equals(group)) list.add(student);
        }
        return list;
    }

    public double getAverageMarkBySubjectInUniversity(Subject subject) {
        double averageMark = 0;
        double sum = 0;
        switch (subject) {
            case MATHEMATICS:
                for (Student student : students) {
                    sum += student.getMathMark();
                }
                averageMark = sum/students.size();
                break;
            case LAW:
                for (Student student : students) {
                    sum += student.getLawMark();
                }
                averageMark = sum/students.size();
                break;
            case ENGLISH:
                for (Student student : students) {
                    sum += student.getEnglishMark();
                }
                averageMark = sum/students.size();
                break;
            default:
        }
        return averageMark;
    }
}
