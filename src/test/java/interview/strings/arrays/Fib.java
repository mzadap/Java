package interview.strings.arrays;

import java.util.Arrays;
import java.util.HashMap;

public class Fib {

    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int c = 0;
       /* for (int i =0; i<=10; i++) {
            c = a+b;
            System.out.print(a + " ");
            a = b;
            b = c;

        }*/


        System.out.println();
        String s1 = "Nachiket";
        for (int i = s1.length()-1; i>= 0 ; i--) {
            System.out.print(s1.charAt(i));
        }

        System.out.println();
        String c1[] = s1.split("i");
        System.out.println(Arrays.toString(c1));
        String s2 ="";
        for (int i =0; i<=c1.length-2; i++) {
             s2 = c1[i];
        }
        System.out.println(reverse(s2));

        // palindrome
        String s3 = "nachhn";
        String s4 = "";
        for (int i = s3.length()-1; i>= 0; i--) {
            s4 += s3.charAt(i);
        }
        if (s3.equals(s4)) {
            System.out.println("It is palidrome");
        } else {
            System.out.println("Not");
        }

        String s5 = "ababcbz";
        char[] c4 = s5.toCharArray();
        HashMap<String, Integer> map = new HashMap<>();
        int count;
        for (int i =0; i<c4.length; i++) {
            count = 0;
            for (int j = 1; j<c4.length; j++) {
                if (c4[i]==c4[j]) {
                    count++;
                    map.put(String.valueOf(c4[i]), count);
                }
            }
        }
        System.out.println(map);

        String s6 = "APi new things";



    }
    public static String reverse(String s1) {
        String rev = "";
        for (int i = s1.length()-1; i>= 0 ; i--) {
            rev += String.valueOf(s1.charAt(i));
        }
        return rev;
    }
}
