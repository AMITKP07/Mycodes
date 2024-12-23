import java.util.Scanner;

public class smlarwords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("entr string");
        String s = sc.nextLine();

        String[] words=s.split(" ");
        String sm=words[0];
        String lar="";
        for(String word: words) {
            if (word.length()>lar.length()) {
                lar=word;
            } else if (word.length()<sm.length()) {
                sm=word;
            }
        }
        System.out.println("largest word="+lar);
        System.out.println("smallest no="+sm);

    }
}
