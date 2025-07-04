package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.*;

public class StreamDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2000);
        list.add(3000);
        list.add(5000);
        list.add(6000);
        list.add(21000);
        list.add(26000);
        list.add(56000);

//        int count=0;
//        for(Integer sal:list){
//            if(sal>3000){
//                count++;
//            }
//        }
        // using stream api
        //m1
        Long count = list.stream().filter((sal) -> sal > 3000).count();
        System.out.println("salary greater than 3000 is :" + count);


        //m2
        Integer arr[] = {1, 2, 3, 4};
        Stream<Integer> stream = Arrays.stream(arr);
        long ans = stream.count();
        System.out.println(ans);

        //m3
        Stream<Integer> num = Stream.of(10, 21, 20, 50, 60, 70);
        long count1 = num.filter((a) -> a % 2 == 0).count();
        System.out.println(count1);

        //m4
        Stream.Builder<Integer> streambuilder = Stream.builder();
        streambuilder.add(897);
        streambuilder.add(123221);
        streambuilder.add(1342);
        streambuilder.add(1234);
        Stream<Integer> stam = streambuilder.build();
        List<Integer> collect = stam.filter((a) -> a % 2 != 0).collect(Collectors.toList());

    }
}
