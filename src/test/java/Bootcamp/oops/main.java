package Bootcamp.oops;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Car[] cars = new Car[] {
                new Car("Xcent", 70000, "Sliver", 2017, new String[] {"Keys", "Tyre"}),
                new Car("Tata", 800000, "black", 2022, new String[] {"Keys", "Tyre"}),
                new Car("Xcent1", 70000, "Sliver", 2017, new String[] {"tires", "filter"})
        };

        Dealership dealership = new Dealership(cars);
        Scanner sc = new Scanner(System.in);
        System.out.println("\\n ****** JAVA DEALERSHIP! ****** \\n");
        System.out.print("Welcome! Enter the type of car you're looking for: ");
        String make = sc.nextLine();
        System.out.println("ENter your budget: ");
        int budget  = sc.nextInt();
        int result = dealership.searchCar(make, budget);

        switch (result) {
            case 404:
                System.out.println("Feel free to browse through our collection of cars.");
                System.out.println(dealership);
                break;
            default: sc.nextLine();
            String decision = sc.nextLine();
            if (decision.equalsIgnoreCase("yes")) {
                dealership.sellCar(result);
            }

        }


       /* dealership.sellCar(2);
        System.out.println(dealership);*/
        //System.out.println(dealership.getCar(2));
    }
}
