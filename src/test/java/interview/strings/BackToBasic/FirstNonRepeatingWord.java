package interview.strings.BackToBasic;

public class FirstNonRepeatingWord {
    public static void main(String[] args) {

        String st = "Teeth";
        char[] c = st.toCharArray();
        for (int i = 0; i<c.length; i++) {
            for (int j = i + 1; j< c.length; j++) {
                if (c[i] != c[j]) {

                }
            }
        }
    }
}
