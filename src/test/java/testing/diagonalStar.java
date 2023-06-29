package testing;


public class diagonalStar {
    public static void main(String[] args) {
        printSquareStar(6);
    }

    public static void printSquareStar(int no) {

        if (no < 5) {
            System.out.println("Invalid Value");
        }else {
            for (int i = 0 ; i< no; i++) {
                for (int j = 0; j<no; j++) {
                    if (i==0 || i==no-1 || j==0 || j==no-1 || j==i || j==no-1-i){
                        System.out.print("*");
                    }else {
                        System.out.println(" ");
                    }
                }
                System.out.println("");
            }

        }
    }
}
