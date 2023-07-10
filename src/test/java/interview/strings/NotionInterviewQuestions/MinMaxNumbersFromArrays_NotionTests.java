package interview.strings.NotionInterviewQuestions;

import java.util.Arrays;

public class MinMaxNumbersFromArrays_NotionTests {

    public static void main(String[] args) {
        int[] a = {30, 22, 1, 4, 50, 67, 100, 22};
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        System.out.println(a[a.length-2]);
        System.out.println(a[a.length-1]);
    }
}
