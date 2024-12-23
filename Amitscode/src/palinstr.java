import java.util.Scanner;

public class palinstr {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("entr string");
            String s = sc.nextLine();
        int l=s.length();
        String r="";
        for (int i=l-1;i>=0;--i) {
            r= r+s.charAt(i);
        }
        if((s.toLowerCase()).equals(r.toLowerCase())) {
            System.out.println("Palindrome");
        }
        else {
            System.out.println("not palindrome");
        }
    }
}
