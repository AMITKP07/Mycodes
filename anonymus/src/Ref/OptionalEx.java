package Ref;

import java.util.Optional;

public class OptionalEx {
    String name;

    public static Optional<String> getName() {
        String name="AMIT KUMAR PARHI";
        return Optional.ofNullable(name);
    }

    public static void main(String[] args) {


        String str = null;

        Optional<String> optional = Optional.ofNullable(str);
        System.out.println(optional.isPresent());
       // System.out.println(optional.get());
        System.out.println(optional.orElse("no one"));

        Optional<String> nm = getName();
        System.out.println(nm.orElse("nothing"));

    }
}
