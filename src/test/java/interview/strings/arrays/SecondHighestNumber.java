package interview.strings.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SecondHighestNumber {

    public static void main(String[] args) {
        /*
        * Write a program to find second hightest number
        * */

        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(20);
        list.add(15);
        list.add(7);
        list.add(10);
        Collections.sort(list);
        System.out.println(list);
        System.out.println(list.get(list.size()-2));


    }
}
