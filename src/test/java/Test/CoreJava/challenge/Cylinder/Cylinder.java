package Test.CoreJava.challenge.Cylinder;

public class Cylinder extends Circle{

    private double height;

    public double getHeight() {
        return height;
    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
        if (this.height < 0 ) {
            this.height = 0;
        }
    }

    public double getVolume() {
        return (height * getArea());
    }


}
