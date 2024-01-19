package interview.strings.days100.constructor;

public class DefaultValueConstrutor {

    int id;
    String name;
    void display() {
        System.out.println(name + " " + id);
    }

    public static void main(String[] args) {
        DefaultValueConstrutor valueConstrutor = new DefaultValueConstrutor();
        valueConstrutor.display();
    }
}
