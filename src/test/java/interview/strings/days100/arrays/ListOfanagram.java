package interview.strings.days100.arrays;

import java.util.*;

public class ListOfanagram {

    public static void main(String[] args) {
        String[] values = {"eat", "tea", "tan", "ate", "nat", "bat"};
        //o/p -> [[bat], [eat, tea, ate], [nat, tan]]
        Map<Integer, List<String>> map = new HashMap<>();
        for (String value : values) {
            char[] c = value.toCharArray();
            Arrays.sort(c);
            int asciiSum = 0;
            for (char c1 : c) {
                asciiSum += (int) c1;
            }
            if (map.containsKey(asciiSum)) {
                map.get(asciiSum).add(value);
            } else {
                List<String> list = new ArrayList<>();
                list.add(value);
                map.put(asciiSum, list);
            }
        }
        System.out.println(map);
        LinkedList list = new LinkedList();
        for (Map.Entry<Integer, List<String>> map1 :map.entrySet()) {
            list.add(map1.getValue());
            //list = map1.getValue();
        }
        System.out.println(list);
    }
}

