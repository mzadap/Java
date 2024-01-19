package interview.strings.days100.strings;

public class CharacterIdentify {

    /*
     * 100 Days challenge, Day 14
     * Date - 14/09/2023
     *  Java program to check given character is digit or not.
     * */

    public static void main(String[] args) {
        String s1 = "nach12zaa3345";
        //s1.split(~a-z)
        char[] c1 = s1.toCharArray();
        int count = 0;
        for (int i =0; i< c1.length; i++) {
            /*if (c1[i] >= '0' && c1[i] <= '9') {
                System.out.println("digits " + c1[i]);
            }*/
            if (Character.isDigit(c1[i])) {
                System.out.println("digits " + c1[i]);
            }
        }
    }
}
