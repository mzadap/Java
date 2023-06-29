package interview.strings.basicprograms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NumberOfOccurance {

    public static void main(String[] args) {
        String s1 = "abababaccss";
        char c[] = s1.toCharArray();
        int count = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i<s1.length(); i++) {
            count = 0;
            for (int j = 0; j<s1.length(); j++) {
                if (c[i] == c[j]) {
                    count++;
                }
            }
            map.put(c[i], count);
        }
        System.out.println(map);
    }
}
