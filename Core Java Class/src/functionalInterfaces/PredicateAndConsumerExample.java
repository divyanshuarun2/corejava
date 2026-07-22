package functionalInterfaces;

import data.Student;

import java.util.List;
import java.util.function.*;

public class PredicateAndConsumerExample {
    // create predicate which fiter out gpa and grade
    //create consumer which will print name and gender if based on predicates value
    //create function to utilize all these implimentation
    Predicate<Student> p1 =(s)->{return s.getGradeLevel()>=2;};
    Predicate<Student> p2 =(s)->{return s.getGpa()>=7;};

    BiPredicate<Integer,Double> biPredicate = (grade,gpa)->grade>=2 && gpa>=7;
    BiConsumer<String,String> bc1 = (name,gender)->{

        System.out.println(name+" "+gender);
    };
    Consumer<Student> c1 = (student)->{
        if(p1.or(p2).test(student)){
        bc1.accept(student.getName(),student.getGender());};
    };

    //using bipredicate to calculate both condition at once
    Consumer<Student> c2 = (student)->{
        if(biPredicate.test(student.getGradeLevel(), student.getGpa())){
            bc1.accept(student.getName(),student.getGender());};
    };

    public void printNameAndGender(List<Student> studentList){
        studentList.forEach(c2);
        studentList.forEach(c1);
        //both will provide same result
    }

    public static void main(String[] args) {
        List<Student> studentList= Student.getStudents();
        new PredicateAndConsumerExample().printNameAndGender(studentList);
    }



}
