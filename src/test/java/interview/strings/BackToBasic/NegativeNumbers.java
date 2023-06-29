package interview.strings.BackToBasic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NegativeNumbers {

    public static void main(String[] args) {
        int arr[] = {1, -1, 3, 2, -7, -5, 11, 6 };

        //int[] test = new int[arr.length];
        List concate = new ArrayList();
        List list = new ArrayList();
        List list1 = new ArrayList();
        for (int i = 0; i< arr.length; i++ ) {
                if (arr[i] >= 0 && arr[i] <=99) {
                    list.add(arr[i]);
                }
                if (!(arr[i] >= 0 && arr[i] <= 99)) {
                    list1.add(arr[i]);
                }

        }

        //System.out.println(Arrays.toString(test));
        System.out.println(list);
        System.out.println(list1);
        concate.addAll(list);
        concate.addAll(list1);
        //list.add(list1);
        System.out.println(concate);
    }
}
