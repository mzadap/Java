package interview.strings.NotionInterviewQuestions;

import java.util.HashMap;

public class Vowel_NotionTests {

    public static void main(String[] args) {
        String s = "Nachiketa";
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        int count = 0;
        map.put("a", 0);
        map.put("e", 0);
        map.put("i", 0);
        map.put("o", 0);
        map.put("u", 0);
        for (int i = 0; i<s.toLowerCase().length(); i++) {
            if (s.charAt(i) == 'a') {
                map.put("a", map.get("a") + 1);
            } else if (s.charAt(i) == 'e') {
                map.put("e", map.get("e") + 1);
            } else if (s.charAt(i) == 'i') {
                map.put("i", map.get("i") + 1);
            } else if (s.charAt(i) == 'o') {
                map.put("o", map.get("o") + 1);
            } else if (s.charAt(i) == 'u') {
                map.put("u", map.get("u") + 1);
            }
        }
        System.out.println(map);
    }
}
