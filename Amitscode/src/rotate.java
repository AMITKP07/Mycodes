import java.util.Scanner;

public class rotate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("entr string");
        String s = sc.nextLine();
        String ss = sc.nextLine();

        if(s.length() != ss.length()) {
            System.out.println("not rational");
        }
        else {
            s=s.concat(s);
            if(s.indexOf(ss) != -1) {
                System.out.println("rottional");
            }
            else {
                System.out.println("not");
            }
        }
    }
}
