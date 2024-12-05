package Studentgrades;

import java.io.*;
import java.util.*;

public class studentgrades {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("Studentgrades/text.txt"));
        ArrayList<student> students = new ArrayList<>();
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] parts = line.split("\t+");
            if (parts.length < 6) {
                continue;
            }

            String firstName = parts[0].trim();
            String lastName = parts[1].trim();
            String studentNumber = parts[2].trim();
            int gradeLevel = Integer.parseInt(parts[3].trim());
            String course = parts[4].trim();
            int grade = Integer.parseInt(parts[5].trim());

            student existingStudent = findStudentByID(students, studentNumber);
            if (existingStudent != null) {
                existingStudent.addGrade(course, grade);
            } else {
                student newStudent = new student(firstName, lastName, studentNumber, gradeLevel, grade);
                newStudent.addGrade(course, grade);
                students.add(newStudent);
            }

        }
        scanner.close();

        System.out.println("Before sorting:");
        for (student s : students) {
            System.out.println(s.getName());
        }

        // Sort the students by overall grade
        Collections.sort(students);

        System.out.println("\nAfter sorting:");
        for (student s : students) {
            System.out.println(s.getName());

        }

    }

    private static student findStudentByID(ArrayList<student> students, String studentNumber) {
        for (student student : students) {
            if (student.getStudentNumber().equals(studentNumber)) {
                return student;
            }
        }
        return null;
    }
}
