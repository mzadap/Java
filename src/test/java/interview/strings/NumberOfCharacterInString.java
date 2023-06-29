package interview.strings;

public class NumberOfCharacterInString {


    /*
    * Number of character in given string
    * */
    public static void main(String[] args) {
        String s1 = "Nachiketzadap";
        int count = 0;
        System.out.println(s1.length());
        for (int i = 0; i<s1.length(); i++) {
            count++;
        }
        System.out.println(count);

        String s2 = "Hello nice to meet you";
        int count1 = s2.replaceAll(" ", "").length();
        System.out.println(count1);
    }
}
