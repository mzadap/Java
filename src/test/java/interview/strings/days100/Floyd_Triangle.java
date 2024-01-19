package interview.strings.days100;

public class Floyd_Triangle {

    /*
    * 100 Days challenge, Day 01
    * Date - 01/09/2023
    * Print Floyd’s Triangle in java Program
    * */

    public static void main(String[] args) {
        int k =1;
        for (int i = 1; i<=128; i+=i) {
            k += k;
        }
        System.out.println(k);
    }
}
