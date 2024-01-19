package interview.strings.days100;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CountOccurance {

    /*
     * 100 Days challenge, Day 12
     * Date - 12/09/2023
     *  Write a program in Java to count occurrence of a given character in a String?
     * */

    public static void main(String[] args) {
        String s1 = "nachiket";
        char[] c1 = s1.toCharArray();
        Map<String, java.lang.Integer> map = new HashMap<>();
        char c2 = 'a';
        int count = 0;
        for (int i = 0; i< c1.length; i++) {
            if (c1[i]==c2) {
                count++;
            }
        }
        System.out.println(count);
    }
}
