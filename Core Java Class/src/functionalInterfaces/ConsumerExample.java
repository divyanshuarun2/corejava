package functionalInterfaces;

import data.Student;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

    public static void printStudnets(){
        Consumer<Student>c2 = (student)-> System.out.println(student.toString());
        List<Student> studentList = Student.getStudents();
        studentList.forEach(c2);
    }
    public static void printNameAndGender(){
        Consumer<Student>c3 = (student)-> System.out.print(student.getName()+": ");
        Consumer<Student>c4 = (student)-> System.out.println(student.getGender());
        List<Student> studentList = Student.getStudents();
        studentList.forEach((student)->c3.andThen(c4).accept(student));
    }
    public static void printNameAndGenderWithCondition(){
        Consumer<Student>c3 = (student)-> System.out.print(student.getName()+": ");
        Consumer<Student>c4 = (student)-> System.out.println(student.getGender());
        List<Student> studentList = Student.getStudents();

        studentList.forEach((student) -> {
            if(student.getGradeLevel()>2){
        c3.andThen(c4).accept(student);}
        });
    }
    public static void main(String[] args) {
        //takes something but return nothing
        Consumer<String> c1= (s)-> System.out.println(s.toUpperCase());

        c1.accept("java8");
        printStudnets();
        //printNameAndGender();
        printNameAndGenderWithCondition();

    }
}
