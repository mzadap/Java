package interview.strings.days100.codingbat.stringss;

public class FirstHalf {
   /*
    Day 02 Date - 23-12-2023
     * first two program
       */

    public static void main(String[] args) {
        System.out.println(firstHalf("hellothere"));
        System.out.println(firstHalf("abcdef"));
    }

    static String firstHalf(String str) {
        int i = str.length() / 2;
        String a = str.substring(0, i);
        return a;
    }
}
