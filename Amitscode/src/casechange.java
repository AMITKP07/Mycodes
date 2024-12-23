import java.util.Scanner;

public class casechange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("entr string");
        String s = sc.nextLine();

        StringBuilder r=new StringBuilder();
        for (char c: s.toCharArray()) {
            if (Character.isLowerCase(c)) {
                r.append(Character.toUpperCase(c));
            }
            else if (Character.isUpperCase(c)) {
                r.append(Character.toLowerCase(c));
            }
            else
            {
                r.append(c);
            }
        }
        System.out.println("String new");
        System.out.println(r.toString());
    }


}
