package interview.strings.arrays;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedTest {

    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList();
        linkedList.add("Nachiket");
        linkedList.add(120);
        linkedList.add(12.22);
        linkedList.add("Zadap");
        System.out.println(linkedList);
        int count = 0;
        LinkedList l = new LinkedList();
        for (int i = linkedList.size()-1; i>=0; i--) {
            l.add(linkedList.get(i));
        }
        int test = linkedList.lastIndexOf(l);

        System.out.println("test " + test);
        System.out.println(l);

       /* for (int i = 0; i<l.size(); i++) {
            if (l.get(i).toString()) {
                count++;
                System.out.println(l.get(i));
            }
        }*/
        System.out.println(count);
    }
}
