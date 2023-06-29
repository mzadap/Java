package interview.strings.NotionInterviewQuestions;

public class CountSumOfDigit_NotionTests {

    public static void main(String[] args) {
        
        int no = 7890;
        int sum = 0;
        int rem;
        while (no > 0) {
            rem = no % 10;
            sum += rem;
            no = no /10;
        }
        System.out.println(sum);
    }
}
