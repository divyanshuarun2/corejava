package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.*;
import java.util.stream.Stream;

public class StreamDemo2 {
    public static void main(String[] args) {

        Integer arr[] = {1, 2, 3, 4,4,4,4,4,4,5,5,0,5,5,5};
       // List<Integer> collect = Arrays.stream(arr).distinct().peek((Integer i)-> System.out.println(i)).collect(Collectors.toList());

        //toArray
        System.out.println("toArray()");
         Object [] ans = Arrays.stream(arr).distinct().filter((a)->a>2)
                 .toArray();
        System.out.println(Arrays.toString(ans));

         //foreach
        System.out.println("forEach(a)->sout");
         Arrays.stream(arr).distinct().forEach((a)-> System.out.print(a+", "));
        System.out.println();

         ///toArray with specific type of array
        System.out.println("toArray(size)->new Integer[size]");
        Integer[] intarr= Arrays.stream(arr).distinct().filter((a)->a>3).toArray((size)->new Integer[size]);

        System.out.println(Arrays.toString(intarr));

        System.out.println("reduce(a,b)->a+b");
       Optional<Integer> reduce =  Arrays.stream(arr).distinct().reduce((a, b)->a+b);
        System.out.println(reduce);




    }
}
