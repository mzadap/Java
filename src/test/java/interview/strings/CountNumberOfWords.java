package interview.strings;

public class CountNumberOfWords {

    public static void main(String[] args) {
        String st = "This is good place for coding";
        int count = 1;
        for (int i =0;i<st.length();i++) {
            if (st.charAt(i) == ' ' && st.charAt(i+1)!= ' ' ) {
                count++;
            }
        }
        System.out.println("Number of words in string is:" +count);
    }
}
