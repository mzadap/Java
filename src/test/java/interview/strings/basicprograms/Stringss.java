package interview.strings.basicprograms;

public class Stringss {

    public static void main(String[] args) {
        String s1 = "Test";
        char[] ch = s1.toCharArray();
        for (int i = 0; i< ch.length; i++) {
            for (int j = i + 1; j< ch.length; j++) {
                if (ch[i] != ch[j]) {
                    System.out.println(ch[i]);
                }
            }

        }
    }
}
