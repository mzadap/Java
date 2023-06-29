package interview.strings.arrays;

import java.util.ArrayList;
import java.util.List;

public class FindEvenOddNumberInList {

    public static void main(String[] args) {
        /*
        * Write a program to find even and odd number in list
        * */

        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(20);
        list.add(15);
        list.add(7);
        list.add(10);
        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();
        for (int i = 0; i<list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                even.add(list.get(i));
            } else {
                odd.add(list.get(i));
            }
        }
        System.out.println(even);
        System.out.println(odd);
    }
}
