package interview.strings.arrays;

import java.util.ArrayList;
import java.util.ListIterator;

public class CurserListIterator {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Nachiket");
        list.add("Pooja");
        list.add("Stephan");
        list.add("Ankit");
        list.add("shubham");
        System.out.println(list);
        ListIterator s =  list.listIterator();
        while (s.hasNext()) {

            String s1 = (String) s.next();
           // System.out.println(s.next());
            if (s1.equals("Stephan")) {
                s.add("Jay");
            }
            if (s1.equals("Ankit")) {
                s.remove();
            }
            if (s1.equals("shubham")) {
                s.set("SHUBHAM MISHRA");
            }
        }
        System.out.println(list);
    }
}
