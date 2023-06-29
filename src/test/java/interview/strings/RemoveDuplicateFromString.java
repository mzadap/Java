package interview.strings;

public class RemoveDuplicateFromString {

    public static void main(String[] args) {
        /*
        * Remove duplicate from string
        * */

        String st = "Hello";
       // String[] st1 = st;
        char[] ch = st.toCharArray();
        int i,j;
        String st1 = "";
        for ( i = 0;i< ch.length;i++) {
            for ( j = 0; j< i; j++) {
                if (ch[i]==ch[j]) {
                    break;
                }
            }
            if (i==j) {
                st1 += ch[j];
            }

        }
        System.out.println(st1);

    }




}
