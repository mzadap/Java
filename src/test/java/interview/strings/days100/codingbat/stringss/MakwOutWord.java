package interview.strings.days100.codingbat.stringss;

public class MakwOutWord {
    /*
        Day 02 Date - 23-12-2023
        * make out word programs
        * */

    public static void main(String[] args) {
        System.out.println(makeOutWord("<<>>", "abc"));
    }

    public static String makeOutWord(String out, String word) {
        /*String ones = out.substring(0, 2);
        String two = out.substring(2, 4);
        System.out.println(ones);
        System.out.println(two);*/
        return out.substring(0, 2) + word + out.substring(2, 4);
    }
}
