package Test.CoreJava.Reference;

public class Main {

    public static void main(String[] args) {
        House house = new House("red");
        House house1 = house;

        System.out.println(house.getColor());
        System.out.println(house1.getColor());

        house1.setColor("purple");
        System.out.println(house.getColor());
        System.out.println(house1.getColor());

        House house2 = new House("blue");
        house1 = house2;
        System.out.println(house2.getColor());
        System.out.println(house1.getColor());
        System.out.println(house.getColor());
    }

}
