package interview.strings.days100.arrays;

import java.util.*;

public class Strings {

    public static void main(String[] args) {
       // Input: strs = ["eat","tea","tan","ate","nat","bat"]
        //Output: [["bat"],["nat","tan"],["ate","eat","tea"]]

        String[] s = {"eat","tea","tan","ate","nat","bat"};
        List<String> list = new ArrayList<>();
        List<String> list1 = new ArrayList<>();
        List<List<String>> list2 = new ArrayList<>();
        for (int i = 0; i<s.length; i++) {
            for (int j = i+1; j<s.length; j++) {
                if (list.equals(s[i])) {

                } else {
                    if (sameCharater(s[i], s[j])) {
                        list.add(s[i]);
                    }
                }
                /*else if (!sameCharater(s[i], s[j])) {
                    list1.add(s[j]);
                }*/
            }
        }
        System.out.println(list);
        /*System.out.println(list1);
        list.addAll(list1);
        LinkedHashSet set = new LinkedHashSet(list);
        System.out.println(set);*/

    }

    public static boolean sameCharater(String s1, String s2) {
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        return Arrays.equals(c1,c2);
    }
}
