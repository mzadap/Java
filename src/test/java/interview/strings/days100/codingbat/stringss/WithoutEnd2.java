package interview.strings.days100.codingbat.stringss;

public class WithoutEnd2 {

    /*
     * Day 02 of 100 days challenge part 2
     * Date - 04-01-2023
     * Program name - without end 2
     * */

    public static void main(String[] args) {

        System.out.println(withoutEnd2("ab"));
    }

    static String withoutEnd2(String str) {
        if (str.length()<=2) {
            return " ";
        }

        return str.substring(1, str.length()-1);
    }
}
