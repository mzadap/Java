package interview.strings.NotionInterviewQuestions;

import java.util.HashMap;
import java.util.Map;

public class VowelsCount_NotionTests {

    public static void main(String[] args) {
        String s = "nachiketea";
        int count = 0;
        for (int i = 0; i<s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'o' || s.charAt(i) == 'i' || s.charAt(i) == 'u') {
                count++;
            }
        }
        System.out.println(count);
    }
}
