package labdaanonymus;

import java.util.Arrays;
import java.util.Comparator;

public class Comparate {
    public static void main(String[] args) {
        String[] ar={"Amir","Ansul","Murli","Papu","Chotu"};

        Arrays.sort(ar, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });
        System.out.println(Arrays.toString(ar));
    }
}
