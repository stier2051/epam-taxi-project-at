import model.*;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

public class Runner {
    static Logger logger = Logger.getGlobal();
    static List<Student> students = Arrays.asList(
            new Student(1, "Tom",  enums.Faculty.PHYSICS, enums.Group.A,5, 3, 2),
            new Student(2, "Ivan", enums.Faculty.PHYSICS, enums.Group.B,3,2,5),
            new Student(3, "Richard", enums.Faculty.PHILOSOPHY, enums.Group.C, 5,4,3)
    );

    public static void main(String[] args) {

        University university = new University(students);

        Group groupA = new GroupA(university.getStudentsListByGroup(enums.Group.A));
        Group groupB = new GroupB(university.getStudentsListByGroup(enums.Group.B));
        Group groupC = new GroupC(university.getStudentsListByGroup(enums.Group.C));

        List<Group> groups = Arrays.asList(groupA, groupB, groupC);

        for (Student student : students) {
            logger.info("Average mark by student" +
                    student +
                    student.getAverageMarkOfStudent(
                        student.getLawMark(),
                        student.getEnglishMark(),
                        student.getMathMark()
                    )
            );

        }

        logger.info("Average mark by Mathematics in University: " + university.getAverageMarkBySubjectInUniversity(enums.Subject.MATHEMATICS));
    }
}
