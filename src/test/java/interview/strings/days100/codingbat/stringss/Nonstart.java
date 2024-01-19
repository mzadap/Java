package interview.strings.days100.codingbat.stringss;

public class Nonstart {

    /*
    * Day 01 of 100 days challenge part 2
    * Date - 03-01-2023
    * Program name - Non start
    * Given 2 strings, return their concatenation,
    * except omit the first char of each. The strings will be at least length 1.
    * */

    public static void main(String[] args) {
        System.out.println(nonStart("hello", "code"));
    }

    static String nonStart(String a, String b) {

        return a.substring(1) + b.substring(1);
    }
}
