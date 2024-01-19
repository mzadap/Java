package interview.strings.NotionInterviewQuestions;

import java.util.ArrayList;
import java.util.List;

public class SumEqualToOne_NotionTests {

    public static void main(String[] args) {
        /*
        * d) Find the sum of the element which have count 1 in array
         * */

        int[] test = {10, 20, 33, 0,1,22};
        List list = new ArrayList();
        for (int i =0; i<test.length; i++) {
            for (int j = i+1; j<test.length; j++) {
                if (test[i] + test[j] == 1) {
                    list.add(test[j]);
                    System.out.println(test[i] + " " + test[j]);
                }
            }
        }
        System.out.println(list);
    }
}
