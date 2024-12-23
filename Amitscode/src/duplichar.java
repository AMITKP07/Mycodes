import java.util.Scanner;

public class duplichar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("entr string");
        String s = sc.nextLine();
        int c=0;
        char[] str=s.toCharArray();
        for (int i=0;i<str.length;i++) {
            c=1;
            for (int j=i+1;j<str.length;j++) {
                if(str[i] == str[j] && str[i] != ' ') {
                    c++;
                    str[j]='0';
                }
            }
            if(c>1 && str[i] != '0') {

                System.out.println(str[i]);
            }
        }
    }

}
