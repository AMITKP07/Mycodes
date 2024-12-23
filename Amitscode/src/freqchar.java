import java.util.Scanner;

public class freqchar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("entr string");
        String s = sc.nextLine();

        int fr[] = new int[s.length()];
        char[] ch=s.toCharArray();
        for (int i=0;i<ch.length;i++) {
            fr[i]=1;
            for (int j=i+1;j<ch.length;j++) {
                if(ch[i]==ch[j]) {
                    fr[i]++;
                    ch[j]='0';
                }
            }
            if(fr[i]>1 && ch[i]!='0') {
                System.out.println(ch[i]+"-"+fr[i]);
            }
        }
    }
}
