import java.util.Scanner;

public class Palin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int n = sc.nextInt();
        int sum = 0,temp=n;
        while (n != 0) {
            sum = (sum * 10) + (n % 10);
            n = n / 10;
        }
        if(sum == temp) {
            System.out.println("palindrome no");
        }
        else {
            System.out.println("not palindrome");
        }
    }

}
