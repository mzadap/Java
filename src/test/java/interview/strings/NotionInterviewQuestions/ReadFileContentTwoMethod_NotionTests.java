package interview.strings.NotionInterviewQuestions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileContentTwoMethod_NotionTests {

    public static void main(String[] args) throws IOException {

        /*
         * Using buffered input stream
         * */
        char[] c = new char[37];
        FileReader fileReader = new FileReader("C:\\\\Users\\\\nzadap\\\\Downloads\\\\Java\\\\Java\\\\src\\\\test\\\\java\\\\resource\\\\Hello.txt");
        BufferedReader reader = new BufferedReader(fileReader);

        reader.read(c);
        System.out.println(c);
        reader.close();

    }
}
