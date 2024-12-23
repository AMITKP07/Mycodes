import java.util.*;
public class printprime {
    public static boolean isprime(int nm) {
        if(nm <= 1) {
            return false;
        }
        for(int i=2; i <= Math.sqrt(nm); i++) {
            if(nm % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int n=sc.nextInt();
        for(int i=2; i <=n ;i++) {
            if(isprime(i)) {
                System.out.print(i +" ");
            }
        }
    }
}
