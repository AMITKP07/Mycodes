import java.util.ArrayList;

public class traveral {
    public static void main(String[] args) {
        ArrayList<Integer> a=new ArrayList<Integer>();
        a.add(2);
        a.add(4);
        a.add(5);
        a.add(9);
        for(int i: a) {
            System.out.println(i);
        }
    }
}
