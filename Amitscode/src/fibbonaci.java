import java.util.*;
public class fibbonaci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int f=0,l=1;
        System.out.println("enter total no of elements=");
        int n= sc.nextInt();
        System.out.println(f);
        System.out.println(l);
        for(int i=2 ;i <= n;i++) {
            int m = f + l;
            System.out.println(m);
            f=l;
            l=m;
        }
    }
}
