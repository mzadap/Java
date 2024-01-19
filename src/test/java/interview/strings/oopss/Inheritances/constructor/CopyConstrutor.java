package interview.strings.oopss.Inheritances.constructor;

public class CopyConstrutor {


    int id;
    String name;
    CopyConstrutor(int i, String n) {
        id = i;
        name = n;
    }

    CopyConstrutor(CopyConstrutor construtor) {
        id = construtor.id;
        name = construtor.name;
    }
    void display() {
        System.out.println(id +" " + name);
    }

    public static void main(String[] args) {
        CopyConstrutor construtor = new CopyConstrutor(1, "nachiket");
        CopyConstrutor construtor1 = new CopyConstrutor(construtor);
        construtor.display();
        construtor1.display();
    }
}
