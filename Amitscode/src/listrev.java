import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class listrev {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(3);
        a.add(2);
        a.add(4);
        a.add(5);
        a.add(9);

        System.out.println("before sort");
        for (int i: a) {
            System.out.println(i);
        }
        Collections.sort(a, Collections.reverseOrder());

        System.out.println("before sort");
        for (int i: a) {
            System.out.println(i);
        }
    }
}
