package Bootcamp.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Filesss {

    public static void main(String[] args) {
        File file = new File("C:\\Users\\nzadap\\Desktop\\personal\\Prpgram\\test.txt");
        int count = 0;
        int charCount = 0;
        try {
            Scanner scanner = new Scanner(new FileInputStream(file));
            while (scanner.hasNext()) {
                String test = scanner.next();
                String[] test2 = test.split(" ");
                count = count + test2.length;
                for (String charCount1 : test2) {
                    charCount += charCount1.length();
                }
            }
            System.out.println(count);
            System.out.println(charCount);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
