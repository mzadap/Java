package Test.CoreJava;

public class palidrome {
    public static void main(String[] args) {
        String s = "madam";
        String test = "";

        for (int i = s.length() -1; i>=0;i--) {
            System.out.println(i);
            test += s.charAt(i);
        }
        System.out.println(test);
        if (s.equals(test)) {
            System.out.println("It is palidrome");
        }else {
            System.out.println("it is not palidrome");
        }
    }
}
