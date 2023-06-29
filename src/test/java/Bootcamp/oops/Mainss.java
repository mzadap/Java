package Bootcamp.oops;

import java.util.Arrays;

public class Mainss {

    public static void main(String[] args) {
        Dessert cake = new Dessert(4.99);

        System.out.println(Arrays.toString(cake.getIngredients()));

        cake.setIngredients(new String[]{"Egg", "Flower", "powder"});

        String[] test = cake.getIngredients();
        test[2] = "filling";

        Dessert pie = new Dessert(cake);

        System.out.println(Arrays.toString(cake.getIngredients()));
        System.out.println(Arrays.toString(pie.getIngredients()));
    }
}
