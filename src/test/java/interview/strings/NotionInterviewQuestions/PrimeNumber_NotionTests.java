package interview.strings.NotionInterviewQuestions;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumber_NotionTests {

    public static void main(String[] args) {
        int a = 7;
        int[] ar = {10, 22, 4, 3, 7, 55};
        List list = new ArrayList();
        int count = 0;
        for (int i = 0; i<= ar.length-1; i++) {
            count = 0;
            for (int j = 2; j<ar[i]; j++) {
                if (ar[i] % j == 0) {
                    count++;
                    break;
                } else {
                    list.add(ar[i]);
                    break;
                }
            }

            if (count==0) {
                System.out.println("it is prime no " + ar[i]);
            } else {
                System.out.println("it is not prime no " + ar[i]);
            }
        }
        System.out.println(list);
    }
}
