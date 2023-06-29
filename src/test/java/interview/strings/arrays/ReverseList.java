package interview.strings.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseList {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(4);
        list.add(7);
        list.add(10);
        System.out.println(list);
        List<Integer> test = new ArrayList<>();
        for (int i = list.size()-1; i>=0; i--) {
            System.out.print(list.get(i) + " ");
            test.add(list.get(i));
        }
        System.out.println("");
        System.out.println(test);
        Collections.sort(test);
        System.out.println(test);
        Collections.reverse(test);
        System.out.println(test);
    }
}
