package codingchallege;

import java.util.Arrays;

public class MaxandMinArray {

    public static void main(String[] args) {
        String ENDPOINT = "matching/requisitions-candidate/candidate-profile/";

        int[] arr = {3,5,4,1,9};
        int max = 0;
        int min = arr[0];


        for (int i = 0; i< arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }

        System.out.println("maximum numbers is " + min);
    }
}
