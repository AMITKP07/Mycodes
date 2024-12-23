import java.util.HashMap;

public class hasmap {
    public static void main(String[] args) {
        HashMap<String,String> a = new HashMap<String,String>();
        a.put("car","Petrol");
        a.put("truck","diesel");
        a.put("bus","diesel");
        a.put("flight","Gasoline");

        for(String i: a.keySet()) {
            System.out.println(i +" "+ a.get(i));
        }
    }
}
