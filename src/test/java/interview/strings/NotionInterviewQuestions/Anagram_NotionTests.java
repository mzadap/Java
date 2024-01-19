package interview.strings.NotionInterviewQuestions;

import java.util.Arrays;

public class Anagram_NotionTests {

    public static void main(String[] args) {
        /*
        * Program of anagram which means that one string by arranging the characters of another string
        * */

        String s1 = "Race";
        String s2 = "Care";
        char[] c1 = s1.toLowerCase().toCharArray();
        char[] c2 = s2.toLowerCase().toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        boolean result = Arrays.equals(c1, c2);
        if (result) {
            System.out.println("It is anagram string");
        } else {
            System.out.println("It is not anagram string");
        }
    }
}
