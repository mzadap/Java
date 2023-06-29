package Test.CoreJava.inheritance;

public class Fish extends  Animal{
    private int gills, eye, fins;

    public Fish(int body, int size, int brain, int weight, String name, int gills, int eye, int fins) {
        super(body, size, brain, weight, name);
        this.gills = gills;
        this.eye = eye;
        this.fins = fins;
    }

    private void res() {

    }

    private void moveMuscles() {

    }

    private void moveBackFin() {

    }

    private void swin(int speed) {
        moveMuscles();
        moveBackFin();
        super.move(speed);
    }
}
