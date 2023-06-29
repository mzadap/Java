package interview.strings.NotionInterviewQuestions;

import java.sql.Array;
import java.util.Arrays;
import java.util.TreeSet;

public class SortArray_NotionTests {

    /*
    * Date - 28/06/2023
    * program to sort array
    * */
    public static void main(String[] args) {
        int[] a = {10, 20, 44, 5, 2, 66};
        int temp;
        //Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        /*for (int i = 0; i<=a.length-1; i++) {
            for (int j = 0; j<=a.length-1; j++) {
                if (a[i] < a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }*/
        TreeSet treeSet = new TreeSet();

        for (int i = 0; i< a.length-1; i++) {
            if (a[i] > a[i+1]) {
                 temp = a[i];
                a[i] = a[i+1];
                a[i+1] = temp;
                i=-1;
            }
        }
        System.out.println(Arrays.toString(a));


    }
}
