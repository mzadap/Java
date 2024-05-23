package interview.strings.days100.strings;

import java.util.Arrays;

public class Splists {

    public static void main(String[] args) {
        String s = "ab-cd@#$%%Z^^";
        String s2 = s.replaceAll("[^a-zA-Z]+", "");
        System.out.println(s2);
        String s1 = "";
        for (int i = s2.length()-1; i>=0; i--) {
            s1 += s2.charAt(i);
        }
        System.out.println(s1);
    }
}
