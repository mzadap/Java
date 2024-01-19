package interview.strings.days100.codingbat.stringss;

public class FirstTwo {

    /*
       Day 02 Date - 23-12-2023
       * first two program
       * */

    public static void main(String[] args) {
        System.out.println(firstTwo("hello"));
        System.out.println(firstTwo("a"));
    }

    static String firstTwo(String str) {
        if (str.length() < 2) {
            return str;
        }
        return str.substring(0, 2);
    }
}
