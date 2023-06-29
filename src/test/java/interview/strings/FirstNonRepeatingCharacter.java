package interview.strings;

public class FirstNonRepeatingCharacter {

    /*
    * First non repeating character in a given string
    * we can use indexOf and lastindexOf
    * */

    public static void main(String[] args) {
        String st = "hhello";
        for (char ch : st.toCharArray()) {
            if (st.indexOf(ch) == st.lastIndexOf(ch)) {
                System.out.println("First non repeating character " + ch);

            }
        }
    }
}
