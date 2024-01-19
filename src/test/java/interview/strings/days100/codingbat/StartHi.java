package interview.strings.days100.codingbat;

public class StartHi {

    public static void main(String[] args) {
        System.out.println(startHi("hello hi"));
        System.out.println(startHi("hi "));
    }

    public static boolean startHi(String str) {
        if (str.length() < 2) {
            return false;
        }

        String first = str.substring(0, 2);
        if (first.contains("hi")) {
            return true;
        }
        else {
            return false;
        }
    }
}
