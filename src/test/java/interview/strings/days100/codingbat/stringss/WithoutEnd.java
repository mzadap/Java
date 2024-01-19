package interview.strings.days100.codingbat.stringss;

public class WithoutEnd {

    public static void main(String[] args) {
        System.out.println(withoutEnd("coding"));
    }

    static String withoutEnd(String str) {
        String a = str.substring(1, str.length()-1);
        System.out.println(a);
        return a;
    }
}
