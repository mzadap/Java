package interview.strings.days100.strings;

public class PalidromString {

    /*
     * 100 Days challenge, Day 13
     * Date - 13/09/2023
     *  Write a program in Java to check a String is palindrome or not.
     * */

    public static void main(String[] args) {
        String s1 = "refer";
        String s2 = "";
        for (int i = s1.length()-1; i>=0; i--) {
            s2 += s1.charAt(i);
        }
        if (s2.equals(s1)) {
            System.out.println("it is palidrome string");
        } else {
            System.out.println("it is not a palidrom string");
        }
    }
}
