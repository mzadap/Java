package interview.strings.days100.list;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicatesFromList {

    /*
     * 100 Days challenge, Day 31
     * Date - 01/10/2023
     * Java program to remove duplicates
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
        for (int i =0; i<list.size(); i++) {
            for (int j = i+1; j<list.size(); j++) {
                if (list.get(i).equals(list.get(j))) {
                    list.remove(i);
                }
            }
        }
        System.out.println(list);

    }
}
