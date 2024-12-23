import java.util.Scanner;

public class charactercount {
    public static void main(String[] args) {
        int c=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("entr string");
        String s = sc.nextLine();
        for (int i=0; i<s.length();i++) {
            if(s.charAt(i)!=' ') {
                c++;
            }
        }
        System.out.println("total characters="+c);
    }
}
