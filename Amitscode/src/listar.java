import java.util.ArrayList;
import java.util.List;

public class listar {
    public static void main(String[] args) {
        ArrayList<Integer> a=new ArrayList<>();
        a.add(3);
        a.add(2);
        a.add(4);
        a.add(5);
        a.add(9);

        int[] s=new int[a.size()];
        for (int i=0;i<s.length;i++) {
            s[i]=a.get(i);
        }
        for (int j:s) {
            System.out.println(j);
        }

    }
}
