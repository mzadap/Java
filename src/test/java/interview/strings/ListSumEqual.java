package interview.strings;

import java.util.ArrayList;
import java.util.List;

public class ListSumEqual {

    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(1);
        list.add(5);
        list.add(7);
        list.add(-1);
        list.add(5);
        //int[] arr = { 1, 5, 7, -1, 5 };
        int sum = 8;
        int count;
        for (int i = 0; i<list.size(); i++) {
            for (int j = i+1; j<list.size(); j++) {
                //count = list.get(i) + list.get(j);
            }
        }
        /*for (int i = 0; i<arr.length; i++) {
            for (int j = i+1; j<arr.length; j++) {
                if (arr[i] + arr[j] == sum) {
                    System.out.println(arr[i] + " " + arr[j]);
                }
            }
        }*/

    }
}
