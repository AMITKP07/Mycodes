import java.util.Scanner;

public class primeno {
    public static void main(String[] args) {
        int f = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                f++;  // Count the divisors of n
            }
        }

        // Prime numbers have exactly 2 divisors: 1 and itself
        if (f == 2) {
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is not a prime number.");
        }

        sc.close();  // Close the scanner
    }
}