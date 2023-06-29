package interview.strings;

public class RotationOfTwoStrings {

    public static void main(String[] args) {
        /*
        * Write a program to check one string is rotation of another string
        * */

        String s1 = "IndiaUSAEngland";
        String s2 = "IndiaUSAEngland";
        System.out.println(isRotation(s1, s2));
    }

    public static boolean isRotation(String s1, String s2) {
        String whole = s1 + s1;
        if (s1.length() != s2.length()) {
            return false;
        }

        if (whole.indexOf(s2) == -1) {
            return false;
        } else {
            return true;
        }
    }
}
