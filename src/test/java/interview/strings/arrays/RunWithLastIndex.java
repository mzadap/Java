package interview.strings.arrays;

import java.util.ArrayList;
import java.util.List;

public class RunWithLastIndex {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(4);
        //list.add(7);
        list.add(10);
        System.out.println(list);
        int i1 = list.get(3);
        System.out.println(i1);
        List<Integer> test = new ArrayList<>(list.size());
        for (int i = 1;i<=i1; i++) {
            if (!list.contains(i)) {
                test.add(i);
            }
        }

        List<Integer> add11 = new ArrayList<>();
        System.out.println(test);
        for (int i = 0;i<list.size(); i++) {
           add11.add(test.get(i) + list.get(i));
        }
        System.out.println(add11);
    }
}
