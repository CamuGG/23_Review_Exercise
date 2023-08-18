package Review_exercise;

import java.time.LocalDate;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(123, "Elisa", "Ferrera", LocalDate.of(1993,07,06), Arrays.asList(25, 27, 30, 28));
        Student student2 = new Student(456, "Checco", "Zalone", LocalDate.of(1980,12,05), Arrays.asList(24, 20, 18, 30));

        Professor professor1 = new Professor(123, "Cesare", "Giulio", "Strategia");
        Professor professor2 = new Professor(456, "Tullia", "Cicerone", "Latino");

        /*
        System.out.println("Media voti dello studente è " + student1.calculateGradeAverage());
        System.out.println("Ha una media eccellente ? " + student1.isExcellent());

         */

        Student[] students = {student1, student2};
        Professor[] professors = {professor1, professor2};

        System.out.println("Print excellent students: ");
        for (Student student: students){
            if (student.isExcellent()){
                System.out.println(student.getName() + " " + student.getLastName());
            }
        }

        Student highestStudent = students[0];
        for (Student student : students) {
            if (student.calculateGradeAverage() > highestStudent.calculateGradeAverage()) {
                highestStudent = student;
            }
        }
        System.out.println("Student with highest grade: " + highestStudent.getName() + " " + highestStudent.getLastName());
    }


}
