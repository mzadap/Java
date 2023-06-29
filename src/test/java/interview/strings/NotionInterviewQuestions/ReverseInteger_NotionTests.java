package interview.strings.NotionInterviewQuestions;

public class ReverseInteger_NotionTests {

    public static void main(String[] args) {

        int a = 122;
        int rev = 0, rem = 0;
        while (a >0) {
            rem = a % 10;
            rev = (rev * 10) + rem;
            a = a/10;
        }
        System.out.println(rev);
    }
}
