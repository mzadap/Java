package interview.strings.days100.strings;

import java.util.Arrays;

public class CountWords {

    public static void main(String[] args) {
        String s = "matching/requisitions-candidate/candidate-profile/";
        String[] s1 = s.split("/");
        System.out.println(Arrays.toString(s1));
        System.out.println(s1.length);
    }
}
