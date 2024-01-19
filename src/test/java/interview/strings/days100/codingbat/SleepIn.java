package interview.strings.days100.codingbat;

public class SleepIn {

    /*
    Day 01 Date - 13-12-2023
    * The parameter weekday is true if it is a weekday,
    * and the parameter vacation is true if we are on vacation.
    * We sleep in if it is not a weekday or we're on vacation.
    * Return true if we sleep in.
    * sleepIn(false, false) → true
    * sleepIn(true, false) → false
    * sleepIn(false, true) → true
    * */
    public static void main(String[] args) {

        System.out.println(sleepIn(false, false));
    }

    public static boolean sleepIn(boolean weekday, boolean vacation) {
        boolean test = false;
        test = true;
        if (!weekday) {
            test= false;
        }
        return test;
    }
}
