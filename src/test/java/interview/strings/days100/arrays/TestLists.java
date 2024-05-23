package interview.strings.days100.arrays;

import java.util.ArrayList;
import java.util.List;

public class TestLists {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        int l = 5;
        int r = 9;
        int count = 0;
        for (int i = 0; i<list.size()-1; i++) {
            int a = list.get(i);
            int b = list.get(i+1);
            int sum = a + b;
            System.out.println(sum);
            if (sum >= l && sum <= r) {
                count++;
            }
        }
        System.out.println(count);
    }
}
