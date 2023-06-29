package testing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class testww {

    public static void main(String[] args) {
    /*      String IntegrationNamed[] = {"LinkedIn" , "Integration Automation Testing"};
        List<String > name = new ArrayList<>();
        name.add("LinkedIn");
        name.add("Integration Automation Testing");
        System.out.println(name);
       for (int i = 1; i< name.size();i++){

           System.out.println("Integration name "  + name);
       }*/
 /*    for (int i = 2; i<= 8; i++){

            System.out.println(" 1000 at " + i + " % interest = " + calculateInterest(1000,i));
        }
        System.out.println("************************");
        for (int i = 8; i > 1; i--){

            System.out.println(" 1000 at " + i + " % interest = " + calculateInterest(1000,i));
        }*/
/*        int count = 0;
        for (int i = 2 ; i<= 8 ; i++){
            if (isPrime(i)) {
                count++;
                System.out.println("Number " + i + "is a prime number");
                if (count == 3 ){
                    System.out.println("Exiting for loop");
                    break;
                }
            }
        }*/

        for (int i = 1 ; i < 0 ; i += 2){
            System.out.println("i =" + i);
        }

    }

    public static boolean isPrime(int n){

        if (n == 1) {
            return false;
        }
        for (int i = 2 ; i <= n/2 ; i++){
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }


  public static double calculateInterest(double amount, double interestRate){

        return (amount * (interestRate / 100));
    }
}
