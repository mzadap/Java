package interview.strings.NotionInterviewQuestions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFileContentThreeMethod_NotionTests {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\\\Users\\\\nzadap\\\\Downloads\\\\Java\\\\Java\\\\src\\\\test\\\\java\\\\resource\\\\Hello.txt");
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
        scanner.close();

    }
}
