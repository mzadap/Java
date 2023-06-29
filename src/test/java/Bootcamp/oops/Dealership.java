package Bootcamp.oops;

import java.util.Arrays;
import java.util.Scanner;

public class Dealership {

    private Car[] cars;
    Scanner sc = new Scanner(System.in);

    public Dealership(Car[] car) {
        this.cars = new Car[car.length];
        for (int i = 0; i< cars.length; i++) {
            this.cars[i] = new Car(car[i]);
        }
        System.out.println(Arrays.toString(this.cars));
    }

    public void setCars(Car cars, int index) {
        this.cars[index] = new Car(cars);
    }

    public Car getCar(int index) {
        return new Car(this.cars[index]);
    }

    public void sellCar(int index) {
        this.cars[index].driver();
        this.cars[index] = null;
    }

    public int searchCar(String make, int budget) {

        for (int i = 0; i < this.cars.length; i++) {
            if (this.cars[i] == null) {
                continue;
            } else if (this.cars[i].getModeName().equals(make) && this.cars[i].getPrice() <= budget) {
                System.out.println( "\n we found on in spot " + i + "\n " + this.cars[i].toString() + "\n Are you instered");
                    return i;

            }
        }
        System.out.println("\nYour search didn't match any results.\n");
        return 404;
    }

    public String toString() {
        String temp = "";
        for (int i = 0; i < this.cars.length; i++) {
            temp += "Parking spot: " + i + "\n";
            if (this.cars[i] == null) {
                temp += "Empty spot\n";
            } else {
                temp += this.cars[i].toString() + "\n";
            }
        }
        return temp;
    }


}

