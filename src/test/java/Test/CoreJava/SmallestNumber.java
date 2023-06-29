package Test.CoreJava;

public class SmallestNumber {
    public static void main(String[] args) {

        int abc[][] = {{10,5,4}, {2,6,8}, {9,7,1}};

        int max = abc[0][0];
        for (int i =0;i<abc.length;i++) {
            for (int j=0;j< abc.length;j++) {
                if (abc[i][j] > max) {
                    max = abc[i][j];
                }
            }
        }
        System.out.println(max);
    }
}
