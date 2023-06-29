package interview.strings.arrays;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class HashSetTesting {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(20);
        list.add(15);
        list.add(7);
        list.add(10);
        list.add(10);

        System.out.println(list);

        HashSet hashSet = new HashSet(list);
        System.out.println(hashSet);
        //System.out.println(hashSet.stream().sorted().toString());
        System.out.println(hashSet);
        Object[] test = hashSet.toArray();

        /*List<Integer> collect = (List<Integer>) hashSet.stream().sorted().collect(Collectors.toList());
        System.out.println(collect);*/

    }
}
