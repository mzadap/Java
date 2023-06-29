package interview.strings.arrays;

import java.util.ArrayList;
import java.util.List;

public class RotationOfList {

    public static void main(String[] args) {
        /*
        * Rotation of list
        * */

        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(20);
        list.add(15);
        list.add(7);
        list.add(10);
        System.out.println(list);
        /*int temp = list.get(list.size()-1);
        System.out.println(temp);
        list.set(list.size()-1, list.get(0));
        System.out.println(list);
        list.set(0, temp);
        System.out.println(list);*/
        int k = 3;
        for (int i = 0; i<k; i++) {
            list.set(i, list.set(list.size()-1, list.get(i)));
            System.out.println(list);
        }
        //System.out.println(list);
    }
}
