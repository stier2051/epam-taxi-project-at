
import enums.Mark;
import enums.Subject;
import exception.NullFacultiesInUniversityException;
import exception.NullGroupsInFacultyException;
import exception.NullStudentsInGroupException;
import model.Faculty;
import model.Group;
import model.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

public class University {
    static Logger logger = Logger.getGlobal();
    private String universityName;
    private List<model.Faculty> faculties;

    public University(String universityName, List<Faculty> faculties) {
        this.universityName = universityName;
        this.faculties = faculties;
    }

    public List<Faculty> getFaculties() throws NullFacultiesInUniversityException {
        if (faculties.size() == 0) {
            throw new NullFacultiesInUniversityException(NullFacultiesInUniversityException.class.getName()  + ": must have group.");
        }else return faculties;
    }

    public String getUniversityName() {
        return universityName;
    }

    public double getAverageMarkBySubjectInUniversity(Subject subject) {
        List<Group> groupList = new ArrayList<>();
        List<Student> studentList = new ArrayList<>();
        Map<Subject, Mark> subjectMarkMap = new HashMap<>();
        double sumOfMarks = 0;
        int count = 0;

        for (Faculty faculty : faculties) {
            try {
                groupList.addAll(faculty.getGroups());
            } catch (NullGroupsInFacultyException e) {
                logger.info("Faculty is empty!" + NullGroupsInFacultyException.class.getName());
            }
        }

        for (Group group : groupList) {
            try {
                studentList.addAll(group.getStudents());
            } catch (NullStudentsInGroupException e) {
                logger.info("Group is empty! " + NullStudentsInGroupException.class.getName());
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
