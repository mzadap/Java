package interview.strings.days100;

public class SplitExample {

    /*
     * 100 Days challenge, Day 04
     * Date - 04/09/2023
     * 39. How to split string in java Program
     * */

    public static void main(String[] args) {
        String s1 = "java string split method by";
        String[] words = s1.split("\\s");
        for (String w: words) {
            System.out.println(w);
        }

    }
}
