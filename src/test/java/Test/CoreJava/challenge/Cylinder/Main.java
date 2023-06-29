package Test.CoreJava.challenge.Cylinder;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(4.0);
        System.out.println(circle.getArea());
        System.out.println(circle.getRadius());

        Cylinder cylinder = new Cylinder(5, 2);
        System.out.println("cylinder " + cylinder.getHeight());
        System.out.println("cylinder " + cylinder.getVolume());
        System.out.println("cylinder " + cylinder.getArea());
        System.out.println("cylinder " + cylinder.getRadius());
    }
}
