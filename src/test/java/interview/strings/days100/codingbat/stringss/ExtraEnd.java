package interview.strings.days100.codingbat.stringss;

public class ExtraEnd {
    /*
        Day 02 Date - 23-12-2023
        * make extra end program
        * */

    public static void main(String[] args) {
        System.out.println(extraEnd("hi"));

    }

    public static String extraEnd(String str) {
        String a = str.substring(str.length()-2, str.length());
        System.out.println(a);
        return a + a + a;
    }
}
