import java.util.*;

public class hashsortv {
    public static void main(String[] args) {
        HashMap<String, Integer> a = new HashMap<>();
        a.put("car", 7);
        a.put("truck", 6);
        a.put("bus", 4);
        a.put("flight", 5);

        List<Map.Entry<String, Integer>> as= new ArrayList<>(a.entrySet());
        as.sort(Map.Entry.comparingByValue());

        LinkedHashMap<String, Integer> sort= new LinkedHashMap<>();
        for (Map.Entry<String, Integer> i:as) {
            sort.put(i.getKey(), i.getValue());
        }
        System.out.println("sorted");
        for (Map.Entry<String, Integer> i : sort.entrySet()) {
            System.out.println(i.getKey()+" "+i.getValue());
        }
    }
}
