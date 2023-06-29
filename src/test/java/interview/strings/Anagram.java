package interview.strings;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {
        String s1 = "RACE";
        String s2 = "CAREq";
        char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        boolean result = Arrays.equals(ch1, ch2);
        if (result) {
            System.out.println("It is anagram string");
        } else {
            System.out.println("it is not a anagram string");
        }
    }
}
