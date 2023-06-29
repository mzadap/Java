package interview.strings.BackToBasic;

import java.util.HashMap;
import java.util.Map;

public class NumberOfOccurance {

    public static void main(String[] args) {
        String s1 = "My Name is Nachiket";
        String s2 = s1.replace(" ", "");
        System.out.println(s2);
        char[] c = s2.toCharArray();
        int count;
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i<c.length; i++) {
            count = 0;
            for (int j = 0; j<c.length; j++) {
                if (c[i] == c[j]) {
                    count++;
                }
            }
            map.put(c[i], count);
        }
        System.out.println(map);
    }
}
