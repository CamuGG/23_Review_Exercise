package Review_exercise;

import java.util.ArrayList;
import java.util.List;

public class Professor {
    private int idProfessor;
    private String name;

    private String surName;

    private String nameCourse;


    public Professor(int idProfessor, String name, String surName, String nameCourse) {
        this.idProfessor = idProfessor;
        this.name = name;
        this.surName = surName;
        this.nameCourse = nameCourse;
    }

    public Professor(int idProfessor, String name, String surName) {
        this.idProfessor = idProfessor;
        this.name = name;
        this.surName = surName;
    }

    public void assignGrade(Student student, int grade){
        List<Integer> listGrades = student.getGrades();
        if (grade >= 18){
            listGrades.add(grade);
            student.setGrades(listGrades);
        } else {
            System.out.println(student.getLastName() + " " + student.getName() + " failed the exam");
        }
    }
}
