import java.util.Scanner;

public class subset {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("entr string");
        String s = sc.nextLine();
        int l = s.length();
        s = s.toLowerCase();
        int temp=0;
        String[] a = new String[(l*(l+1))/2];
        for (int i=0;i<l;i++) {
            for(int j=i;j<l;j++) {
                a[temp]=s.substring(i,j+1);
                temp++;
            }
        }
        for (int i=0;i<a.length;i++) {
            System.out.println(a[i]);
        }
    }
}
