package interview.strings.days100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseStrings {

    /*
     * 100 Days challenge, Day 02
     * Date - 02/09/2023
     * 30. Print reverse string in java Program
     * */

    public static void main(String[] args) {
        String s1 = "nachiket";
        for (int i = s1.length()-1; i>=0; i--) {
            System.out.print(s1.charAt(i) + " ");
        }
        System.out.println();
        String s2 = "nachiket zadap";
        String[] s3 = s2.split(" ");
        System.out.println(Arrays.toString(s3));

        List list = new ArrayList();
        for (int i = 0;i< s3.length; i++) {
            //System.out.println(s3[i]);
            for (int j = s3[i].length()-1; j>=0; j--) {
                list.add(s3[i].charAt(j));
                System.out.print(s3[i].charAt(j) + " ");
            }
        }
        System.out.println();
        System.out.println(list);
    }
}
