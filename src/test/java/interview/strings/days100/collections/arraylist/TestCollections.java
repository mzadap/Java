package interview.strings.days100.collections.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

public class TestCollections {

    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("Add");
        list.add("sub");
        list.add("mul");
        list.add("div");
        list.add("abc");
        System.out.println(list);
        list.forEach(a -> {
            System.out.println(a);
        });

        for (int i = 0; i<list.size();i++) {
            System.out.println("List with " + list.get(i));
        }

        ListIterator<String> iterator = list.listIterator(list.size());
        while (iterator.hasPrevious()) {
            String s = iterator.previous();
            System.out.println(s);
        }

        Collections.reverse(list);
        System.out.println(list);

    }
}
