package interview.strings.days100.list;

import java.util.ArrayList;
import java.util.List;

public class BasicTestOfArrayList {

    /*
     * 100 Days challenge, Day 34
     * Date - 04/10/2023
     * Java program to basic operation of arraylist
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
        Boolean test = list.contains(120);
        if (test) {
            System.out.println("it is present in the list ");
        } else {
            System.out.println(" it is not present in the list");
        }
        System.out.println("List " + list);
        System.out.println(list.lastIndexOf(200));
        //System.out.println(list);
    }
}
