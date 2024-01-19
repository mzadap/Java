package interview.strings.days100.codingbat.stringss;

public class TheEnd {

    /*
     * Day 02 of 100 days challenge part 2
     * Date - 04-01-2023
     * Program name - right2
     * */

    public static void main(String[] args) {
        System.out.println(theEnd("hello", true));
    }

    static String theEnd(String str, boolean front) {
        if (front) {
            return str.substring(0, 1);
        } else {
            return str.substring(str.length()-1);
        }
    }
}
