import java.util.Scanner;

public class oddeve {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];
        System.out.println("Enter 5 numbers:");

        // Populate the array
        for (int i = 0; i < a.length; i++) {  // Corrected to i < a.length
            a[i] = sc.nextInt();
        }
        System.out.println("odd no");
        for (int i = 0; i < a.length; i++) {
            if(a[i]%2 != 0) {
                System.out.println(a[i]);
            }
        }
        System.out.println("even no");
        for (int i = 0; i < a.length; i++) {
            if(a[i]%2 == 0) {
                System.out.println(a[i]);
            }
        }
    }
}
