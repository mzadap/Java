package interview.strings.BackToBasic;

import com.sun.source.doctree.SeeTree;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class BasicMaps {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("one", "ABC");
        map.put("two", "xyz");
        map.put("three", "pqr");
        map.put("four", "maz");
        System.out.println(map);
        System.out.println(map.keySet());
        System.out.println(map.entrySet());
        int s1 = map.entrySet().size();
        /*Map<String, String> map1 = new HashMap<>();
        for (Map.Entry<String, String> e :map.entrySet()) {
            map1.put(e.getValue(), e.getKey());
        }*/
       //System.out.println(map1);

        System.out.println(map.get("one"));
        for (String i :map.keySet()) {
            System.out.println("keys : " + i + " \tvalues " + map.get(i));
        }


        //System.out.println(s1);

        /*for(String i : map.keySet()) {
            System.out.println(i);
        }*/

    }
}
