import java.util.Scanner;

public class arycopy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[10];  // Source array
        int[] b = new int[10];  // Destination array

        System.out.println("Enter 10 numbers:");

        // First loop to populate array `a`
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();  // Take input for each element of array `a`
        }

        // Second loop to copy elements from array `a` to array `b`
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }

        System.out.println("Array contents of b:");

        // Print the contents of array `b`
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }

        sc.close();  // Close the scanner
    }
}
