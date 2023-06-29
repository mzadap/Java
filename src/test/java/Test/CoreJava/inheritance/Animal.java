package Test.CoreJava.inheritance;



public class Animal {
    private int body, size, brain, weight;
    private String name;

    public Animal(int body, int size, int brain, int weight, String name) {
        this.body = body;
        this.size = size;
        this.brain = brain;
        this.weight = weight;
        this.name = name;
    }

    public void  eat() {
        System.out.println("Animal.eat() is called");
    }

    public void move(int speed) {
        System.out.println("Animal.move() is called" +speed);
    }

    public void behavior() {
        System.out.println("Animal.behavior is called");
    }

    public int getBody() {
        return body;
    }

    public int getSize() {
        return size;
    }

    public int getBrain() {
        return brain;
    }

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }
}
