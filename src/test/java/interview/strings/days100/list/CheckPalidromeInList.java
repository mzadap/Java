package interview.strings.days100.list;

import org.w3c.dom.stylesheets.LinkStyle;

import java.util.ArrayList;
import java.util.List;

public class CheckPalidromeInList {

    /*
     * 100 Days challenge, Day 37
     * Date - 07/10/2023
     * Palidrome of number in java program
     * */

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(121);
        list.add(343);
        list.add(444);
        list.add(15);
        int rem = 0, rev = 0, n;
        for (int i = 0; i<list.size(); i++) {
            n = list.get(i);
            rem = 0;
            rev = 0;
            while (n > 0) {
                rev = n % 10;
                rem = rem * 10 + rev;
                n /= 10;
            }

            if (list.get(i) == rem) {
                System.out.println(" it is a palidrome " + list.get(i));
            } else {
                System.out.println(" it is not palidrome " + list.get(i));
            }


        }


    }
}
