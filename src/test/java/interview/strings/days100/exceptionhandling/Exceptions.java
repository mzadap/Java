package interview.strings.days100.exceptionhandling;

public class Exceptions {

    public static void main(String[] args) {
        try {
            int a = 10/0;
        } /*catch (Exception e) {
            System.out.println(e);
        }*/ finally {
            System.out.println("hello");
        }
    }
}
