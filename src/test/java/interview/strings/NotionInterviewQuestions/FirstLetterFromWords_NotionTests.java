package interview.strings.NotionInterviewQuestions;

import java.util.Arrays;

public class FirstLetterFromWords_NotionTests {

    public static void main(String[] args) {
        String s = "Nachiket Zadap";
        /*char[] c = s.toCharArray();
        for (int i = 0; i< c.length; i++) {
            //System.out.println(c[0]);
            if (c[i] == ' ' *//*&& c[i] != ' '*//*) {
                System.out.println(c[i+1]);
                break;
            }
        }*/
        String[] c = s.split(" ");
        System.out.println(Arrays.toString(c));
        for (int i =0; i< c.length; i++) {
            if (!c[i].equals("")) {
                System.out.println(c[i].charAt(0));
            }
        }
    }
}
