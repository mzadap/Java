package Bootcamp.practice;

import java.util.ArrayList;

public class ArraysList<S> {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add(0, "Nachiket");
        list.add(1, "Pooja");
        list.add(2, "Arman");

        list.add(3, "SS");

        list.set(2, "Automation");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        list.remove(2);
    }
}
