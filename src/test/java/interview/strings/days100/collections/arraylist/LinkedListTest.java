package interview.strings.days100.collections.arraylist;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListTest {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add("pooja");
        list.add("Nachiket");
        list.add("weds");
        list.add("zadap");
        Iterator iterator = list.descendingIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
