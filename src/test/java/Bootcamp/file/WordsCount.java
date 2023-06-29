package Bootcamp.file;

import java.util.Arrays;

public class WordsCount {

    public static void main(String[] args) {

        String s1 = "this is new year";
        //String s2 = s1.replaceAll(" ", "");
        //int test = s2.length();
        //System.out.println(test);
        int count = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == ' ' && s1.charAt(i) != ' ') {
                s1 += "";
            }
        }
        //System.out.println(s1);
        String s2 = "   this is new year      ";
        System.out.println(s2.stripTrailing());

        String s3 = "Nachiket";
        char[] chs = s3.toCharArray();
        for (int i = chs.length - 1; i >= 0; i--) {
            System.out.print(chs[i]);
        }

        int[] test1 = {14, 2, 13, 30, 50};
        int temp = 0;
        System.out.println();
        for (int i = 0; i < test1.length; i++) {
            for (int j = i + 1; j < test1.length; j++) {
                if (test1[i] < test1[j]) {
                    temp = test1[i];
                    test1[i] = test1[j];
                    test1[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(test1));
        System.out.println(test1[1]);

    }
}
