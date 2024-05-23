package interview.strings.days100.arrays;

import java.util.ArrayList;
import java.util.List;

public class ArrayReductions {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(7);
        int cost = 0;
        for (int i = 0; i<=list.size()-1; i++) {
            if (list.size()==0) {
                throw new IllegalArgumentException("Testing");
            } else {
                int min = list.get(i);
                int size = list.size();
                int max = list.get(size-1);
                int sum = min + max;
                cost = (min + max) /(max - min +1);
                list.remove(i);
                list.remove(list.size()-1);
                list.add(cost);
                size--;
                cost+= cost;
            }

        }
        System.out.println(cost);
    }
}
