import java.util.Scanner;

public class vowelconso {
    public static void main(String[] args) {
        int c = 0, v = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("entr string");
        String s = sc.nextLine();
        s=s.toLowerCase();
        for (int i=0; i<s.length();i++) {
            if(s.charAt(i)=='a'|| s.charAt(i)=='e'|| s.charAt(i)=='i'|| s.charAt(i)=='o'|| s.charAt(i)=='u') {
                v++;
            }
            else {
                if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                    c++;
                }
            }
        }
        System.out.println("no of vowel="+v);
        System.out.println("no of consonents="+c);
    }
}
