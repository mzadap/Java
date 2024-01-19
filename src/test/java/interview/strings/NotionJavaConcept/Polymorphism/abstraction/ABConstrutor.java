package interview.strings.NotionJavaConcept.Polymorphism.abstraction;

 abstract class ABConstrutor {
    ABConstrutor() {
        System.out.println("this is construtor created");
    }

    abstract void run();
    final void test() {
        System.out.println("This new gear changed");
    }

}
