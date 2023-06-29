package interview.strings.arrays;

import java.util.Arrays;

public class Arangrams {

    public static void main(String[] args) {
        String s1 = "CARE";
        String s2 = "EARC1";
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        Arrays.sort(c1);
        System.out.println(c1);
        Arrays.sort(c2);
        Boolean resul = Arrays.equals(c1, c2);

        if (resul) {
            System.out.println("Aragram");
        } else {
            System.out.println("it is not ");
        }
    }
}
