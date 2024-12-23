package streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain1 {
    public static void main(String[] args) {

        List<Integer> list = List.of(6, 45, 66, 44, 78);

        List<Integer> list1 =new  ArrayList<Integer>();
        list1.add(45);
        list1.add(56);
        list1.add(58);
        list1.add(65);

        List<Integer> list2 = Arrays.asList(7, 86, 45, 33, 23, 68);

        //wihout stream
        List<Integer> listeven = new ArrayList<>();
        for(Integer i: list) {
            if(i % 2== 0) {
                listeven.add(i);
            }

        }
       // System.out.println(list);
        System.out.println(list1);
//        System.out.println(list2);
//        System.out.println(listeven);
        //stream
        Stream<Integer> stream = list1.stream();
//        List<Integer> even = stream.filter(i -> i % 2 == 0).collect(Collectors.toList());
//        System.out.println(even);

        List<Integer> lar = stream.filter(i -> i > 50).collect(Collectors.toList());
        System.out.println(lar);
    }
}
