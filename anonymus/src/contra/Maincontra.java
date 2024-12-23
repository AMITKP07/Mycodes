package contra;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Maincontra {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Will","yash","tim","'Lunal");

        List<Person> people =names.stream().map(Person::new).collect(Collectors.toList());

        people.forEach(person -> System.out.println("the name is="+ person.getName()));
    }
}
