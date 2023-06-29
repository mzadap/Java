package interview.strings.NotionInterviewQuestions;

public class EvenOddDigitNumber_NotionTests {

    public static void main(String[] args) {
        int no = 1235;
        int rem, noStore;
        int evenCount = 0;
        int oddCount = 0;
        while (no > 0) {
            rem = no % 10;
            if (rem % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
            no = no/10;
        }
        System.out.println("even count " + evenCount + " \nodd count " + oddCount);

    }
}
