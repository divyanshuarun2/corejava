package functionalInterfaces;

import data.Student;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample {
    public static void nameAndGender(){
        BiConsumer<String, String> nameAndGender = (name,gender)->{
            System.out.println("name: "+name+" and gender: "+gender);
        };
        List<Student> studentList = Student.getStudents();
//        for(Student student : studentList){
//            nameAndGender.accept(student.getName(),student.getGender());
//        }
        studentList.forEach((student)->nameAndGender.accept(student.getName(), student.getGender()));

    }
    public static void main(String[] args) {
        BiConsumer<String,String> biConsumer=(a,b)-> System.out.println("a: "+a+", b: "+b);
        biConsumer.accept("java7","java8");

        BiConsumer<Integer,Integer> multiplication = (a,b)->
                System.out.println("multiplication= "+a*b);

        BiConsumer<Integer,Integer> division = (a,b)->
                System.out.println("division= "+a/b);
        //andThenfunction is used to chaining of functional interface
        multiplication.andThen(division).accept(10,5);

        nameAndGender();





    }
}
