package streamapi;

import java.util.List;
import java.util.stream.Collectors;

public class Method {
    public static void main(String[] args) {

        List<String> names = List.of("Amit","Deepak","Dipu","Durg");
        List<String> newnm = names.stream().filter(e -> e.startsWith("D")).collect(Collectors.toList());
        System.out.println(newnm);

        List<Integer> number = List.of(8,67,75,98,34,8);
        List<Integer> nms = number.stream().map(i ->i*i).collect(Collectors.toList());
        System.out.println(nms);

        number.stream().sorted().forEach(System.out::println);

        Integer integer = number.stream().min((x,y) -> x.compareTo(y)).get();
        System.out.println("min="+integer);

        Integer integer1 = number.stream().max((x,y) -> x.compareTo(y)).get();
        System.out.println("min="+integer1);


    }
}
