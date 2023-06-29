package interview.strings.NotionInterviewQuestions;

public class PalidromeString_NotionTests {

    public static void main(String[] args) {
        String s = "refer";
        String s1 = "";
        char[] c = s.toCharArray();
        for (int i = c.length-1; i>=0; i--) {
            s1 += c[i];
        }
        System.out.println(s1);
        if (s.equals(s1)) {
            System.out.println("It is palidrome string ");
        } else {
            System.out.println("it is not palidrome string");
        }
    }
}
