package Studentgrades;

import java.util.ArrayList;

public class student implements Comparable<student> {
    private String firstName;
    private String lastName;
    private String studentNumber;
    private int gradeLevel;
    private ArrayList<Grade> grades;

    public student(String firstName, String lastName, String studentNumber, int gradeLevel, int grade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentNumber = studentNumber;
        this.gradeLevel = gradeLevel;
        this.grades = new ArrayList<>();
    }

    public String getName() {
        return firstName + lastName;
    }

    public int getGradeLevel() {
        return gradeLevel;
    }

    public void addGrade(String course, int grade) {
        grades.add(new Grade(course, grade));
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public double getOverallGrade() {
        int sum = 0;
        for (Grade x : grades) {
            sum += x.getGrade();
        }
        return (double) sum / grades.size();
    }

    public String getLetterGrade() {
        if (getOverallGrade() > 90) {
            return "A";
        } else if (getOverallGrade() > 80) {
            return "B";
        } else if (getOverallGrade() > 70) {
            return "C";
        } else if (getOverallGrade() > 60) {
            return "D";
        } else {
            return "F";
        }
    }

    @Override
    public int compareTo(student other) {
        return Double.compare(this.getOverallGrade(), other.getOverallGrade());
    }

}
