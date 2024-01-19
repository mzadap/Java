package interview.strings.days100;

import java.sql.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class DateTime {

    /*
     * 100 Days challenge, Day 08
     * Date - 08/09/2023
     * 53. How to print date and time in java Program
     * */

    public static void main(String[] args) {
        long l = System.currentTimeMillis();
        Date date = new Date(l);
        System.out.println(date);

        int day, month, year;
        GregorianCalendar calendar = new GregorianCalendar();
        day = calendar.get(Calendar.DAY_OF_MONTH);
        month = calendar.get(Calendar.MONTH);
        year = calendar.get(Calendar.YEAR);
        System.out.println(day + "/" + month + "/" +  year );
    }
}
