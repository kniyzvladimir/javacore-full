package lesson8.hierarchyOfStudents;

public class Demo {
    static Student createHighestParent(String firstName, String lastName, int group, Course[] coursesTaken) {
        Student student = new Student(firstName, lastName, group, coursesTaken);
        return student;
    }

    SpecialStudent createLowestChild(String firstName, String lastName, int group, Course[] coursesTaken) {
        SpecialStudent specialStudent = new SpecialStudent(firstName, lastName, group, coursesTaken);
        return specialStudent;
    }

}
