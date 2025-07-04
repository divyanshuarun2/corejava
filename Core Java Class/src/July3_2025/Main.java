package July3_2025;

import MethodPT2_2July.A;

import java.util.SortedMap;

public class Main {
    public static void main(String[] args) {
       AbstractClassDemo obj = new AbstractClassDemo() {
           @Override
           public int getData(){
               return 10;
           }
           @Override
           public void print(){
               System.out.println("printed : "+getData());

           }

       };
        System.out.println(obj.getClass());
        obj.print();
        InterfaceDemo interfaceDemo= new InterfaceDemo() {
            @Override
            public void prinInterface() {
                System.out.println("I love you bata ji");
            }
        };
        System.out.println("\ninterface data");
        System.out.println(interfaceDemo.getClass());
        System.out.println(interfaceDemo.hashCode());
    }
}
