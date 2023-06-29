package Bootcamp.file;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListProgram {

    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers.add(2);
        integers.add(45);
        integers.add(10);
        integers.add(55);
        integers.add(15);
        integers.add(55);

       /* for (int i = 0; i< 5; i ++) {
            integers.add(i);
        }*/
        System.out.println("Size " + integers.size());
        for (int i = 0; i<integers.size();i++) {
            System.out.print(integers.get(i) + " ");
        }
        //integers.remove(1);
        System.out.println();
        for (int i = 0; i<integers.size();i++) {
            System.out.print(integers.get(i) + " ");
        }
        integers.containsAll(integers);
        System.out.println();
        //Collections.sort(integers);
        //System.out.println(Collections.max(integers));
        int temp;
     /*   for (int i = 0; i<integers.size();i++) {
            if (temp > integers.get(i) ) {
                temp = integers.get(i);
            }
            System.out.print(integers.get(i) + " ");
        }
        System.out.println();
        System.out.println("Max" + temp);*/
        List<Integer> list = new ArrayList<>();
        /*for (int i = 0; i<integers.size();i++) {
            if (integers.get(i) > integers.get(i+1)) {
                list.add(i+1);
            }
        }*/
        for (int i = integers.size()-1; i>=0; i--) {
            int ele1 = integers.get(i);
            list.add(ele1);
        }
        System.out.println(list);


        Set<Integer> integerSet = new HashSet<>(integers);
        Stream<Integer> no = integerSet.stream().sorted();
        System.out.println("Sorted number " + no.toArray());
        List<Integer> qa = new ArrayList<>(integerSet);
        Stream<Integer> test = qa.stream().sorted();
        System.out.println("Stream " + test.sorted().collect(Collectors.toSet()));
        System.out.println("List" + qa.stream().sorted().toArray());
        System.out.println("Removed duplicates value " + integerSet);

       /* List<Integer> testList = new ArrayList<>();

        for (int i = 0; i<integers.size(); i++) {
            if (integers.get(i) == testList.get(i)) {
                System.out.println("duplicates");
            } else {
                testList.add(integers.get(i));
            }
        }*/



    }
}
