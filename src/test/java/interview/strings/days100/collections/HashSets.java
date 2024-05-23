package interview.strings.days100.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class HashSets {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("nachiker");
        list.add("pooja");
        list.add("xya");
        list.add("new man");
        list.add("pooja");

        HashSet set = new HashSet(list);
        set.add("puja");
        set.forEach(a -> {
            System.out.println(a);
        });
        /*for (String s : list) {
            set.add(s);
        }
        System.out.println(set);*/

    }
}
