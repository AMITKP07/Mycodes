import java.util.Scanner;

public class LongestRepeatingSequence {
    public static String lcp(String s, String t) {
        int n = Math.min(s.length(), t.length());
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) != t.charAt(i)) {
                return s.substring(0, i);
            }
        }
        return s.substring(0, n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("entr string");
        String str = sc.nextLine();
        String ser = "";
        int l = str.length();
        for (int i = 0; i < l; i++) {
            for (int j = i + 1; j < l; j++) {
                String x = lcp(str.substring(i, l), str.substring(j, l));
                if (x.length() > ser.length()) {
                    ser = x;
                }
            }

        }
        System.out.println("repeat sequnce=" + ser);
    }
}
