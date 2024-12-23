import java.util.Scanner;

public class tranpose {
    public static void main(String[] args) {
        int cols,rows;
        Scanner sc = new Scanner(System.in);
        int ar[][] = new int[3][3];
        cols=ar.length;
        rows=ar[0].length;
        int t[][]=new int[cols][rows];
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i<rows ; i++) {
            for (int j = 0; j < cols; j++) {
                ar[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i<rows ; i++) {
            for (int j = 0; j < cols; j++) {
                t[i][j]=ar[j][i];
            }
        }
        System.out.println("transpose matrix");
        for (int i = 0; i<cols ; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(t[i][j]);
            }
            System.out.println();
        }
    }
}
