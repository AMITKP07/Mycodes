import java.util.ArrayList;
import java.util.Scanner;

public class heakal {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(2);
        a.add(4);
        a.add(5);
        a.add(9);
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int n= sc.nextInt();

        if(a.contains(n)) {
            System.out.println("found");
        }
        else {
            System.out.println("not");
        }
    }
}
