import java.util.Scanner;

public class removedupli {
    public static int dupli(int a[], int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int t[] = new int[n];
        int j = 0;
        for (int i = 0; i < n-1; i++) {
            if (a[i] != a[i + 1]) {
                t[j++] = a[i];
            }
        }
            t[j++] = a[n-1];

        for (int i = 0; i < j; i++) {
            a[i] = t[i];
        }
        return j;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ar = new int[8];
        System.out.println("Enter 5 numbers:");
        // Populate the array
        for (int i = 0; i < ar.length; i++) {
            ar[i] = sc.nextInt();
        }
        int length=dupli(ar,ar.length);
        for (int i = 0; i < length; i++) {
            System.out.print(ar[i] + " ");
        }
    }
}