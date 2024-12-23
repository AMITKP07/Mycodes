import java.util.Scanner;

public class Amstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int n = sc.nextInt();

        int temp = n, c = 0, orino = n, sum = 0;
        while (temp > 0) {
            temp = temp / 10;
            c++;
        }
        temp = n;
        while (temp > 0) {
            int d = temp % 10;
            sum += Math.pow(d, c);
            temp = temp / 10;
        }
        if ( sum==orino) {
            System.out.println("amstrong");
        } else {
            System.out.println("not amstrong");

        }
    }
}
