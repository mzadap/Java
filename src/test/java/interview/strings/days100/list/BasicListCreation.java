package interview.strings.days100.list;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class BasicListCreation {

    /*
     * 100 Days challenge, Day 30
     * Date - 30/09/2023
     * Java program for list creation and basic operations
     * */

    public static void main(String[] args) {
        List<Integer> list = new ArrayList();

        list.add(12);
        list.add(1);
        list.add(200);
        list.add(35);
        list.add(5);
        list.add(45);
        System.out.println(list);
        int temp;
        for (int i =0; i<list.size()-1; i++) {
            for (int j = 0; j<list.size()-1; j++) {
                if (list.get(i) < list.get(j)) {
                    temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
        System.out.println(list);
    }
}
