package interview.strings.days100.constructor;

public class ConstructorOverloading {

    int id, age;
    String name;

    ConstructorOverloading(int i, String n) {
        id = i;
        name = n;
    }

    ConstructorOverloading(int i, String n, int a) {
        id = i;
        age = a;
        name = n;
    }

    void display() {
        System.out.println(id + " " + name + " " + age);
    }

    public static void main(String[] args) {
        ConstructorOverloading overloading1 = new ConstructorOverloading(1, "nachiket");
        ConstructorOverloading overloading2 = new ConstructorOverloading(2, "pooja", 27);
        overloading1.display();
        overloading2.display();
    }
}
