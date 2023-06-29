package testing;

import java.util.Scanner;

public class ReadingUserInputChallenge {

    public static void main(String[] args) {
        int no;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println(" Enter Number #" + i);
            boolean hasNext= scanner.hasNextInt();
            if (hasNext) {
                no = scanner.nextInt();
                if (no >0){
                    sum+= no;
                }else {
                    System.out.println("invlaud no");
                }
            }else {
                System.out.println("Invalid Number");
            }
            scanner.nextLine();
        }
        System.out.println(sum);
    }
}
