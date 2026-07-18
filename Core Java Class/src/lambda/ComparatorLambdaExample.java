package lambda;

import java.util.Comparator;

public class ComparatorLambdaExample{
    public static void main(String[] args) {
        //ananomous class
       Comparator<Integer> comparator = new Comparator<Integer>(){
           @Override
                  public int compare(Integer o1,Integer o2){
               return o1.compareTo(o2); //0==>o1==o2
                                        //1==>o1>o1
                                        //-1==>o1<o2
            }
        };
        System.out.println("Result using ananomous object refrence "+comparator.compare(3,2));

        //lambda
        Comparator<Integer> comparatorLambda=(a,b)->  a.compareTo(b);
        System.out.println("Result using lambda "+comparatorLambda.compare(3,2));

    }
}
