package interview.strings.arrays;

import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class CurserDemo {

    public static void main(String[] args) {
       /* Vector vector = new Vector();
        for (int i = 2; i<=10; i++) {
            vector.addElement(i);
        }*/

        String s1 = "CALL proc_lov_helper('CostCenter,CostCenter,CostCenter','workday', 'talentlink', '', '', '', 'costcenter for workday system', 'costcenter for open system', 'costcenter for talentlink system', '300900 TOR - Underwriting (EMEA)', '300900 TOR - Underwriting (EMEA)', '300900 TOR - Underwriting EMEA')";
        String[] s2 = s1.split("\\)\"");
        System.out.println("test" + Arrays.toString(s2));
        //System.out.println(vector);
        /*Enumeration enumeration = vector.elements();
        while (enumeration.hasMoreElements()) {
           // System.out.println(enumeration);
            Integer integer = (Integer) enumeration.nextElement();
            System.out.println(integer);
            if (integer%3==0) {
                System.out.println("3 " + integer);
            }
        }*/

        /*Iterator iterator = vector.iterator();
        while (iterator.hasNext()) {
            //System.out.println(iterator.next());
            Integer integer = (Integer) iterator.next();
            System.out.println(integer + " ");
            if (integer % 3 == 0) {
                System.out.println("3 " + integer);
            } else {
                iterator.remove();
            }
        }
        System.out.println("Remove " + vector);*/

    }
}
