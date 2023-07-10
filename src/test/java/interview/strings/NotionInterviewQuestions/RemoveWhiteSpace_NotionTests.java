package interview.strings.NotionInterviewQuestions;

public class RemoveWhiteSpace_NotionTests {

    public static void main(String[] args) {
        String s = "Nachiket 12B Test";
        s = s.replaceAll(" ", "");
        System.out.println(s);
        String op = "";
        //char c = s.toCharArray();
        for (int i =0 ;i<s.length(); i++) {
            char c = s.charAt(i);
            if (!Character.isWhitespace(c)) {
                op += c;
            }
        }
        System.out.println(op);
    }
}
