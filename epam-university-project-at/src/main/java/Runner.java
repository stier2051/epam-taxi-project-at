import enums.Mark;
import enums.Subject;
import exception.NullGroupsInFacultyException;
import exception.NullSubjectByStudentException;
import model.*;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

public class Runner {
    static Logger logger = Logger.getGlobal();
    static List<Student> studentsGroupA = Arrays.asList(
            new Student(1, "Tom", Subject.MATHEMATICS, Mark.FIVE, Subject.LAW, Mark.FOUR, Subject.PHILOSOPHY, Mark.THREE),
            new Student(2, "Ivan", Subject.MATHEMATICS, Mark.FOUR, Subject.LAW, Mark.FOUR, Subject.PHILOSOPHY, Mark.FIVE),
            new Student(3, "Richard", Subject.MATHEMATICS, Mark.FIVE, Subject.LAW, Mark.THREE, Subject.PHILOSOPHY, Mark.FIVE)
    );

    static List<Student> studentsGroupB = Arrays.asList(
            new Student(4, "Sara", Subject.PHYSICS, Mark.THREE, Subject.COMPUTERSCIENCE, Mark.FOUR, Subject.ENGLISH, Mark.FIVE),
            new Student(5, "Britney", Subject.PHYSICS, Mark.FIVE, Subject.COMPUTERSCIENCE, Mark.THREE, Subject.ENGLISH, Mark.FIVE)
    );

    static List<Student> studentsGroupC = Arrays.asList(
            new Student(6, "Whitney", Subject.ECONOMICS, Mark.FOUR, Subject.LAW, Mark.FIVE, Subject.PHILOSOPHY, Mark.TWO),
            new Student(7, "Mark", Subject.ECONOMICS, Mark.FIVE, Subject.LAW, Mark.FIVE, Subject.PHILOSOPHY, Mark.FOUR)
    );

    static List<Student> studentsGroupD = Arrays.asList(
            new Student(8, "Richi", Subject.MATHEMATICS, Mark.FIVE, Subject.LAW, Mark.FOUR, Subject.PHILOSOPHY, Mark.THREE),
            new Student(9, "Christoph", Subject.MATHEMATICS, Mark.FIVE, Subject.LAW, Mark.FOUR, Subject.PHILOSOPHY, Mark.THREE),
            new Student(10, "Alex", Subject.MATHEMATICS, Mark.FIVE, Subject.LAW, Mark.FOUR, Subject.PHILOSOPHY, Mark.THREE)
            );

    public static void main(String[] args) {

        new Student(8, "Peter", Subject.ECONOMICS, Mark.FOUR, Subject.LAW, Mark.FIVE, Subject.MATHEMATICS, Mark.TWO);

        Group groupA = new Group("Group A", studentsGroupA);
        Group groupB = new Group("Group B", studentsGroupB);
        Group groupC = new Group("Group C", studentsGroupC);
        Group groupD = new Group("Group D", studentsGroupD);

        List<Group> groupsOne = Arrays.asList(groupA);
        List<Group> groupsTwo = Arrays.asList(groupB, groupD);
        List<Group> groupsThree = Arrays.asList(groupC);
        List<Group> emptyGroups = Arrays.asList();


        Faculty facultyOfPhysics = new Faculty("Faculty of Physics", groupsOne);
        Faculty facultyOfLaw = new Faculty("Faculty of Law", groupsTwo);
        Faculty facultyOfEducation = new Faculty("Faculty of Education", groupsThree);
        Faculty emptyFaculty = new Faculty("Empty Faculty", emptyGroups);

        List<Faculty> faculties = Arrays.asList(
                facultyOfEducation,
                facultyOfLaw,
                facultyOfPhysics
        );

        University university = null;
        university = new University("UHM", faculties);

        try {
            emptyFaculty.getGroups();
        } catch (NullGroupsInFacultyException e) {
            logger.info("Faculty is empty!" + NullGroupsInFacultyException.class.getName());
        }

        for (Student student : studentsGroupB) {
            logger.info("average of " + student + " " + student.getAverageMarkFromAllSubjects());
        }

        logger.info("average by Subject: " + facultyOfPhysics.getAverageMarkFromSubjectGroupFaculty(Subject.LAW,groupA));
//
        logger.info("average by Subject in Uni " + university.getAverageMarkBySubjectInUniversity(Subject.ECONOMICS));
    }
}
