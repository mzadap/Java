package interview.strings;

import java.util.Arrays;

public class RemoveIntegerFromString {

    public static void main(String[] args) {
        String st = "test12aefsf2323";
        String st1 = "";
        String[] test = st.split("12");
        String test1 = "";
        System.out.println(Arrays.toString(test));
        for (int i = 0;i<test.length;i++) {
            test1 += test[i];
        }
        System.out.println(test1);

        int add = 0;
        for (int i = 0; i<st.length();i++) {
            if (!Character.isDigit(st.charAt(i))) {
                st1 = st1 + st.charAt(i);
            }
        }

        System.out.println(st1);
       /* char[] ch = st1.toCharArray();
        for (int i = 0;i< ch.length;i++) {
            add += ch[i];
        }
        System.out.println(add);*/

       // System.out.println(st.replaceAll("\\d", ""));

    }
}
