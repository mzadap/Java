package interview.strings;

public class Duplicatess {
    public static void main(String[] args) {
        String s1 = "Hello world";
        char[] c = s1.toCharArray();
        String s2 = "";
        for (int i = c.length-1; i>=0; i--) {
            s2 += c[i];
            System.out.print(c[i] + " ");
        }
        System.out.println();
        System.out.println(s2);
        String[] s3 = s2.split(" ");
        System.out.println(s3.toString());
        for (int i = s3.length-1; i>=0; i--) {
            System.out.print(s3[i] + " ");
        }
        String[] s4 = s1.split(" ");
        String aut = "";
        for (int i = 0; i<s4.length; i++) {
            for (int j = s4[i].length()-1; j>=0; j--) {
                aut += s4[i].charAt(j);
            }
        }
        System.out.println();
        System.out.println(aut);

    }
}
