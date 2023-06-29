package Bootcamp.practice;

import java.util.Arrays;

public class UpdateArrays {
    public static void main(String[] args) {

        int arrays[][] = new int[3][3];
        for (int i = 0; i<arrays.length; i++) {
            for (int j = 0; j<arrays[i].length; j++) {
                System.out.print(arrays[i][j] + " ");
            }
            System.out.println();
        }
       /* String[] restApi = {"Get", "Post", "Put", "Delete"};
        restApi[2] = "Patch";
        System.out.println(Arrays.toString(restApi));

        String restApiDemo[] = new String[6];
        for (int i = 0; i < restApi.length; i++) {
            restApiDemo[i] = restApi[i];
        }
        restApiDemo[4] = "Head";
        restApiDemo[5] = "Copy";
        System.out.println(Arrays.toString(restApiDemo));

        //String[] variable = Arrays.toString(array);*/
/*
        String[] items = {"clock", "table", "ladder", "chair", "oven", "phone"};
        String[] moreItems = new String[6];

        for (int i = (moreItems.length - 1); i >= 1; i--) {
            if (i % 2 != 0) {

                continue;
            }
            moreItems[i] = items[i];

        }*/
       /* System.out.println(Arrays.toString(moreItems));*/
      /*  String[] test1 = {"abc", "xyz", "pqr"};
        String[] test2 = Arrays.copyOf(test1, test1.length);
        test2[1] = "Nice";
        System.out.println(Arrays.toString(test1));
        System.out.println(Arrays.toString(test2));*/
    }
}
