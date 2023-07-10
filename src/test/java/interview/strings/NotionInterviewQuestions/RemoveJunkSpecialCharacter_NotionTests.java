package interview.strings.NotionInterviewQuestions;

public class RemoveJunkSpecialCharacter_NotionTests {

    public static void main(String[] args) {

        String s = "Nachike@1234abchiKET";
        s = s.replaceAll("[^a-z0-9]+", "");

        System.out.println(s);
    }
}
