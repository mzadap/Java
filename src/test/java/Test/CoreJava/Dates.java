package Test.CoreJava;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.SimpleTimeZone;

public class Dates {
    public  void main(String[] args) {
    /* int a = 100;
     int b = 200;
     a = (int) Math.exp((2*63)-1);
        System.out.println(Math.pow(2,63));
        System.out.println(a);*/

     /*   ArrayList<String> a = new ArrayList<String>();
        a.add("Test");
        a.add("Nachiket");
        a.add("zadap");
        System.out.println(a);
        a.add(0,"abc");
        System.out.println(a);
        a.remove(0);
        a.remove("Test");
        System.out.println(a);
        System.out.println(a.contains("Nachiket"));
        System.out.println(a.indexOf("abc"));
        System.out.println(a.isEmpty());
        System.out.println(a.get(1));
        System.out.println(a.size());*/

        HashSet<String>  hashSet = new HashSet<String>();
        hashSet.add("Iphone");
        hashSet.add("vivo");
        hashSet.add("Test");
        System.out.println(hashSet);
        //hashSet.remove("vivo");
        System.out.println(hashSet);
        hashSet.isEmpty();
        System.out.println(hashSet);

        Iterator<String> test1 = hashSet.iterator();
        while (test1.hasNext()){
            System.out.println(test1.next());
        }





    }
}
