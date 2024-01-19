package interview.strings.days100.constructor;

public class Examples {
    Examples(int i) {
        System.out.println("Hello this default constructor");
    }

    Examples(Examples examples) {
        System.out.println("This is parameterized constructor");
    }

    public static void main(String[] args) {
        Examples examples = new Examples(new Examples(20));
    }
}
