package interview.strings.days100.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SimilarString {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("xyz");
        list.add("foo");
        list.add("fo");
        list.add("x");
        int count = 0;

        String[] s = new String[list.size()];
        for (int i =0 ;i<list.size(); i++) {
            s[i] = list.get(i);
        }
        System.out.println(Arrays.toString(s));
        for (int i =0; i< s.length-1; i++) {
            for (int j =0; j<s.length; j++) {
                if (s[i].contains(s[j]) && s[i]!="0") {
                    count++;
                    s[i] = "0";
                }
            }
           /* String s1 = s[i];
            String s2 = s[i+1];*/


        }
        System.out.println(count);
    }
}
