package interview.strings.days100.collections;

import java.util.HashMap;

public class HashMapTest {

    /*
     * 100 Days challenge, Day 62
     * Date - 05/11/2023
     * Check Odd Even In Multiple List
     * */

    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap();
        map.put(1, "Nachiket");
        map.put(2, "Stephan");
        map.put(3, "Shubham");
        map.put(4, "aman");
        map.put(5, "jay");
        map.put(6, "ankit");
        System.out.println(map);
        for (int i : map.keySet()) {
            System.out.println("Keys are " + i);
        }

        for (String s : map.values()) {
            System.out.println("Values are " + s);
        }

        if (map.containsKey(2)) {
            String val = map.get(2);
            System.out.println("Hello " + map.get(2));
        }

        map.put(100, "abc");
        System.out.println("New key added " + map);

        map.remove(3);
        System.out.println("Removed values are " + map);
        map.replace(1, "abc");
        System.out.println("Replace values are " + map);

        HashMap map1 = new HashMap(map);
        System.out.println(map1);

    }

}
