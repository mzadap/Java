package interview.strings.arrays;

import java.util.ArrayList;
import java.util.List;

public class ListPratice {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(20);
        list.add(15);
        list.add(7);
        list.add(10);
        System.out.println(list);
        int no = 15;
        for (int i = 0; i<list.size(); i++) {
            if (list.get(i) == no) {
                list.remove(i);
            }
        }
        System.out.println(list);
        int lastValue = list.get(3);
        list.set(3, list.get(0));
        System.out.println(list);
        list.set(0, lastValue);
        System.out.println(list);

    }
}
