package methods;

public class Demo {
    public static void main(String[] args) {
        Person p1= new Person();
        p1.getName();
        p1.getAge();
        p1.age=100;
        System.out.println(p1.age+", "+Person.age);

    }
}
