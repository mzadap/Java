package interview.strings.days100.strings;

import java.util.Arrays;

public class Anagram {

    /*
     * 100 Days challenge, Day 13
     * Date - 13/09/2023
     *  Write a program in Java to check if two String are Anagram.
     * */

    public static void main(String[] args) {
        String s1 = "nachiket";
        String s2 = "zadap";
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        boolean result = Arrays.equals(c1, c2);
        if (result) {
            System.out.println("It is a anagram string");
        } else {
            System.out.println("it is not anagram string");
        }
    }
}
