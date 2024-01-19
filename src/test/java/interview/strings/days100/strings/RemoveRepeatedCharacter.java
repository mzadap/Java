package interview.strings.days100.strings;

public class RemoveRepeatedCharacter {

    /*
     * 100 Days challenge, Day 17
     * Date - 17/09/2023
     *  Java program to replace the string space with a given character.
     * */

    public static void main(String[] args) {
        String s1 = "nachiketani";
        char[] c1 = s1.toCharArray();
        int i, j;
        String s2 = "";
        for ( i = 0; i< c1.length; i++) {
            for ( j = 0; j< i; j++) {
                if (c1[i] == c1[j]) {
                   break;
                }
            }
            if (i==j) {
                s2 += c1[i];
            }
        }
        System.out.println(s2);
    }
}
