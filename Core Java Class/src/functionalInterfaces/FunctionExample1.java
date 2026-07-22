package functionalInterfaces;

import static functionalInterfaces.FunctionExample.addSomeString;

public class FunctionExample1 {
    public static String performConcate(String str){
        return FunctionExample.f1.andThen( addSomeString).apply(str);

    }
    public static void main(String[] args) {
        System.out.println(performConcate("hello"));
    }
}
