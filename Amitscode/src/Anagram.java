import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("entr string");
        String s1 = sc.nextLine();
        String s = sc.nextLine();
        s1 = s1.toLowerCase();
        s = s.toLowerCase();
        if(s1.length() != s.length()) {
            System.out.println("both are not anagram");
        }
        else {
            char[] c1=s1.toCharArray();
            char[] c2=s.toCharArray();
            Arrays.sort(c1);
            Arrays.sort(c2);

            if(Arrays.equals(c1,c2)==true) {
                System.out.println("anagram");

            }
            else {
                System.out.println("not anagram");
            }
        }
    }
}
