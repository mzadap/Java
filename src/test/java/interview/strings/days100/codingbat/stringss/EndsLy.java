package interview.strings.days100.codingbat.stringss;

public class EndsLy {

    public static void main(String[] args) {
        System.out.println(endsLy("ooddy"));
    }

    public static boolean endsLy(String s) {
        char s1 = s.charAt(s.length()-2);
        return true;
    }
}
