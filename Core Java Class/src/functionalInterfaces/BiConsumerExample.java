package functionalInterfaces;

import java.util.function.BiConsumer;

public class BiConsumerExample {
    public static void main(String[] args) {
        BiConsumer<String,String> biConsumer=(a,b)-> System.out.println("a: "+a+", b: "+b);
        biConsumer.accept("java7","java8");

        BiConsumer<Integer,Integer> multiplication = (a,b)->
                System.out.println("multiplication= "+a*b);

        BiConsumer<Integer,Integer> division = (a,b)->
                System.out.println("division= "+a/b);

        multiplication.andThen(division).accept(10,5);



    }
}
