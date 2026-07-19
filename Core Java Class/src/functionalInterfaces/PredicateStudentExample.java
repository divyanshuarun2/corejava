package functionalInterfaces;

import data.Student;

import java.util.List;
import java.util.function.Predicate;

public class PredicateStudentExample {
    static Predicate<Student> p1=(student)-> {
        return student.getGradeLevel()>=2;};

    static Predicate<Student> p2=(student)-> {
        return student.getGpa()>=7;};

    public static void filterStudentOnGrade(){
        List<Student> studentList = Student.getStudents();

            studentList.forEach((student)->{
                if (p1.test(student)) {

                    System.out.println(student.toString());
                }
            });


    }
    public static void filterStudentOnGpa(){
        List<Student> studentList = Student.getStudents();

        studentList.forEach((student)->{
            if (p2.test(student)) {

                System.out.println(student.toString());
            }
        });


    }
    public static void filterStudentOnGpaandGrade(){
        List<Student> studentList = Student.getStudents();

        studentList.forEach((student)->{
            if (p1.and(p2).negate().test(student)) {

                System.out.println(student.toString());
            }
            else{
                System.out.println(student.toString());
            }
        });


    }
    public static void main(String[] args) {
        System.out.println("fitering on Grande>=2");
        filterStudentOnGrade();
        System.out.println("fitering on gpa>=7");
        filterStudentOnGpa();
        System.out.println("fitering on Grande>=2 and Gpa>=7");
        filterStudentOnGpaandGrade();
    }
}
