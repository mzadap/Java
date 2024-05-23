package interview.strings.days100.strings;

import java.util.*;
import java.util.stream.Collectors;

public class duplicateWords {

    public static void main(String[] args) {
        String s = "this is selenium web web";
        String[] s1 = s.split(" ");
        /*Arrays.stream(s1).collect(Collectors.toSet());
        System.out.println();*/
        Set<String> set = new HashSet(Arrays.asList(s1));
        set = Arrays.stream(s1).collect(Collectors.toSet());
        System.out.println(set);
        /*System.out.println(set);
        String s3 = "";
        for (String s2 : set) {
            // s2 += set;
            s3 += s2;
            System.out.println(s2);
        }
        System.out.println(s3);*/
        //Arrays.stream(s1).collect(list);
        /*int count;
        for (int i =0; i<=s1.length-1; i++) {
            count = 1;
            for (int j = i+1; j< s1.length; j++) {
                if (s1[i].equals(s1[j])) {
                    count++;
                    s1[j] += "0";
                }
            }
            if(count > 1 && s1[i] != "0") {
                System.out.println(s1[i]);
            }
        }*/
    }
}
