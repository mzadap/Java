package codechef;

import java.util.Arrays;

public class AragramString {

    public static void main(String[] args) {
        String s1 = "Race";
        String s2 = "Care";
     /*   char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        boolean test = Arrays.equals(ch1, ch2);
        if (test) {
            System.out.println("it is aragram ");
        } else {
            System.out.println("It is not");
        }*/

        if (checkAragram(s1, s2)) {
            System.out.println("Aragram number");
        } else {
            System.out.println("Not");
        }
    }

    public static boolean checkAragram(String s1, String s2) {
        s1 = s1.replaceAll("\\s", "");
        s2 = s2.replaceAll("\\s", "");
        if (s1.length()!=s2.length()) {
            return false;
        } else {
            for (int i = 0; i < s1.length(); i++) {
                for (int j = 0; j < s2.length(); j++) {
                    if (s1.charAt(i) == s2.charAt(j)) {
                        s2 = s2.substring(0, j) + s2.substring(j+1);
                        break;
                    }
                }
            }
            if (s2.length() == 0) {
                return true;
            } else {
                return false;
            }
            //char
        }
    }
}
