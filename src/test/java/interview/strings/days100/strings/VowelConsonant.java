package interview.strings.days100.strings;

import java.util.HashMap;

public class VowelConsonant {

    /*
     * 100 Days challenge, Day 13
     * Date - 13/09/2023
     *  Java program to check given character is vowel or consonant.
     * */

    public static void main(String[] args) {
        String s1 = "nachiketa";
        Integer count;
        char[] c1 = s1.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        /*for (int i =0; i<c1.length; i++) {
            count = 0;
            if (c1[i] == 'a' || c1[i] == 'e' || c1[i] == 'i' || c1[i] == 'o' || c1[i] == 'u') {
                count++;
                map.put(c1[i], count);
            }
        }
        System.out.println(map);*/
        map.put('a', 0);
        map.put('e', 0);
        map.put('i', 0);
        map.put('o', 0);
        map.put('u', 0);
        for (int i =0; i<s1.length(); i++) {
            if (map.containsKey(s1.charAt(i))) {
                int count1 = map.get(s1.charAt(i));
                map.put(s1.charAt(i), ++count1);
            }
        }
        System.out.println(map);
    }
}
