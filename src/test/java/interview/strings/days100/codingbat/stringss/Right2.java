package interview.strings.days100.codingbat.stringss;

public class Right2 {

    /*
     * Day 01 of 100 days challenge part 2
     * Date - 03-01-2023
     * Program name - right2
     * */


    public static void main(String[] args) {
        System.out.println(right2("hello"));
    }

    static String right2(String str) {
        return str.substring(str.length()-2) + str.substring(0, str.length()-2);
    }
}
