package interview.strings.NotionInterviewQuestions;

import java.util.Arrays;

public class NumberOfWordsInString_NotionTests {

    public static void main(String[] args) {
        String s = "This is new world of AI";
        String[] l = s.split(" ");
        System.out.println(l.length);
        /*char[] c = s.toCharArray();
        System.out.println(Arrays.toString(c));
        int count = 0;
        for (int i =0; i<=c.length-1;i++) {
            if (c[i]==' ' && c[i+1]!=' ') {
                count++;
            }
        }*/
        int count=1;
        for (int i = 0; i<s.length(); i++) {
            if (s.charAt(i)==' ' && s.charAt(i+1)!=' ') {
                count++;
            }
        }
        System.out.println(count);

    }
}