package interview.strings.BackToBasic;

import java.util.ArrayList;
import java.util.List;

public class AdditionInString {

    public static void main(String[] args) {

        String st = "abc13ab12";
        int sum = 0;
        /*for (int i = 0; i<st.length(); i++) {
            if (Character.isDigit(st.charAt(i))) {
                sum += Character.getNumericValue(st.charAt(i));
            }
        }
        System.out.println(sum);*/

        for (char c : st.replaceAll("\\D", "").toCharArray()) {
            int digit = c ;
            sum += digit;
        }
        System.out.println(sum);
        /*for (int i = 0; i<st.length(); i++) {
            if (st.charAt(i)>='0' && st.charAt(i) <= '9') {
                sum += (st.charAt(i)-'0');
            }
        }
        System.out.println(sum);*/

    }
}
