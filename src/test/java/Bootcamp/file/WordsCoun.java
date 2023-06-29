package Bootcamp.file;

import java.util.Arrays;

public class WordsCoun {

    public static void main(String[] args) {
        String s1 = "This is new word";
        /*String s2 = s1.replaceAll(" ", "");
        int count = s2.length();
        System.out.println(count);*/
        char[] ch = s1.toCharArray();
        for (int i = ch.length-1;i>=0;i--) {
            System.out.print(ch[i] + " ");
        }

        System.out.println();
        String[] s2 = s1.split(" ");
        System.out.println(Arrays.toString(s2));
        for (int i = s2.length-1; i>=0; i--) {
            System.out.print(s2[i]+ " ");
        }

        System.out.println();
        int count = 0;
        for (int i =0; i<s1.length();i++) {
            if (s1.charAt(i) == ' ' && s1.charAt(i+1)!= ' ') {
                count++;
            }
        }
        String s4 = s1.replaceAll(" ", "");
        count = s4.length();
        System.out.println(count);

    }
}
