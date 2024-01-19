package interview.strings.days100.list;

import java.util.ArrayList;
import java.util.List;

public class MultipleLevelList {
    /*
     * 100 Days challenge, Day 40
     * Date - 10/10/2023
     * multiple level list traversing
     * */

    public static void main(String[] args) {

        List<List<Integer>> list1 = new ArrayList<>();

        //list.add(list1);

        List<Integer> list2 = new ArrayList<>();

        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        list2.add(5);
        list1.add(list2);
        System.out.println(list1);

        List<Integer> list3 = new ArrayList<>();

        list3.add(6);
        list3.add(7);
        list3.add(8);
        list3.add(9);
        list3.add(10);

        list1.add(list3);
        System.out.println(list1);

        List<Integer> list4 = new ArrayList<>();

        list4.add(11);
        list4.add(12);
        list4.add(13);
        list4.add(14);
        list4.add(15);

        list1.add(list4);
        System.out.println(list1);
        /*list.add(list1);
        System.out.println(list);*/
        for (int i =0; i<list1.size(); i++) {
            if (i==1) {
                System.out.println("Index found at " + list1.get(i));
                //System.out.println("Hello " + list1.get(list1.get(i).get(i)));
                for (int j = 0; j<list1.get(i).size(); j++) {
                    System.out.println("Print every elements " + list1.get(i).get(j));
                }
            }

        }


    }
}
