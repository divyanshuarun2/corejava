package functionalInterfaces;

import java.util.function.Predicate;

public class PredicateExample {

    static Predicate<Integer> isEven = (a)->a%2==0;
    static Predicate<Integer> isOdd = (a)->a%2!=0;
    static Predicate<Integer> isfiveMultiple = (a)->a%5==0;
    static public void predicateAnd(){
        System.out.println(isEven.and(isfiveMultiple).test(100));
    }
    static public void predicateOr(){
        System.out.println(isEven.or(isOdd).test(100));
    }
    static public void predicateNegate(){
        System.out.println(isEven.or(isOdd).negate().test(100));
    }

    public static void main(String[] args) {
        System.out.println("predicate and result");
        predicateAnd();
        System.out.println("predicate or result");
        predicateOr();
        System.out.println("predicate or Negate");
        predicateNegate();


    }
}
