package interview.strings.days100.interfaces;

public class SwappingOfTwoNumber {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("a " + a);
        System.out.println("b " + b);
        a = a+b;
        b = a - b;
        a = a - b;
        System.out.println("a "  + a);
        System.out.println("b "  + b);
        String s1 = "Java";
        String s2 = "Java";
        String s3 = new String("Java");
        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
    }
}
