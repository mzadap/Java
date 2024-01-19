package interview.strings.days100.constructor;

public class ParameterizedConstrutor {

    int id;
    String name;

    ParameterizedConstrutor(int i, String n) {
        id = i;
        name = n;
    }

    void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {
        ParameterizedConstrutor construtor = new ParameterizedConstrutor(1, "nachiket");
        ParameterizedConstrutor construtor1 = new ParameterizedConstrutor(2, "pooja");
        construtor.display();
        construtor1.display();
    }
}
