package interview.strings.days100;

public class RemoveCharacter {

    /*
     * 100 Days challenge, Day 11
     * Date - 11/09/2023
     *  Write a method in Java which will remove any given character from a String.
     * */

    public static void main(String[] args) {

        String s1 = "Nachiket";
        System.out.println(s1.replace("a", " "));
        System.out.println(rep(s1, "a"));
    }

    static String rep(String s1, String ch) {
        return s1.replace(ch, " ");
    }
}
