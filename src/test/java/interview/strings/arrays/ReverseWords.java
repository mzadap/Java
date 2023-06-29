package interview.strings.arrays;

import Bootcamp.workbook.oopsworkbook.Person;

import javax.swing.plaf.SeparatorUI;
import java.util.Arrays;
import java.util.Scanner;

public class ReverseWords {

    public static void main(String[] args) {
        String s1 = "Hello this is nachiket zadap";
        String s3 = "";
        Scanner scanner = new Scanner(s1);
        /*while (scanner.hasNext()) {
            s3 += scanner.next();
        }
        System.out.println(s3);*/

        for (int i = 0; i<s1.length(); i++) {
            if (!s1.equals(" ")) {
                s3 += s1.charAt(i);
            }
        }
        System.out.println(s3);
        String[] s2 = s1.split(" ");
        System.out.println(Arrays.toString(s2));
        for (int i = s2.length-1; i>0; i--) {
            System.out.print(s2[i] + " ");
        }
    }
}
