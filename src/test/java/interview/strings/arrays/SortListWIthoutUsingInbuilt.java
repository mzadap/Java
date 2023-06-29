package interview.strings.arrays;

import java.util.ArrayList;
import java.util.List;

public class SortListWIthoutUsingInbuilt {

    public static void main(String[] args) {
        /*
        * Write a program without using inbuilt functions
        * */

        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(20);
        list.add(15);
        list.add(7);
        list.add(10);

        int temp = 0;
        for (int i = 0; i< list.size(); i++) {
            for (int j = i + 1; j< list.size(); j++) {
                if (list.get(i) > list.get(j)) {
                    temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
        System.out.println(list);
    }
}
