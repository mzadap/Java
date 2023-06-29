package interview.strings.NotionInterviewQuestions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateWords_NotionTests {

    public static void main(String[] args) {

        String s = "This a new This";
        String[] s1 = s.split(" ");
        int count = 1;
        System.out.println(Arrays.toString(s1));
        for (int i = 0; i<= s1.length-1; i++) {
            count = 1;
            for (int j = 1; j<s1.length; j++) {
                if (s1[i].equals(s1[j])) {
                    //System.out.println("Duplicate word " + s1[j]);
                    count++;
                    s1[j] = "0";
                }
            }
            if (count > 1 && s1[i] != "0") {
                System.out.println(s1[i]);
            }
        }

        List<String> list = Arrays.stream(s.split(" ")).collect(Collectors.toList());
        Set<String> stringSet = new HashSet<>();
        List list1 = list.stream().filter(w -> !stringSet.add(w))
                .collect(Collectors.toList());
        System.out.println("List ing " + list1);
    }
}
