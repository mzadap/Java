package Bootcamp.practice;

import java.util.Arrays;

public class mainss {
    public static void main(String[] args) {
        //System.out.println(validate("AACCC6016B", "29AACCC6016B1Z4"));

       int[] test = {10,50,35,5};
        Arrays.sort(test);
        System.out.println(test[1]);

    }
    public static boolean validate(String pan, String gstin) {

        if (gstin.contains(pan)) {
            return true;
        }return false;
    }
}
