import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class hashmapsortk {
    public static void main(String[] args) {
        HashMap<String, Integer> a = new HashMap<>();
        a.put("car", 7);
        a.put("truck", 6);
        a.put("bus", 4);
        a.put("flight", 5);

        TreeMap<String, Integer> sm=new TreeMap<>(a);

        System.out.println("sorted");
        for (Map.Entry<String, Integer> as: sm.entrySet()) {
            System.out.println(as.getKey()+" "+as.getValue());
        }

    }
}
