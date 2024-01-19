package interview.strings.NotionInterviewQuestions;

import java.util.ArrayList;
import java.util.List;

public class ZerosOnLeft_NotionTests {

    public static void main(String[] args) {
        int[] test = {12, 23,5,0, 12, 0};
        List zeroList = new ArrayList();
        List list = new ArrayList();
        for (int i =0; i< test.length; i++) {
            if (test[i] == 0) {
                zeroList.add(test[i]);
            } else {
                list.add(test[i]);
            }
        }
        /*System.out.println(list);
        System.out.println(zeroList);*/
        //System.out.println(zeroList.addAll(list));
        zeroList.addAll(list);
        System.out.println(zeroList);
    }
}
