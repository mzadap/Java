package interview.strings.arrays;

public class ArraysInititalization {

    public static void main(String[] args) {
        int[] a = {10, 3, 44, 23};

        /*for (int i = 0; i<a.length;i++) {
            System.out.println(a[i]);
        }*/

        /*for (int ele : a) {
            System.out.println(ele);
        }*/

        int[][] b = new int[3][3];
        b[0][0] = 10;
        b[0][1] = 11;
        b[0][2] = 12;
        b[1][0] = 5;
        b[1][1] = 44;
        b[1][2] = 55;
        b[2][0] = 111;
        b[2][1] = 123;
        b[2][2] = 44;
        int k = 44;

        for (int[] test : b) {
            for (int ele: test) {
                if (ele == k) {
                    ele = 0;

                }
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }
}
