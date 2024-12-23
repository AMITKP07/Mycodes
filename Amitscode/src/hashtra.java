import java.util.ArrayList;
import java.util.HashSet;

public class hashtra {
    public static void main(String[] args) {
        HashSet<Integer> a=new HashSet<>();
        a.add(2);
        a.add(7);
        a.add(0);
        a.add(4);
        a.add(5);
        a.add(9);
        for(int i: a) {
            System.out.println(i);
        }
    }
}
