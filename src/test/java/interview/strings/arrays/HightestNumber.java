package interview.strings.arrays;

import java.util.ArrayList;
import java.util.List;

public class HightestNumber {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(7);
        list.add(103);
        int high = list.get(0);
        for (int i = 1;i<list.size();i++) {
            if (high < list.get(i)) {
                high = list.get(i);
            }
        }
        System.out.println(high);
    }
}
