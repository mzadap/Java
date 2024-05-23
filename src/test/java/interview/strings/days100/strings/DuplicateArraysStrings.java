package interview.strings.days100.strings;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DuplicateArraysStrings {

    public static void main(String[] args) {
        String[] s = {"abc", "xyz", "a", "a", "xyz", "abc", "cvvv"};
        String[] s1 = new String[s.length];
        /*Set<String> strings = new HashSet<>(Arrays.asList(s));
        System.out.println(strings);*/
        /*for (int i = 0;i<s.length; i++) {
            strings.add(s[i]);
        }
        System.out.println(strings);*/
        for (int i = 0; i<s.length; i++) {
            for (int j = i+1; j<s.length; j++) {
                if (s[i].equals(s[j]) && s[i]!="0") {
                    s1[i] = s[i];
                    s[j] = "0";
                }
            }
        }
        System.out.println(Arrays.toString(s1));

    }
}
