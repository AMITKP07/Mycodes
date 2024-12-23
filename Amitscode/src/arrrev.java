import java.util.Scanner;

public class arrrev {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];
        System.out.println("Enter 5 numbers:");

        // Populate the array
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        // Print array in original order
        System.out.println("Array contents:");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

        // Print array in reverse order
        System.out.println("\nArray in reverse:");
        for (int i = a.length - 1; i >= 0; i--) {
            System.out.print(a[i] + " ");
        }

        sc.close(); // Close the scanner
    }
}
