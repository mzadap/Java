package Test.CoreJava;

import java.util.ArrayList;

public class AutoBoxing {

    public static void main(String[] args) {
        String[] test = new String[10];
        int[] ints = new int[5];
        Integer[] integers = new Integer[21];

/*
        ArrayList<Integer> stringArrayList = new ArrayList<>();
        for (int i=0;i<=10;i++) {
            stringArrayList.add(Integer.valueOf(i));
            System.out.println(i + "-->" + stringArrayList.get(i));
        }*/

        ArrayList<Double> doubles = new ArrayList<>();
        for (double dlb= 0.0;dlb<10.0;dlb+=0.5) {
            doubles.add(dlb);
            System.out.println(dlb + "-->" );
        }

        for (int i=0; i<doubles.size();i++) {
            double value = doubles.get(i);
            System.out.println(i + " ---> " +value);
        }
    }
}
