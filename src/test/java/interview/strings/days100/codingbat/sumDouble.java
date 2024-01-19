package interview.strings.days100.codingbat;

public class sumDouble {


    public static void main(String[] args) {
        String st = "refer words";
        //String[] s1 = st.split(" ");
        String st1 = "";
        for (int i = st.length()-1; i>=0; i--) {
            st1 += st.charAt(i);

        }
        System.out.println(st1);
        if (st1.equals(st)) {
            System.out.println("it is palidrome string");
        } else {
            System.out.println("It is not palidrome");
        }


    }


}
