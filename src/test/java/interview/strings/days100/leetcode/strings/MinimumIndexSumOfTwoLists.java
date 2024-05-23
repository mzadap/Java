package interview.strings.days100.leetcode.strings;

import java.util.*;

public class MinimumIndexSumOfTwoLists {

    public static void main(String[] args) {
        List<String> list = new ArrayList();
        List list1 = new ArrayList();
        list.add("happy");
        list.add("sad");
        list.add("good");

        list1.add("sad");
        list1.add("happy");
        list1.add("good");

        System.out.println(list);
        System.out.println(list1);
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for (int i =0; i<list.size(); i++) {
            int count = 0;
            for (int j =0; j<list1.size(); j++) {
                if (list.get(i).equals(list1.get(j))) {
                    System.out.println(" " + list.get(i) + " " + list1.get(j));
                    count = i+j;
                    map.put(list.get(i), count);
                }
            }
        }
        System.out.println(map);
        List a = new ArrayList();
        for (Map.Entry<String, Integer> map1 : map.entrySet()) {
            a.add(map1.getValue());
        }
        Collection<Integer> integers = map.values();
        System.out.println(integers);
        /*for (int i =0;i<integers.size(); i++) {
            if (integers.getClass().)
        }*/
    }
}
