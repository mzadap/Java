package interview.strings.arrays;

import java.util.*;

public class test {

    public static void main(String[] args) {
        String s = "Nachiket Zadap Anuradha";
        String s1 = s.replaceAll(" ", "");
        System.out.println(s1);
        char[] c = s1.toCharArray();
        int count = 0;
        System.out.println(Arrays.toString(c));
        System.out.println(c.length);
        for (int i = 0; i<c.length; i++) {
            count = 1;
            for (int j = 1; j< c.length; j++) {
                if (c[i]==c[j]) {
                    count++;
                    c[j] = '0';
                    //System.out.print(c[j] + " ");
                    //break;
                }
            }
            if (count>1 && c[i]!='0') {
                System.out.println(c[i]);
            }
        }


    }
}
