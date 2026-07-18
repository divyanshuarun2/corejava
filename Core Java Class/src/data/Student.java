package data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Student {
    private String name;
    private int gradeLevel;
    private double gpa;
    private String gender;

    public Student(String gender, double gpa, int gradeLevel, String name) {
        this.gender = gender;
        this.gpa = gpa;
        this.gradeLevel = gradeLevel;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getGradeLevel() {
        return gradeLevel;
    }

    public double getGpa() {
        return gpa;
    }

    public String getGender() {
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGradeLevel(int gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    public static List<Student> getStudents(){
        Student s1= new Student("Male",9.5,1,"Osho");
        Student s2= new Student("Male",8.5,1,"shravan");
        Student s3= new Student("Male",7.5,2,"Sweta");
        Student s4= new Student("Male",6.5,2,"Prachi");
        Student s5= new Student("Male",6.65,3,"Amit");
        return Arrays.asList(s1,s2,s3,s4,s5);
    }
    public String toString(){
        return "Students{"+
                "name:"+name+","+"gradeLevel:"+gradeLevel+","+"gpa: "+gpa+","+"gender: "+gender+"}";
    }
}
