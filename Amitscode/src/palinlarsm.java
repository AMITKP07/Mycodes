import java.util.Scanner;

public class palinlarsm {
    public static boolean ispalin(String n) {
        int start = 0, end = n.length() - 1;
        while (start < end) {
            if (n.charAt(start) != n.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("entr string");
        String a = sc.nextLine();
        String[] w = a.split("\\s+");
        String lar = null, sm = null;
        for (String i : w) {
            if (ispalin(i)) {
                if (sm == null || i.length() < sm.length()) {
                    sm = i;

                }
                if (lar == null || i.length() > lar.length()) {
                    lar = i;
                }
            }

        }
        if (sm != null) {
            System.out.println("largest palindrome=" + lar);
            System.out.println("smallest palindrome=" + sm);
        } else {
            System.out.println("no palindrome");
        }
    }
}

