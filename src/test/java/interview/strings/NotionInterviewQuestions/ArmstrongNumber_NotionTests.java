package interview.strings.NotionInterviewQuestions;

public class ArmstrongNumber_NotionTests {

    public static void main(String[] args) {
        int n = 153;
        int orginalNumber = n;
        int rem, result = 0;
        while (orginalNumber != 0) {
            rem = orginalNumber % 10;
            result += Math.pow(rem, 3);
            orginalNumber /= 10;
        }

        if (result == n) {
            System.out.println("it is Armstrong number ");
        } else {
            System.out.println("It is not armstrong number");
        }
    }
}
