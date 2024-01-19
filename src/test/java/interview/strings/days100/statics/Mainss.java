package interview.strings.days100.statics;

public class Mainss {

    public static void main(String[] args) {
        Variable variable = new Variable();
        Variable.a = "hello this new string";
        System.out.println(Variable.a);
        variable.a = "test";
        System.out.println(variable.a);
        variable.display();
    }
}
