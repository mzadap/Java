package interview.strings.baiscs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ClosedPositionToZero {

    public static void main(String[] args) {
        int[] a = {-5, -6, -7, 45, 54, 21, 9, 7, 76, -3, 3};
        List negativeNumber = new ArrayList();
        List positiveNu = new ArrayList();
        for (int i = 0; i<a.length; i++) {
            if (a[i]>0) {
                positiveNu.add(a[i]);
            } else {
                negativeNumber.add(a[i]);
            }
        }
        System.out.println(positiveNu);
        Collections.sort(positiveNu);
        System.out.println(positiveNu);
        System.out.println(positiveNu.get(0));
    }
}
