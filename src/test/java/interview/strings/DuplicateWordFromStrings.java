package interview.strings;

import java.util.Arrays;

public class DuplicateWordFromStrings {

    /*
    * Write a program to find duplicate words from a given string.
    * */
    public static void main(String[] args) {

        String s1 = "i am a very very good programining java java";
        String[] s2 = s1.split(" ");
        System.out.println(Arrays.toString(s2));
        for (int i = 0; i<s2.length; i++) {
            for (int j = i+1; j<s2.length; j++) {
                if (s2[i].equals(s2[j])) {
                    System.out.print(s2[j] + " ");
                }
            }
        }

    }
}
