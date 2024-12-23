package streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamObject {
    public static void main(String[] args) {

        //black
        Stream<Object> empstream = Stream.empty();

        //Array
        String names[] = {"dipu","unar","Aditi","ross"};
        Stream<String> stream1 = Stream.of(names);
        stream1.forEach(e -> { System.out.println(e);
        });

        //builder
        Stream<Object> streambuilder = Stream.builder().build();

        //Arraystream
        IntStream stream = Arrays.stream(new int[] {3,8,7,6,0});

        //list or set
        List<Integer> list1 =new ArrayList<Integer>();
        list1.add(45);
        list1.add(56);
        list1.add(58);
        list1.add(65);

        Stream<Integer> stream2 =list1.stream();
        stream2.forEach(e -> {System.out.println(e);
        });
    }
}
