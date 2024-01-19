package interview.strings.days100.codingbat.stringss;

public class ComboString {

    public static void main(String[] args) {
        System.out.println(comboString("hello", "hi"));
        System.out.println(comboString("aaa", "b"));
    }

    static String comboString(String a, String b) {
        int a1 = a.length();
        int b1 = b.length();
        if (a1 > b1) {
            return b + a + b;
        } else {
            return a + b + a;
        }
    }
}
