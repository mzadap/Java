package interview.strings.days100;

public class CompareStringWhichIsGreaterThan {

    /*
    * 15. How to complete 2 string in Java program
     * */

    public static void main(String[] args) {
        String s1 = "nachiket", s2 = "zadap";
        System.out.println(s1.compareTo(s2));
        if (s1.compareTo(s2) > 0) {
            System.out.println("s1 is > ");
        } else if (s1.compareTo(s2) < 0) {
            System.out.println("s12 < 0");
        } else {
            System.out.println("both are equal");
        }
    }
}
