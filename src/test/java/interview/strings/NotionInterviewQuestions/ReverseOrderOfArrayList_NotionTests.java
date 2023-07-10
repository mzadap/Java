package interview.strings.NotionInterviewQuestions;

import java.util.ArrayList;
import java.util.List;

public class ReverseOrderOfArrayList_NotionTests {

    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(12);
        list.add(3);
        list.add(24);
        list.add(14);
        list.add(10);
        System.out.println(list);
        for (int i = list.size()-1; i>=0 ;i--) {
            System.out.println(list.get(i));
        }

    }
}
