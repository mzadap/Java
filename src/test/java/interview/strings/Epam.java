package interview.strings;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Epam {

    public static void main(String[] args) {
     /*   int[] a = {10, 8, 1,5,2,9};
        int temp = 0;
        for(int i = 0; i< a.length; i++) {
            for (int j = i; j< a.length; j++) {
                if (a[i] < a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(a));
        System.out.println(a[1]);

        String s1 = "Hello java Program java";
        char[] c1 = s1.toCharArray();
        System.out.println("Hello " + Arrays.toString(c1));
        String[] s2 = s1.split(" ");
        System.out.println(s2.length);
        System.out.println(Arrays.toString(s2));
        int count = 1;
        for (int i = 0; i<c1.length;i++) {
            if (c1[i] == ' ' && c1[i+1] != ' ') {
                count++;
            }
        }
        int dup = 0;
        System.out.println("No of words " + count);
        for (int i = 0; i< s2.length; i++) {
            for (int j = i+1; j< s2.length; j++) {
                if (s2[i].equals(s2[j])) {
                    System.out.println(s2[j]);
                    dup++;
                }
            }
        }
        System.out.println("no of duplicates " + dup);

        int[] b = {12, 3, 5, 9, 12, 5};
        Set set = new HashSet();
        for (int i = 0; i<b.length; i++) {
            set.add(b[i]);
        }
        System.out.println(set);*/

        int[] c = {16, 9, 18, 17, 21, 15};
        for (int i = 1; i<c.length;i++) {
            if (c[i] >= c[i-1] && c[i] >= c[i+1]) {
                System.out.println(c[i]);
            }
        }
        String s1 = "Hello all this is java program";
        char[] c1 = s1.toCharArray();
        String[] s2 = s1.split(" ");
        for (int i = s2.length-1; i>=0; i--) {
            System.out.print(s2[i] + " ");
        }
        System.out.println();
        String s4 = new String("New world");
        String s5 = "New world";
        if (s4==s5) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

        if (s4.equals(s5)) {
            System.out.println("it is equal");
        } else {
            System.out.println("it is not equal");
        }



    }
}
