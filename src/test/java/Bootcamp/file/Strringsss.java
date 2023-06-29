package Bootcamp.file;

public class Strringsss {

    public static void main(String[] args) {
        String rev = reversr("Geeks");
        System.out.println(rev);
    }

    public static String reversr(String s) {
        String test = "";
        for (int i = s.length()-1; i>=0; i--) {
            test = test + s.charAt(i);
        }
        return test;
    }
}
