package Review_exercise;

import java.time.LocalDate;
import java.util.List;

public class Student {
    private int idStudent;
    private String name;
    private String lastName;
    private LocalDate dateOfBirth;
    private List<Integer> grades;


    public int getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(int idStudent) {
        this.idStudent = idStudent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public List<Integer> getGrades() {
        return grades;
    }

    public void setGrades(List<Integer> grades) {
        this.grades = grades;
    }

    public Student(int idStudent, String name, String lastName, LocalDate dateOfBirth, List<Integer> grades){
        this.idStudent = idStudent;
        this.name = name;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.grades = grades;
    }
    public Student(int idStudent, String name, String lastName, LocalDate dateOfBirth){
        this.idStudent = idStudent;
        this.name = name;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }

    public double calculateGradeAverage(){
        if( grades == null){
            return 0;
        }
        int sumGrades = 0;
        for (int i: grades) {
            sumGrades +=i;
        }
        return sumGrades / grades.size();
    }

    public boolean isExcellent(){
        return calculateGradeAverage() >=18;
    }



}
