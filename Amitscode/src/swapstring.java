import java.util.Scanner;

public class swapstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("entr string");
        String a = sc.nextLine();
        String  b = sc.nextLine();
        a=a+b;
        b=a.substring(0,(a.length()-b.length()));
        a=a.substring(b.length());
        System.out.println(a);
        System.out.println(b);

    }
}
