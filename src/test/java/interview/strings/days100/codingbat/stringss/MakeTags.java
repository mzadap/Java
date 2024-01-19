package interview.strings.days100.codingbat.stringss;

public class MakeTags {
    /*
        Day 02 Date - 23-12-2023
        * make tags programs
        * */

    public static void main(String[] args) {
        System.out.println(makeTags("i", "yay"));
        System.out.println(makeTags("i", "hello"));
    }

    public static String makeTags(String tag, String word) {
        return "<" + tag + ">" + word + "</" + tag + ">";
    }
}
