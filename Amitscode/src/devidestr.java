import java.util.Scanner;

public class devidestr {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("entr string");
        String s = sc.nextLine();
        s = s.toLowerCase();
        int l=s.length();
        int n=3,temp=0;
        int chars=l/n;
        String[] a= new String[n];
        if(l % n != 0) {
            System.out.println("cannot be divided");
        }
        else {
            for (int i=0; i<l;i+=chars) {
                String part =s.substring(i,i+chars);
                a[temp]=part;
                temp++;
            }
            System.out.println(n+"no of halves");
            for (int i=0; i<a.length; i++) {
                System.out.println(a[i]);
            }
        }
    }
}
