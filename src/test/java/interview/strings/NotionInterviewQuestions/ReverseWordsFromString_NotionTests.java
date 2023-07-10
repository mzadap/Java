package interview.strings.NotionInterviewQuestions;

public class ReverseWordsFromString_NotionTests {

    public static void main(String[] args) {
        String s = "Hello this is java worlds";
        String test = "";
        String[] s1 = s.split(" ");
        for (int i = 0; i<s1.length-1; i++) {
            for (int j = s1[i].length()-1; j>=0; j--) {
                test += s1[i].charAt(j);
            }
        }
        System.out.println(test);
    }
}
