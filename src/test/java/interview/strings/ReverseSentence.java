package interview.strings;

import java.util.Arrays;

public class ReverseSentence {

    public static void main(String[] args) {

        /*
        * Reverse the sentence from a given string.
        * */

        String st = "This good place to code in java";
        String[] st1 = st.split(" ");
        System.out.println(Arrays.toString(st1));
        for (int i = st1.length-1; i>=0;i--) {
            System.out.print(st1[i] + " ");
        }
        //String ch = st.replaceAll(" ", "");
       // System.out.println(ch);
        //System.out.println(Arrays.toString(ch));
        /*for (int i = 0; i<ch.;i++) {
            System.out.println(Arrays.toString(ch));
        }*/
    }
}
