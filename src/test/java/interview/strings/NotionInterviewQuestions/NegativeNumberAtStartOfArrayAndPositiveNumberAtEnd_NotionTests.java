package interview.strings.NotionInterviewQuestions;

import java.util.ArrayList;
import java.util.List;

public class NegativeNumberAtStartOfArrayAndPositiveNumberAtEnd_NotionTests {

    public static void main(String[] args) {
        int[] a = {10, -1, 23, -34, 4, -36, -12, 32, 47};
        List rightList = new ArrayList();
        List leftList = new ArrayList();
        for (int i = 0; i< a.length; i++) {
            if (a[i] < 0) {
                rightList.add(a[i]);
            } else {
                leftList.add(a[i]);
            }
        }
        rightList.addAll(leftList);
        System.out.println(rightList);
    }
}
