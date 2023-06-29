package interview.strings.NotionInterviewQuestions;

public class PalidromeNumbers_NotionTests {

    public static void main(String[] args) {
        int no = 121;
        int orgNo = no;
        int rev = 0;
        int no1 = 0;
        while(no > 0) {
            no1 = no % 10;
            rev = (rev * 10) + no1;
            no = no / 10;
        }

        if (rev == orgNo) {
            System.out.println("It is palidrome no " + rev);
        } else {
            System.out.println("It is not palidrome ");
        }
    }
}
