import java.util.Scanner;

public class dupliwords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("entr string");
        String s = sc.nextLine();
        int c=0 ;
        s = s.toLowerCase();
        String[] words = s.split(" ");
        System.out.println("Duplicative string");
        for (int i=0; i<words.length; i++) {
            c=1;
            for (int j=i+1; j<words.length; j++ ) {
                if(words[i].equals(words[j])) {
                    c++;
                    words[j]="0";
                }
            }
            if(c>1 && words[i] != "0") {
                System.out.println(words[i]);
            }
        }
    }
}
