package interview.strings.BackToBasic;

public class StringsPalidrome {

    public static void main(String[] args) {
        String st = "aba";
        System.out.println(palidrome(st) ? "Yes" : "No");
    }

    public static boolean palidrome(String str) {
        String st1 = "";
        boolean test;
        for (int i = str.length()-1; i>=0; i--) {
            st1 += str.charAt(i);
        }

        if (str.equals(st1)) {
            test = true;
        } else {
            test = false;
        }
        return test;
    }
}
