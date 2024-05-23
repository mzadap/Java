package interview.strings.days100.codingbat.arrays;

public class Characters {

    public static void main(String[] args) {
        String s = "abababd";
        char c = 'b';
        int count =0;
        char[] c1 = s.toCharArray();
        for (int i =0; i<c1.length; i++) {
            if (c==c1[i]) {
                count++;
            }
        }
        if (count==3) {
            System.out.println("Hello ");
        } else {
            System.out.println("Not hello");
        }
    }
}
