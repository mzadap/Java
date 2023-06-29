package Test.CoreJava;

public class testArrays {

    public static void main(String[] args) {
        int a[][] = new int[2][3];
        a[0][0] = 1;
        a[0][1] = 2;
        a[0][2] = 4;
        a[1][0] = 8;
        a[1][1] = 9;
        a[1][2] = 5;

        for (int i=0;i<a.length;i++) {
            for (int j=0; j<a.length+1;j++) {
                System.out.println(a[i][j]);
            }
        }
    }
}
