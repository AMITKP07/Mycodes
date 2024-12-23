import java.util.ArrayList;
import java.util.Comparator;

class students {
    private String name;
    private int age;

    students(String name, int age) {
    this.name=name;
    this.age=age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    public String toString() {
        return "student{name='"+  name + "'age" + age + '}';
    }
}
public class camparat {
    public static void main(String[] args) {
        ArrayList<students> a=new ArrayList<>();
        a.add(new students("addf",87));
        a.add(new students("tyu",56));
        a.add(new students("werd",34));

        System.out.println("before sort");
        for (students i:a)
            System.out.println(i);

        a.sort(Comparator.comparing(students::getName));
        System.out.println("After sort");

        for (students i:a)
            System.out.println(i);
    }
}
