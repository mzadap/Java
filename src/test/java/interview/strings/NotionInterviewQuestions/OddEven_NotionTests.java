package interview.strings.NotionInterviewQuestions;

import java.util.ArrayList;
import java.util.List;

public class OddEven_NotionTests {

    public static void main(String[] args) {
        int[] a = {3, 4, 22, 44,23, 9, 10, 11, 21};

        List even = new ArrayList();
        List odd = new ArrayList();
        for (int i =0; i< a.length; i++) {
            if (a[i] % 2 == 0) {
                //System.out.println("Even numbers " + a[i]);
                even.add(a[i]);
            } else {
                //System.out.println("Odd numbers " + a[i]);
                odd.add(a[i]);
            }
        }
        System.out.println("Even numbers " + even);
        System.out.println("Odd numbers " + odd);
    }
}
