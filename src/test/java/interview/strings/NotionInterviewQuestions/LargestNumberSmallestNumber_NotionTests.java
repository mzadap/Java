package interview.strings.NotionInterviewQuestions;

import java.util.Arrays;

public class LargestNumberSmallestNumber_NotionTests {

    public static void main(String[] args) {
        int[] test = {10, 0, 2, 44, 55, 26};
        Arrays.sort(test);
        System.out.println(test[test.length-1]);
        System.out.println(test[0]);
    }
}
