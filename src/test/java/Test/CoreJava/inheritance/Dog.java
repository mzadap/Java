package Test.CoreJava.inheritance;

public class Dog extends Animal{

    private int teeth, eye, tail,legs;
    private String coat;

    public Dog(int body, int size, String name, int teeth, int eye, int tail, int legs, String coat) {
        super(body, size, 1, 1, name);
        this.coat = coat;
        this.eye = eye;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
    }

    private void  chew() {
        System.out.println("Dog.chew() is called");
    }

    @Override
    public void eat() {
        System.out.println("Dog.eat() called");
        chew();
        super.eat();
    }

    public void walk() {
        System.out.println("dog.walk called");
        super.move(3);
    }

    public void run() {
        System.out.println("dog.run called");
        move(4);
    }

    private void moveLegs(int speed) {
        System.out.println("dog.moveLegs is called" + speed);
    }

    @Override
    public void move(int speed) {
        System.out.println("dog.move called");
        moveLegs(10);
        super.move(speed);
    }
}
