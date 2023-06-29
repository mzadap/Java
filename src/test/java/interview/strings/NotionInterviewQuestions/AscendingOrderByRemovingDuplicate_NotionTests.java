package interview.strings.NotionInterviewQuestions;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Stream;

public class AscendingOrderByRemovingDuplicate_NotionTests {

    public static void main(String[] args) {
        /*
        * Program sorting an array in ascending order by removing duplicates.
        * First approach - using treeset
        * */

        int[] no = {10, 3, 24, 10, 39, 24};
        TreeSet treeSet = new TreeSet();
        for (int i = 0; i<no.length; i++) {
            treeSet.add(no[i]);
        }
        System.out.println(treeSet);



        HashSet set = new HashSet();
        for (int i = 0; i<=no.length-1; i++) {
            set.add(no[i]);
        }

        //System.out.println("setts " + set.stream().sorted().toString());
        HashSet set1 = new HashSet();

        int temp;
        for (int i = 0; i<=no.length-1; i++) {
            for (int j = 0; j<= no.length-1; j++) {
                if (no[i] < no[j]) {
                    temp = no[i];
                    no[i] = no[j];
                    no[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(no));
    }
}
