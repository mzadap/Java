package interview.strings.days100.list;

import java.util.ArrayList;
import java.util.List;

public class CheckPalidromeWithString {

    /*
     * 100 Days challenge, Day 37
     * Date - 07/10/2023
     * Palidrome of string in java program
     * */


    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("abc");
        list.add("refer");
        list.add("test");
        String test = "";
        String test1 = "";
        for (int i =0; i<list.size(); i++) {
            test = "";
            test1 = list.get(i);
            for (int k = test1.length()-1; k>=0; k--) {
                test += String.valueOf(test1.charAt(k));

            }
            if (test.equals(test1)) {
                System.out.println("It is palidrome string " + test);
            } else {
                System.out.println("it is not palidrome string " + test);
            }

        }

    }
}
