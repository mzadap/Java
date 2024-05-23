package interview.strings.days100.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arraysl {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        int l = 5,r = 7;
        int n = 4;
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        int count = 0;
        int[] a = new int[list.size()];
        for (int i =0; i<list.size(); i++) {
            a[i] = list.get(i);
        }
        List list1 = Arrays.asList(a);
        for (int i =0; i<a.length-1; i++) {
            for (int j = i+1; j <a.length; j++) {
                int sum = a[i] + a[j];
                if (sum >= l && sum <= r) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }


}
