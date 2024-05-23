package interview.strings.days100.collections;

import java.util.*;

public class TestHashMao {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "nachiket");
        map.put(2, "pooja");
        map.put(3, "weds");
        map.put(7, "LD");
        map.put(5, "BK");
        /*for (Map.Entry entry :map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }*/
        map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).forEach(System.out::println);
        //map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
    }
}
