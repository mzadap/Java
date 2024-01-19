package interview.strings.days100.codingbat;

public class ParrotTrouble {

    /*
     * 100 Days challenge, Day 63
     * Date - 21/11/2023
     * Program when parrot is trobling
     * */

    public static void main(String[] args) {


        System.out.println(parrotTrouble(true, 7));
    }

    public static boolean parrotTrouble(boolean talking, int hour) {
        //if (t)
        boolean abc = false;
        if (!talking) {
            abc= false;
        } else if (hour <= 7 || hour > 20){
            abc= true;
        }
        return abc;
    }
}
