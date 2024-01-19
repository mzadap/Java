package interview.strings.days100.codingbat.stringss;

public class Middletwp {

    public static void main(String[] args) {

        System.out.println(middle("string"));
    }

    static String middle(String st) {
        int length = st.length();

        // Ensure the string has an even length
        if (length % 2 == 0 && length >= 2) {
            // Calculate the indices of the middle two characters
            int middle1 = length / 2 - 1;
            int middle2 = length / 2;

            // Extract the middle two characters
            return st.substring(middle1, middle2 + 1);
        }
        else {
            // Handle the case where the string doesn't have an even length
            throw new IllegalArgumentException("Input string must have an even length and be at least 2 characters long.");
        }
       /* char[] c = st.toCharArray();
        int le = c.length /2;
        return c[le-1] +""+ c[le];*/
    }
}
