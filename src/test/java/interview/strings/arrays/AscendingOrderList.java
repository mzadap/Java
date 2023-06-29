package interview.strings.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AscendingOrderList {

    public static void main(String[] args) {
        List list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);
        List list1 = new ArrayList<>();

        for (int i = list.size()-1; i>=0;i--) {
            list1.add(list.get(i));
        }


       // Arrays.equals(list, list1);
    }
}
