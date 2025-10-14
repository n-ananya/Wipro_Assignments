package Project3_StudentGradeCalculation.main;

import Project3_StudentGradeCalculation.bean.Student;
import Project3_StudentGradeCalculation.exception.*;
import Project3_StudentGradeCalculation.service.*;

public class StudentMain {
    static Student data[] = new Student[4];

    public StudentMain() {
        data[0] = new Student("Sekar", new int[] {85, 75, 95});
        data[1] = new Student(null, new int[] {11, 22, 33});
        data[2] = null;
        data[3] = new Student("Manoj", null);
    }

    public static void main(String[] args) {
        StudentMain sm = new StudentMain();
        StudentReport report = new StudentReport();
        StudentService service = new StudentService();

        for (int i = 0; i < data.length; i++) {
            try {
                String result = report.validate(data[i]);
                if (result.equals("VALID")) {
                    String grade = report.findGrades(data[i]);
                    System.out.println("Grade of " + data[i].getName() + " is: " + grade);
                }
            } catch (NullNameException | NullMarksArrayException | NullStudentObjectException e) {
                e.printStackTrace();
            }
        }

        System.out.println("\n--- Summary ---");
        System.out.println("Number of Null Marks Array: " + service.findNumberOfNullMarksArray(data));
        System.out.println("Number of Null Names: " + service.findNumberOfNullName(data));
        System.out.println("Number of Null Objects: " + service.findNumberOfNullObjects(data));
    }
}

