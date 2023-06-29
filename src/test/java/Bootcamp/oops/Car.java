package Bootcamp.oops;

import java.util.Arrays;

public class Car {

    private String modeName;
    private int price;
    private String color;
    private int yearOfModel;
    private String[] parts;

    public void setParts(String[] parts) {
        this.parts = parts;
    }

    public String[] getParts() {
        return Arrays.copyOf(this.parts, this.parts.length);
    }

    public Car(String modeName, int price, String color, int yearOfModel, String[] parts) {
        this.modeName = modeName;
        this.price = price;
        this.color = color;
        this.yearOfModel = yearOfModel;
        this.parts = Arrays.copyOf(parts, parts.length);
    }

    public Car(Car source) {
        this.modeName = source.modeName;
        this.price = source.price;
        this.color = source.color;
        this.yearOfModel = source.yearOfModel;
        this.parts = Arrays.copyOf(source.parts, source.parts.length);
    }

    public String getModeName() {
        return modeName;
    }

    public int getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public int getYearOfModel() {
        return yearOfModel;
    }

    public void setModeName(String modeName) {
        this.modeName = modeName;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setYearOfModel(int yearOfModel) {
        this.yearOfModel = yearOfModel;
    }

    public void driver() {
        System.out.println("you bought the beautiful " + this.yearOfModel + " " +
                this.color + " " + this.modeName + " for " + this.price + ".");
        System.out.println("Please drive your car to the nearest exits\n");
    }

    public String toString() {
        return "Make: " + this.modeName + "\n" +
                "price: " + this.price + "\n" +
                "year: " + this.yearOfModel + "\n" +
                "color: " + this.color + "\n" +
                "parts: " + Arrays.toString(parts) + ".\n";
    }
}
