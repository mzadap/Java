package interview.strings.BackToBasic;

import java.util.HashMap;
import java.util.Map;

public class NewsMapss {

    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("abc", "a");
        map.put("def", "b");
        map.put("ghi", "c");
        map.put("pqr", "d");
        map.put("def1", "b");
        System.out.println(map);
        for (String test : map.keySet()) {
            if (test.equals("abc")) {
                System.out.println(map.get(test));
            }
        }
        Map<String, String> map1 = new HashMap<>();
        /*for (String i : map.keySet()) {
            map1.put(map.get(i), i);
        }*/
        System.out.println(map1);

        for (Map.Entry<String, String> entry: map.entrySet()) {
            if (entry.getKey().equals("def1")) {
                entry.setValue("bc");
            }
            //map1.put(entry.getValue(), entry.getKey());
        }
        System.out.println(map);
        System.out.println(map.containsKey("pqr"));
        System.out.println(map.containsValue("a"));
        System.out.println(map.size());
        //map.clear();
        map.replace("pqr", "d", "thisisnew");
        System.out.println(map);
        System.out.println(map.size());
    }
}
