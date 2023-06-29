package interview.strings;

public class DuplicateCharacter {

    public static void main(String[] args) {

        //Program for duplicate character in string

        String st = "ababab";
        char[] c = st.toCharArray();
        int count;
        System.out.print("Duplicate character in string are:");
        for (int i = 0;i< c.length;i++) {
            count = 1;
            for (int j = i+1; j<c.length;j++) {
                if (st.charAt(i)==st.charAt(j) && st.charAt(i) != ' ') {
                    count++;
                    System.out.print(st.charAt(j) + " ");
                    break;
                }
            }
        }

       //System.out.println(count);
    }
}
