package codechef;

import java.util.Scanner;

/*

To calculate Gross salary if salary is less Rs 1500 then HRA = 10% of base salary and DA = 90% of base salary
If his salary is either equal to or above Rs. 1500, then HRA = Rs. 500 and DA = 98% of basic salary.
 */
public class GrossSalary {

    public static void main(String[] args) {

        double salary = 10042;
        double hraOfSalary = salary * 0.10;
        double daOfSalary = salary * 0.98;
        double grossSalary = salary + hraOfSalary + daOfSalary;
        System.out.println(grossSalary);
    }
}
