package interview.strings;

public class PalidromeOfString {

    public static void main(String[] args) {
        String s1 = "referq";
        String s2 = "";
        for (int i = s1.length()-1; i>=0; i--) {
            s2 += s1.charAt(i);
        }
        if (s1.equals(s2)) {
            System.out.println("it is palidrome string");
        } else {
            System.out.println("It not a palidrome string");
        }
    }
}
