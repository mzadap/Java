package codechef;

import java.util.Arrays;

public class Wordle {

    public static void main(String[] args) {
        String s = "ROUND";
        String t = "RINGS";
        String m ="";

        for (int i = 0; i<s.length();i++) {
            if (s.charAt(i) == t.charAt(i)) {
                m +=  "G";
            } else {
                m += "B";
            }
        }
        System.out.println(m);
    }
}
