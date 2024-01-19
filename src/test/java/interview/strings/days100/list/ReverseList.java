package interview.strings.days100.list;

import java.util.ArrayList;
import java.util.List;

public class ReverseList {

    /*
     * 100 Days challenge, Day 31
     * Date - 01/10/2023
     * Java program to reverse
     * */

    public static void main(String[] args) {
        List<Integer> list = new ArrayList();

        list.add(12);
        list.add(1);
        list.add(200);
        list.add(35);
        list.add(5);
        list.add(45);
        list.add(5);
        System.out.println(list);
        List<Integer> list1 = new ArrayList();
        //Boolean test = list1.stream().sorted();
        for (int i = list.size()-1; i>=0; i--) {
            //System.out.print(list.get(i));
            list1.add(list.get(i));
        }
        System.out.println(list1);
    }
}
