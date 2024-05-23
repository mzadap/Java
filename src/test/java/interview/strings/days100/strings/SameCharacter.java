package interview.strings.days100.strings;

import java.util.Arrays;
import java.util.List;

public class SameCharacter {

    public static void main(String[] args) {
        String[] strings  = {"java", "abcd", "ajav", "xyz", "bcda"};
        boolean hasSameCharacters = false;
        for (int i = 0; i < strings.length; i++) {
            for (int j = i + 1; j < strings.length; j++) {
                if (areStringEquals(strings[i], strings[j])) {
                    hasSameCharacters = true;
                    System.out.println("Strings '" + strings[i] + "' and '" + strings[j] + "' have the same characters.");
                }
            }
        }

        if (!hasSameCharacters) {
            System.out.println("No strings in the array have the same characters.");
        }
    }

    static boolean areStringEquals(String st1, String st2) {
        char[] chars1 = st1.toCharArray();
        char[] chars2 = st2.toCharArray();
        Arrays.sort(chars1);
        Arrays.sort(chars2);

        return Arrays.equals(chars1, chars2);
    }
}
