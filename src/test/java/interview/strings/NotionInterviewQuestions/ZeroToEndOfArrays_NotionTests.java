package interview.strings.NotionInterviewQuestions;

import java.util.ArrayList;
import java.util.List;

public class ZeroToEndOfArrays_NotionTests {

    public static void main(String[] args) {
        int[] test = {10, 20, 0, 45, 0, 23};
        List list = new ArrayList();
        List list1 = new ArrayList();
        for (int i = 0;i< test.length; i++) {
            if (test[i] != 0) {
                list.add(test[i]);
            } else {
                list1.add(test[i]);
            }
        }
        System.out.println(list);
        System.out.println(list1);
        list.addAll(list1);
        System.out.println(list);
    }
}
