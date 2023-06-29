package interview.strings.basicprograms;

public class ReveseTheWords {

    public static void main(String[] args) {
        String str = "Nachiket is Thinking";
        System.out.println(reverse("Nachiket is Thinking"));

    }

    public static String reverse(String str) {
        String[] str2 = str.split(" ");
        String test = "";
        for (int i = 0; i< str2.length; i++) {
            for (int j = str2[i].length()-1; j>=0; j--) {
                //System.out.print(str2[i] + " ");
                test += str2[i].charAt(j);
            }
        }

        return test;
    }
}
