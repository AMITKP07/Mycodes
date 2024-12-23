import java.util.Scanner;

public class reversesent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("entr string");
        String a = sc.nextLine();
        String[] s=a.split("\\s+");
        StringBuilder scc=new StringBuilder();
        for (int i= s.length-1;i>=0;i--) {
            scc.append(s[i]);
            if( i!=0 ) {
                scc.append(" ");
            }

        }
        System.out.println(scc);
    }

}
