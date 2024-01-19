package interview.strings.days100;

public class ReplaceAllExample {

    /*
     * 100 Days challenge, Day 04
     * Date - 04/09/2023
     * 38. How to replace string with another string in java Program
     * */

    public static void main(String[] args) {
        String s1 = "nachiket zadap";
        String s2 = s1.replace("z", "Z");
        System.out.println(s2);
        System.out.println(s2.replaceAll("Zadap", "NEw"));
        //System.out.println(s2);
    }
}
