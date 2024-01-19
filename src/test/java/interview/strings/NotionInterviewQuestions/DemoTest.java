package interview.strings.NotionInterviewQuestions;

import java.util.*;

public class DemoTest {
    public static void main(String[] args) {

        String s = "nachiket zadap";
        s = s.replace(" ", "");
        //char[] c = s.toCharArray();
        int count;
        HashMap map = new HashMap();
        List list = new ArrayList();

        Collections.frequency(list, "");
        for (int i = 0; i<s.length(); i++) {
            count = 0;
            for (int j = 0; j<s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    count++;
                    map.put(s.charAt(i), count);

                }
            }

        }
        System.out.println(map);


    }
}
