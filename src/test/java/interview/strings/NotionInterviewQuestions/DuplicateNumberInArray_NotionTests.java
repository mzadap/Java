package interview.strings.NotionInterviewQuestions;

import java.util.ArrayList;
import java.util.List;

public class DuplicateNumberInArray_NotionTests {

    public static void main(String[] args) {

        int[] a = {10, 23, 12, 22, 10, 50, 23, 33};
        List list = new ArrayList();
        for (int i = 0; i<=a.length-1; i++) {
            for (int j = i+1; j<=a.length-1; j++) {
                if (a[i] == a[j]) {
                    list.add(a[j]);
                    System.out.println(a[j]);

                }
            }
        }
        System.out.println(list);
    }
}
