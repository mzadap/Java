package interview.strings.days100.strings;

import java.util.Arrays;

public class Reveriit {

    public static void main(String[] args) {
        String[] s = {"java", "abcd", "ajav", "xyz", "bcda"};
        for (int i =0; i<s.length; i++) {
            for (int j = i+1; j<s.length; j++) {
                if (hasRepeated(s[i], s[j])) {
                    System.out.println(s[i] + " has equal with " + s[j] + " same character");
                }
            }
        }
    }

    static boolean hasRepeated(String str1, String str2) {
        char[] c1 = str1.toCharArray();
        char[] c2 = str2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        return Arrays.equals(c1, c2);
    }
}
