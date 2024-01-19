package interview.strings.days100;

import com.sun.source.tree.UsesTree;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapPrograms {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap(3, 0.5f);
        map.put("nachiket", "zadap");
        map.put("shubham", "mishra");
        map.put("aman", "gurudev");
        map.put("pooja", "zadap11");
        map.putIfAbsent("nachiket", "qa");
        System.out.println(map);
        Map<String, String> map1 = new HashMap<>();
        map1.putAll(map);
        System.out.println(map1);
        System.out.println(map.containsKey("pooj1"));
        System.out.println(map.size());
        Set<String> keySets = map.keySet();
        for (String s: keySets) {
            System.out.println(s);
        }

        String s = "Nachiket";
        String s1 = "";
        for (int i = s.length()-1; i>=0; i--) {
            s1 += s.charAt(i);
        }
        System.out.println(s1);
        //Set<String> strings = map.values();
        /*for (Map.Entry<String, String> entry :map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
            map1.put(entry.getValue(), entry.getKey());
            //map.put(entry.getValue(), entry.getKey());
        }
        System.out.println(map1);
        System.out.println(map);*/

    }
}
