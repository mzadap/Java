package Test.CoreJava;

public class maxArray {

    public static void main(String[] args) {
        int abc[][] = {{4,2,9},{7,8,6}, {5,4,1}};

        int min = abc[0][0];
        int mincolumn = 0;

        for (int i =0;i<abc.length;i++) {
            for (int j =0; j < abc.length; j++) {
                if (abc[i][j] < min) {
                    min = abc[i][j];
                }
            }
            mincolumn = i;
        }
        System.out.println(mincolumn);

        int k =0;
        int max = abc[mincolumn][0];
        while (k< abc.length) {
            if (abc[mincolumn][k] > max) {
                max = abc[mincolumn][k];
            }
            k++;
        }
        System.out.println(max);


    }
}
