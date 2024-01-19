package interview.strings.NotionJavaConcept.Polymorphism.abstraction;

public class Mains extends AbstractionExample {

    @Override
    void run() {
        System.out.println("This is main class");
    }

    public static void main(String[] args) {
        AbstractionExample example = new AbstractionExample() {
            @Override
            void run() {
                System.out.println("THis is inside cons");
            }
        };
        example.run();
        Mains mains = new Mains();
        mains.run();
    }
}
