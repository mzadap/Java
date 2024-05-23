package interview.strings.days100.codingbat.arrays;

public class OddEvenStrrong {

    public static void main(String[] args) {
        System.out.println(5/2);
        String a = "nachiket";
        String oddString = "";
        String evenString = "";
        char[] c = a.toCharArray();
        for (int i = 0; i<a.length(); i++) {
            if (i%2==0) {
                evenString += c[i];
            } else {
                oddString += c[i];
            }
        }
        System.out.println("even string " + evenString);
        System.out.println("odd string " + oddString);
    }
}
