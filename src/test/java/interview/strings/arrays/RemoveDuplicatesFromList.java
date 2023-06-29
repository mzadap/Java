package interview.strings.arrays;

import Test.CoreJava.inheritance.multipleinheritance.Parent1;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicatesFromList {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(22);
        list.add(33);
        list.add(44);
        list.add(55);
        System.out.println(list);
        list.add(33);
        System.out.println(list);
        for (int i = 0;i<list.size();i++) {
            for (int j = i+1; j<list.size(); j++) {
                if (list.get(i) == list.get(j)) {
                    System.out.println("Remove found " + list.remove(i));
                }
            }
        }
        System.out.println(list);
    }
}
