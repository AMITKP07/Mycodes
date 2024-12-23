import java.util.Scanner;

public class dupiele {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];
        System.out.println("Enter 10 numbers:");

        // Populate the array
        for (int i = 0; i < a.length; i++) {  // Corrected to i < a.length
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < a.length; i++) {
            for(int j=i + 1;j < a.length;j++) {
                if(a[i]==a[j]) {
                    System.out.println(a[j]);
                }
            }
        }
    }
}
