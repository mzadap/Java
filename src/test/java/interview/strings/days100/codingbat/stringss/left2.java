package interview.strings.days100.codingbat.stringss;

public class left2 {

    /*
     * Day 01 of 100 days challenge part 2
     * Date - 03-01-2023
     * Program name - letf2
     * */

    public static void main(String[] args) {
        System.out.println(left2("hello"));
        String a = "hello";
        String a1 = a.substring(0,2);
        String a2 = a.substring(2, a.length());
        System.out.println(a2);
        System.out.println(a1);
    }

    static String left2(String a) {
        String a1 = a.substring(0,2);
        String a2 = a.substring(2, a.length());
        return a2 + a1;
    }
}
