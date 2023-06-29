package interview.strings.arrays;

import java.util.ArrayList;
import java.util.List;

public class SmallestElement {

    public static void main(String[] args) {
        /*
        * Find smallest element in array
        * */

        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(3);
        list.add(4);
        list.add(14);
        list.add(120);
        int no = list.get(0);
        int ii;
        for (int i = 1; i<list.size();i++) {
            if (list.get(i) < no) {
                //System.out.println(list.get(i));
                no = list.get(i);
            }
        }
        System.out.println(no);

    }
}
