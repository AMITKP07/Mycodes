import java.util.*;
public class primech {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        boolean isprime = true;

        if(n <= 1) {
            isprime = false;
        }
        else {
            for(int i=2; i <=Math.sqrt(n); i++) {
                if(n%i == 0)
                    isprime=false;
            }
        }
        if(isprime) {
            System.out.println("prime no");
        }
        else {
            System.out.println("not prime");
        }
    }
}
