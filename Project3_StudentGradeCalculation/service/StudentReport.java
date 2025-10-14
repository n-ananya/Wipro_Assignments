package Project3_StudentGradeCalculation.service;

import Project3_StudentGradeCalculation.bean.Student;
import Project3_StudentGradeCalculation.exception.*;

public class StudentReport {

    public String findGrades(Student studentObject) {
        int[] marks = studentObject.getMarks();
        String grade;

        for (int mark : marks) {
            if (mark < 35) {
                grade = "F";
                studentObject.setGrade(grade);
                return grade;
            }
        }

        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }

        if (sum < 150)
            grade = "C";
        else if (sum < 200)
            grade = "B";
        else if (sum < 250)
            grade = "A";
        else
            grade = "A+";

        studentObject.setGrade(grade);
        return grade;
    }

    public String validate(Student s) throws NullNameException, NullMarksArrayException, NullStudentObjectException {
        if (s == null)
            throw new NullStudentObjectException();
        else if (s.getName() == null)
            throw new NullNameException();
        else if (s.getMarks() == null)
            throw new NullMarksArrayException();
        else
            return "VALID";
    }
}
