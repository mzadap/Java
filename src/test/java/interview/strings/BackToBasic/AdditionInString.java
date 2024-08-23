package interview.strings.BackToBasic;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AdditionInString {

    public static void main(String[] args) {


        /*for (int i = 0; i<st.length(); i++) {
            if (Character.isDigit(st.charAt(i))) {
                sum += Character.getNumericValue(st.charAt(i));
            }
        }
        System.out.println(sum);*/

        /*for (char c : st.replaceAll("\\D", "").toCharArray()) {
            int digit = c ;
            sum += digit;
        }
        System.out.println(sum);*/

        /*for (int i = 0; i<st.length(); i++) {
            if (st.charAt(i)>='0' && st.charAt(i) <= '9') {
                sum += (st.charAt(i)-'0');
            }
        }
        System.out.println(sum);*/
        List<Date> ascendingDates = List.of(
                new Date(2023, 12, 1),
                new Date(2023, 2, 1),
                new Date(2023, 3, 1)
        );
        System.out.println("Is ascendingDates sorted in ascending order? " + isAscending(ascendingDates));
    }
    public static boolean isAscending(List<Date> dates) {
        if (dates == null || dates.size() <= 1) {
            return true; // A null or single-element list is considered sorted
        }

        for (int i = 0; i < dates.size() - 1; i++) {
            if (dates.get(i).after(dates.get(i + 1))) {
                return false; // Found a pair out of order
            }
        }

        return true; // No pairs out of order found
    }
}
